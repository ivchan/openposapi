package com.opencloud.openposapi.controllers;

import com.opencloud.openposapi.entities.Customer;
import com.opencloud.openposapi.entities.Member;
import com.opencloud.openposapi.entities.ProductType;
import com.opencloud.openposapi.services.CustomerService;
import com.opencloud.openposapi.services.MemberService;
import com.opencloud.openposapi.services.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

/**
 * Created by ivanchan on 10/1/2017.
 */
@RestController
public class InitialDBController {
    private MemberService memberServ;
    private ProductTypeService productTypeServ;
    private CustomerService customerServ;

    @Autowired
    public InitialDBController(
            MemberService memberServ,
            ProductTypeService productTypeServ,
            CustomerService customerServ
    ) {
        this.memberServ = memberServ;
        this.productTypeServ = productTypeServ;
        this.customerServ = customerServ;
    }

    @RequestMapping(value = "/initial", method = RequestMethod.POST)
    public void initial() {
        Member memberDev = new Member();
        memberDev.setMemberKey(UUID.fromString("eb37f498-7ce7-4ec0-8e14-221cb6c5ad26"));
        memberDev.setMemberCode("DEV");
        memberDev.setMemberName("Developer");
        memberDev.setJoinDate(new Date());
        memberDev.setRegisterEmail("29january@gmail.com");
        memberDev.setRegisterPwd("p@ssw0rd");
        memberDev.setRemarks("testing");
        memberServ.addMember(memberDev);

        ProductType typeFood = new ProductType();
        typeFood.setProductTypeKey(UUID.fromString("aac178cc-1dd9-4171-9f59-9857405d7ecf"));
        typeFood.setProductTypeName("Food");
        typeFood.setDescription("Food");
        productTypeServ.addProductType(typeFood);

        ProductType typeFashion = new ProductType();
        typeFashion.setProductTypeKey(UUID.fromString("6dc0c9c4-1f92-4913-97a6-ecc12ac21709"));
        typeFashion.setProductTypeName("Fashion");
        typeFashion.setDescription("Fashion");
        productTypeServ.addProductType(typeFashion);

        Customer customer1 = new Customer();
        customer1.setCustomerKey(UUID.fromString("3edf47fb-06b7-46dc-bb19-bf0109b6e14c"));
        customer1.setCustomerCode("Demo");
        customer1.setCustomerCode("ALL");
        customer1.setWebSite("http://www.demo.com");
        customer1.setSex("M");
        customer1.setFaxNo("");
        customer1.setFirstName("Demo");
        customer1.setLastName("User");
        customer1.setCompanyName("Demo Corp");
        customer1.setDateOfBirth(new Date());
        customer1.setEmailAddress("me@demo.com");
        customer1.setHomeAddr1("");
        customer1.setHomeAddr2("");
        customer1.setHomeAddr3("");
        customer1.setHomeAddr4("");
        customer1.setMobileNo("");
        customer1.setPhoneNo("");
        customer1.setPostAddr1("");
        customer1.setPostAddr2("");
        customer1.setPostAddr3("");
        customer1.setPostAddr4("");
        customer1.setTwitterName("");
        customer1.setInstagramName("");
        customer1.setRemarks("");
        customer1.setCustomerGroup(UUID.fromString("558ea73e-5dba-4d9c-90fb-36a26ede2ec2"));
        customer1.setMemberKey(memberDev.getMemberKey());
        customerServ.addCustomer(customer1);
    }
}
