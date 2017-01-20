package com.opencloud.openposapi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * Created by ivanchan on 11/1/2017.
 */
@Entity
@Table(name = "pos_customer_group")
public class CustomerGroup implements Serializable{
    @Id
    @Column(name = "customer_group_key")
    private UUID customerGroupKey;

    @Column(name = "group_name", length = 100, nullable = false)
    private String customerGroupName;

    @ManyToOne
    @JoinColumn(name = "member_key")
    private Member member;

    @Version
    @JsonIgnore
    @Column(name = "last_updated_time")
    private Date updatedTime;

    public UUID getCustomerGroupKey() {
        return customerGroupKey;
    }

    public void setCustomerGroupKey(UUID customerGroupKey) {
        this.customerGroupKey = customerGroupKey;
    }

    public String getCustomerGroupName() {
        return customerGroupName;
    }

    public void setCustomerGroupName(String customerGroupName) {
        this.customerGroupName = customerGroupName;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
