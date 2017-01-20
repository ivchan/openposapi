package com.opencloud.openposapi.controllers;

import com.opencloud.openposapi.entities.Member;
import com.opencloud.openposapi.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * Created by ivanchan on 20/1/2017.
 */

@RestController
public class MemberController extends ApiController {
    private MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @RequestMapping(value = "/member", method = RequestMethod.GET)
    public ResponseEntity<List<Member>> listUser() {
        List<Member> lstUsers = this.memberService.listMembers();
        return new ResponseEntity<>(lstUsers, HttpStatus.OK);
    }

    @RequestMapping(value = "/member/{id}", method = RequestMethod.GET)
    public ResponseEntity<Member> getUser(@PathVariable("id")UUID userKey){
        Member user = this.memberService.getMember(userKey);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(value = "/member", method = RequestMethod.POST)
    public ResponseEntity<Member> addUser(@RequestBody Member user) {
        Member savedUser = this.memberService.addMember(user);
        return new ResponseEntity<>(savedUser, HttpStatus.OK);
    }

    @RequestMapping(value = "/member/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Member> updateUser(@PathVariable("id")UUID memberKey, @RequestBody Member member) {
        Member savedMember = this.memberService.updateMember(memberKey, member);
        return new ResponseEntity<>(savedMember, HttpStatus.OK);
    }
}
