package com.opencloud.openposapi.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

/**
 * Created by ivanchan on 1/7/17.
 */

@Entity
@Table(name = "pos_member")
public class Member {
    @Id
    @Column(name = "member_key")
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private UUID memberKey;
    @Column(name = "member_name", length = 100, nullable = false)
    private String memberName;
    @Column(name = "join_date")
    private Date joinDate;
    @Column(name = "member_code", length = 20, nullable = false)
    private String memberCode;
    @Column(name = "register_email", length = 100, nullable = false)
    private String registerEmail;
    @Column(name = "register_pwd", length = 20, nullable = false)
    private String registerPwd;
    @Column(name = "register_remarks", length = 200, nullable = false)
    private String remarks;
    @Version
    @Column(name = "last_updated_time")
    private Date updatedTime;

    public Member() {
        this.memberKey = null;
        this.memberName = "";
        this.joinDate = null;
        this.memberCode = "";
        this.registerEmail = "";
        this.registerPwd = "";
        this.remarks = "";
        this.updatedTime = null;
    }

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

    public String getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode;
    }

    public String getRegisterEmail() {
        return registerEmail;
    }

    public void setRegisterEmail(String registerEmail) {
        this.registerEmail = registerEmail;
    }

    public String getRegisterPwd() {
        return registerPwd;
    }

    public void setRegisterPwd(String registerPwd) {
        this.registerPwd = registerPwd;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}
