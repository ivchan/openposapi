package com.opencloud.openposapi.services;

import com.opencloud.openposapi.entities.Member;

import java.util.List;
import java.util.UUID;

/**
 * Created by ivanchan on 10/1/2017.
 */
public interface MemberService {
    Member getMember(UUID memberKey);
    List<Member> listMembers();
    Member addMember(Member member);
    Member updateMember(Member member);
    void deleteMember(UUID memberKey);
}
