package com.opencloud.openposapi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * Created by ivanchan on 8/1/2017.
 */

@Entity
@Table(name = "pos_sales_person")
public class SalesPerson implements Serializable{
    @Id
    @Column(name = "sales_person_key")
    private UUID salesPersonKey;

    @ManyToOne
    @JoinColumn(name = "member_key")
    private Member member;

    @Version
    @JsonIgnore
    @Column(name = "last_updated_time")
    private Date updatedTime;

    public UUID getSalesPersonKey() {
        return salesPersonKey;
    }

    public void setSalesPersonKey(UUID salesPersonKey) {
        this.salesPersonKey = salesPersonKey;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}
