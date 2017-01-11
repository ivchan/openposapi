package com.opencloud.openposapi.controllers;

import com.opencloud.openposapi.entities.Member;
import com.opencloud.openposapi.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

/**
 * Created by ivanchan on 10/1/2017.
 */
@RestController
public class InitialDBController {
    @Autowired
    private MemberService memberServ;

    @RequestMapping(value = "/initial", method = RequestMethod.POST)
    public void initial() {
        Member memberDev = new Member();
        memberDev.setMemberKey(UUID.fromString("eb37f498-7ce7-4ec0-8e14-221cb6c5ad26"));
        memberDev.setMemberCode("DEV");
        memberDev.setMemberName("Developer");
        memberDev.setJoinDate(new Date());
        memberDev.setRegisterEmail("29january@gmail.com");
        memberDev.setRegisterPwd("p@ssw0rd");
        memberDev.setRemarks("testing");
        memberServ.addMember(memberDev);
    }
}
