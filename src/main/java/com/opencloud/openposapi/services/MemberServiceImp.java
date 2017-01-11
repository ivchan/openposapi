package com.opencloud.openposapi.services;

import com.opencloud.openposapi.entities.Member;
import com.opencloud.openposapi.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by ivanchan on 10/1/2017.
 */
@Service("MemberService")
public class MemberServiceImp implements MemberService {
    @Autowired
    private MemberRepository memberRepo;

    @Override
    public Member getMember(UUID memberKey) {
        return memberRepo.findOne(memberKey);
    }

    @Override
    public List<Member> listMembers() {
        return memberRepo.findAll();
    }

    @Override
    public Member addMember(Member member) {
        return memberRepo.save(member);
    }

    @Override
    public Member updateMember(Member member) {
        return memberRepo.save(member);
    }

    @Override
    public void deleteMember(UUID memberKey) {
        memberRepo.delete(memberKey);
    }
}
