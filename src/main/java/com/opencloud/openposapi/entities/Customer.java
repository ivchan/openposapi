package com.opencloud.openposapi.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

/**
 * Created by ivanchan on 8/1/2017.
 */

@Entity
@Table(name = "pos_customer")
public class Customer {
    @Id
    @Column(name = "customer_key")
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private UUID customerKey;
    @Column(name = "member_key", nullable = false)
    private UUID memberKey;
    @Column(name = "first_name", length = 100, nullable = false)
    private String firstName;
    @Column(name = "last_name", length = 100, nullable = false)
    private String lastName;
    @Column(name = "company_name", length = 100)
    private String companyName;
    @Column(name = "customer_code", length = 20, nullable = false)
    private String customerCode;
    @Column(name = "customer_group")
    private UUID customerGroup;
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    @Column(name = "sex", length = 5, nullable = false)
    private String sex;
    @Column(name = "contact_phone", length = 100)
    private String phoneNo;
    @Column(name = "contact_mobile", length = 100)
    private String mobileNo;
    @Column(name = "contact_fax", length = 100)
    private String faxNo;
    @Column(name = "contact_email", length = 100)
    private String emailAddress;
    @Column(name = "contact_website", length = 100)
    private String webSite;
    @Column(name = "contact_twitter", length = 100)
    private String twitterName;
    @Column(name = "contact_instagram", length = 100)
    private String instagramName;
    @Column(name = "home_address_1", length = 200)
    private String homeAddr1;
    @Column(name = "home_address_2", length = 200)
    private String homeAddr2;
    @Column(name = "home_address_3", length = 200)
    private String homeAddr3;
    @Column(name = "home_address_4", length = 200)
    private String homeAddr4;
    @Column(name = "post_address_1", length = 200)
    private String postAddr1;
    @Column(name = "post_address_2", length = 200)
    private String postAddr2;
    @Column(name = "post_address_3", length = 200)
    private String postAddr3;
    @Column(name = "post_address_4", length = 200)
    private String postAddr4;
    @Column(name = "remarks", length = 255)
    private String remarks;
    @Version
    @Column(name = "last_updated_time")
    private Date updatedTime;

    public Customer() {
        this.customerKey = null;
        this.firstName = "";
        this.lastName = "";
        this.companyName = "";
        this.memberKey = null;
        this.dateOfBirth = null;
        this.customerGroup = null;
        this.phoneNo = "";
        this.mobileNo = "";
        this.faxNo = "";
        this.emailAddress = "";
        this.twitterName = "";
        this.instagramName = "";
        this.homeAddr1 = "";
        this.homeAddr2 = "";
        this.homeAddr3 = "";
        this.homeAddr4 = "";
        this.postAddr1 = "";
        this.postAddr2 = "";
        this.postAddr3 = "";
        this.postAddr4 = "";
        this.remarks = "";
        this.updatedTime = null;
    }

    public UUID getCustomerKey() {
        return customerKey;
    }

    public void setCustomerKey(UUID customerKey) {
        this.customerKey = customerKey;
    }

    public UUID getMemberKey() {
        return memberKey;
    }

    public void setMemberKey(UUID memberKey) {
        this.memberKey = memberKey;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public UUID getCustomerGroup() {
        return customerGroup;
    }

    public void setCustomerGroup(UUID customerGroup) {
        this.customerGroup = customerGroup;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getFaxNo() {
        return faxNo;
    }

    public void setFaxNo(String faxNo) {
        this.faxNo = faxNo;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getTwitterName() {
        return twitterName;
    }

    public void setTwitterName(String twitterName) {
        this.twitterName = twitterName;
    }

    public String getInstagramName() {
        return instagramName;
    }

    public void setInstagramName(String instagramName) {
        this.instagramName = instagramName;
    }

    public String getHomeAddr1() {
        return homeAddr1;
    }

    public void setHomeAddr1(String homeAddr1) {
        this.homeAddr1 = homeAddr1;
    }

    public String getHomeAddr2() {
        return homeAddr2;
    }

    public void setHomeAddr2(String homeAddr2) {
        this.homeAddr2 = homeAddr2;
    }

    public String getHomeAddr3() {
        return homeAddr3;
    }

    public void setHomeAddr3(String homeAddr3) {
        this.homeAddr3 = homeAddr3;
    }

    public String getHomeAddr4() {
        return homeAddr4;
    }

    public void setHomeAddr4(String homeAddr4) {
        this.homeAddr4 = homeAddr4;
    }

    public String getPostAddr1() {
        return postAddr1;
    }

    public void setPostAddr1(String postAddr1) {
        this.postAddr1 = postAddr1;
    }

    public String getPostAddr2() {
        return postAddr2;
    }

    public void setPostAddr2(String postAddr2) {
        this.postAddr2 = postAddr2;
    }

    public String getPostAddr3() {
        return postAddr3;
    }

    public void setPostAddr3(String postAddr3) {
        this.postAddr3 = postAddr3;
    }

    public String getPostAddr4() {
        return postAddr4;
    }

    public void setPostAddr4(String postAddr4) {
        this.postAddr4 = postAddr4;
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
