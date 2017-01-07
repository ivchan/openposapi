package com.opencloud.openposapi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

/**
 * Created by ivanchan on 1/7/17.
 */

@Entity
public class Member {
    @Id
    @Column(name = "member_key")
    private UUID memberKey;
    @Column(name = "member_name", length = 100, nullable = false)
    private String memberName;
    @Column(name = "join_date", nullable = true)
    private Date joinDate;

    public UUID getMemberKey() {
        return memberKey;
    }

    public void setMemberKey(UUID memberKey) {
        this.memberKey = memberKey;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
}
