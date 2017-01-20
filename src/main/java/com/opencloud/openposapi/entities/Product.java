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
@Table(name = "pos_product")
public class Product implements Serializable{
    @Id
    @Column(name = "product_key")
    private UUID productKey;

    @Column(name = "production_name", length = 100, nullable = false)
    private String productName;

    @Column(name = "product_identify_code", length = 20, nullable = false)
    private String productIdentifyCode;

    @Column(name = "description", length = 200, nullable = false)
    private String description;

    @Column(name = "product_type", length = 100)
    private String productType;

    @Column(name = "brand_key")
    private UUID brandKey;

    @Column(name = "supplier_key")
    private UUID supplierKey;

    @ManyToOne
    @JoinColumn(name = "member_key")
    private Member member;

    @Version
    @JsonIgnore
    @Column(name = "last_updated_time")
    private Date updatedTime;

    public UUID getProductKey() {
        return productKey;
    }

    public void setProductKey(UUID productKey) {
        this.productKey = productKey;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductIdentifyCode() {
        return productIdentifyCode;
    }

    public void setProductIdentifyCode(String productIdentifyCode) {
        this.productIdentifyCode = productIdentifyCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public UUID getBrandKey() {
        return brandKey;
    }

    public void setBrandKey(UUID brandKey) {
        this.brandKey = brandKey;
    }

    public UUID getSupplierKey() {
        return supplierKey;
    }

    public void setSupplierKey(UUID supplierKey) {
        this.supplierKey = supplierKey;
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
