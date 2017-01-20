package com.opencloud.openposapi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * Created by ivanchan on 9/1/2017.
 */
@Entity
@Table(name = "pos_product_type")
public class ProductType implements Serializable{
    @Id
    @Column(name = "product_type_key")
    private UUID productTypeKey;

    @Column(name = "product_type_name", nullable = false)
    private String productTypeName;

    @Column(name = "description", nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "member_key")
    private Member member;

    @Version
    @JsonIgnore
    @Column(name = "last_updated_time")
    private Date updatedTime;

    public ProductType() {
        this.productTypeKey = null;
        this.productTypeName = "";
        this.description = "";
        this.updatedTime = null;
    }

    public UUID getProductTypeKey() {
        return productTypeKey;
    }

    public void setProductTypeKey(UUID productTypeKey) {
        this.productTypeKey = productTypeKey;
    }

    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
