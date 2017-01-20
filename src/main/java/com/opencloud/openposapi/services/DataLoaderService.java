package com.opencloud.openposapi.services;

import com.opencloud.openposapi.entities.Customer;
import com.opencloud.openposapi.entities.Member;
import com.opencloud.openposapi.entities.ProductType;
import com.opencloud.openposapi.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

/**
 * Created by ivanchan on 19/1/2017.
 */

@Component
public class DataLoaderService implements ApplicationRunner {
    private MemberService memberService;
    private ProductTypeService productTypeService;
    private CustomerService customerService;
    private UserService userService;

    @Autowired
    public DataLoaderService(
            MemberService memberService,
            ProductTypeService productTypeService,
            CustomerService customerService,
            UserService userService) {
        this.memberService = memberService;
        this.productTypeService = productTypeService;
        this.customerService = customerService;
        this.userService = userService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Member memberDev = new Member();
        memberDev.setMemberKey(UUID.fromString("eb37f498-7ce7-4ec0-8e14-221cb6c5ad26"));
        memberDev.setMemberCode("DEV");
        memberDev.setMemberName("Developer");
        memberDev.setJoinDate(new Date());
        memberDev.setRegisterEmail("29january@gmail.com");
        memberDev.setRegisterPwd("p@ssw0rd");
        memberDev.setRemarks("testing");
        memberService.addMember(memberDev);

        ProductType typeFood = new ProductType();
        typeFood.setProductTypeKey(UUID.fromString("aac178cc-1dd9-4171-9f59-9857405d7ecf"));
        typeFood.setProductTypeName("Food");
        typeFood.setDescription("Food");
        productTypeService.addProductType(typeFood);

        ProductType typeFashion = new ProductType();
        typeFashion.setProductTypeKey(UUID.fromString("6dc0c9c4-1f92-4913-97a6-ecc12ac21709"));
        typeFashion.setProductTypeName("Fashion");
        typeFashion.setDescription("Fashion");
        productTypeService.addProductType(typeFashion);

        User userA = new User();
        userA.setUserKey(UUID.fromString("40e47dce-79a4-487b-a6e1-e1096715eaec"));
        userA.setUserName("Ivan Chan");
        userA.setMember(memberDev);
        userA.setJoinDate(new Date());
        userA.setLoginID("ivanchan");
        userService.addUser(userA);

        User userB = new User();
        userB.setUserKey(UUID.fromString("65bf5a8e-cd15-47a2-8df7-9c269d80ba4d"));
        userB.setUserName("Chris Lee");
        userB.setMember(memberDev);
        userB.setJoinDate(new Date());
        userB.setLoginID("chrislee");
        userService.addUser(userB);

        Customer customer1 = new Customer();
        customer1.setCustomerKey(UUID.fromString("3edf47fb-06b7-46dc-bb19-bf0109b6e14c"));
        customer1.setCustomerCode("Demo");
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
        customer1.setMobileNo("61236123");
        customer1.setPhoneNo("24562456");
        customer1.setPostAddr1("");
        customer1.setPostAddr2("");
        customer1.setPostAddr3("");
        customer1.setPostAddr4("");
        customer1.setTwitterName("");
        customer1.setInstagramName("");
        customer1.setRemarks("");
        customer1.setCustomerGroup(UUID.fromString("558ea73e-5dba-4d9c-90fb-36a26ede2ec2"));
        customer1.setMember(memberDev);
        customerService.addCustomer(customer1);

        Customer customer2 = new Customer();
        customer2.setCustomerKey(UUID.fromString("9c5a5832-f199-4129-bf14-f92aeb08cf12"));
        customer2.setCustomerCode("ivanchan");
        customer2.setWebSite("http://www.demo.com");
        customer2.setSex("M");
        customer2.setFaxNo("");
        customer2.setFirstName("Ivan");
        customer2.setLastName("Chan");
        customer2.setCompanyName("Demo Corp");
        customer2.setDateOfBirth(new Date());
        customer2.setEmailAddress("me@demo.com");
        customer2.setHomeAddr1("");
        customer2.setHomeAddr2("");
        customer2.setHomeAddr3("");
        customer2.setHomeAddr4("");
        customer2.setMobileNo("61501205");
        customer2.setPhoneNo("91053072");
        customer2.setPostAddr1("");
        customer2.setPostAddr2("");
        customer2.setPostAddr3("");
        customer2.setPostAddr4("");
        customer2.setTwitterName("");
        customer2.setInstagramName("");
        customer2.setRemarks("");
        customer2.setCustomerGroup(UUID.fromString("558ea73e-5dba-4d9c-90fb-36a26ede2ec2"));
        customer2.setMember(memberDev);
        customerService.addCustomer(customer2);

        Customer customer3 = new Customer();
        customer3.setCustomerKey(UUID.fromString("fc146dfa-c753-41d6-a7ef-c02990cafa4b"));
        customer3.setCustomerCode("raychung");
        customer3.setWebSite("http://www.demo.com");
        customer3.setSex("M");
        customer3.setFaxNo("");
        customer3.setFirstName("Ray");
        customer3.setLastName("Chung");
        customer3.setCompanyName("Wingrowth Limited");
        customer3.setDateOfBirth(new Date());
        customer3.setEmailAddress("me@demo.com");
        customer3.setHomeAddr1("");
        customer3.setHomeAddr2("");
        customer3.setHomeAddr3("");
        customer3.setHomeAddr4("");
        customer3.setMobileNo("64500123");
        customer3.setPhoneNo("98708879");
        customer3.setPostAddr1("");
        customer3.setPostAddr2("");
        customer3.setPostAddr3("");
        customer3.setPostAddr4("");
        customer3.setTwitterName("");
        customer3.setInstagramName("");
        customer3.setRemarks("");
        customer3.setCustomerGroup(UUID.fromString("558ea73e-5dba-4d9c-90fb-36a26ede2ec2"));
        customer3.setMember(memberDev);
        customerService.addCustomer(customer3);

        Customer customer4 = new Customer();
        customer4.setCustomerKey(UUID.fromString("ce60eb9b-bf1f-42c8-8ba9-5d6a51f3a33e"));
        customer4.setCustomerCode("alextsang");
        customer4.setWebSite("http://www.demo.com");
        customer4.setSex("M");
        customer4.setFaxNo("");
        customer4.setFirstName("Alex");
        customer4.setLastName("Tsang");
        customer4.setCompanyName("Wingrowth Limited");
        customer4.setDateOfBirth(new Date());
        customer4.setEmailAddress("me@demo.com");
        customer4.setHomeAddr1("");
        customer4.setHomeAddr2("");
        customer4.setHomeAddr3("");
        customer4.setHomeAddr4("");
        customer4.setMobileNo("98890099");
        customer4.setPhoneNo("");
        customer4.setPostAddr1("");
        customer4.setPostAddr2("");
        customer4.setPostAddr3("");
        customer4.setPostAddr4("");
        customer4.setTwitterName("");
        customer4.setInstagramName("");
        customer4.setRemarks("");
        customer4.setCustomerGroup(UUID.fromString("558ea73e-5dba-4d9c-90fb-36a26ede2ec2"));
        customer4.setMember(memberDev);
        customerService.addCustomer(customer4);

        Customer customer5 = new Customer();
        customer5.setCustomerKey(UUID.fromString("95583bb3-e3ad-4c7d-86b2-c9fd34dfa180"));
        customer5.setCustomerCode("kingchau");
        customer5.setWebSite("http://www.demo.com");
        customer5.setSex("M");
        customer5.setFaxNo("");
        customer5.setFirstName("King");
        customer5.setLastName("Chau");
        customer5.setCompanyName("Wingrowth Limited");
        customer5.setDateOfBirth(new Date());
        customer5.setEmailAddress("me@demo.com");
        customer5.setHomeAddr1("");
        customer5.setHomeAddr2("");
        customer5.setHomeAddr3("");
        customer5.setHomeAddr4("");
        customer5.setMobileNo("90012345");
        customer5.setPhoneNo("");
        customer5.setPostAddr1("");
        customer5.setPostAddr2("");
        customer5.setPostAddr3("");
        customer5.setPostAddr4("");
        customer5.setTwitterName("");
        customer5.setInstagramName("");
        customer5.setRemarks("");
        customer5.setCustomerGroup(UUID.fromString("558ea73e-5dba-4d9c-90fb-36a26ede2ec2"));
        customer5.setMember(memberDev);
        customerService.addCustomer(customer5);

        Customer customer6 = new Customer();
        customer6.setCustomerKey(UUID.fromString("ef4cfcaf-33c6-4336-bcf1-fb009266890f"));
        customer6.setCustomerCode("josephting");
        customer6.setWebSite("http://www.demo.com");
        customer6.setSex("M");
        customer6.setFaxNo("");
        customer6.setFirstName("Joseph");
        customer6.setLastName("Ting");
        customer6.setCompanyName("Wingrowth Limited");
        customer6.setDateOfBirth(new Date());
        customer6.setEmailAddress("me@demo.com");
        customer6.setHomeAddr1("");
        customer6.setHomeAddr2("");
        customer6.setHomeAddr3("");
        customer6.setHomeAddr4("");
        customer6.setMobileNo("90012344");
        customer6.setPhoneNo("");
        customer6.setPostAddr1("");
        customer6.setPostAddr2("");
        customer6.setPostAddr3("");
        customer6.setPostAddr4("");
        customer6.setTwitterName("");
        customer6.setInstagramName("");
        customer6.setRemarks("");
        customer6.setCustomerGroup(UUID.fromString("558ea73e-5dba-4d9c-90fb-36a26ede2ec2"));
        customer6.setMember(memberDev);
        customerService.addCustomer(customer6);

        Customer customer7 = new Customer();
        customer7.setCustomerKey(UUID.fromString("6a419461-5d59-440c-bc9e-46cffaafad7a"));
        customer7.setCustomerCode("cherriechan");
        customer7.setWebSite("http://www.demo.com");
        customer7.setSex("M");
        customer7.setFaxNo("");
        customer7.setFirstName("Cherrie");
        customer7.setLastName("Chan");
        customer7.setCompanyName("Wingrowth Limited");
        customer7.setDateOfBirth(new Date());
        customer7.setEmailAddress("me@demo.com");
        customer7.setHomeAddr1("");
        customer7.setHomeAddr2("");
        customer7.setHomeAddr3("");
        customer7.setHomeAddr4("");
        customer7.setMobileNo("90012333");
        customer7.setPhoneNo("");
        customer7.setPostAddr1("");
        customer7.setPostAddr2("");
        customer7.setPostAddr3("");
        customer7.setPostAddr4("");
        customer7.setTwitterName("");
        customer7.setInstagramName("");
        customer7.setRemarks("");
        customer7.setCustomerGroup(UUID.fromString("558ea73e-5dba-4d9c-90fb-36a26ede2ec2"));
        customer7.setMember(memberDev);
        customerService.addCustomer(customer7);

        Customer customer8 = new Customer();
        customer8.setCustomerKey(UUID.fromString("591906ba-d4e5-42ac-9c3d-1f0e318f7d32"));
        customer8.setCustomerCode("blesslei");
        customer8.setWebSite("http://www.demo.com");
        customer8.setSex("M");
        customer8.setFaxNo("");
        customer8.setFirstName("Bless");
        customer8.setLastName("Lei");
        customer8.setCompanyName("IPL Limited");
        customer8.setDateOfBirth(new Date());
        customer8.setEmailAddress("me@demo.com");
        customer8.setHomeAddr1("");
        customer8.setHomeAddr2("");
        customer8.setHomeAddr3("");
        customer8.setHomeAddr4("");
        customer8.setMobileNo("90012222");
        customer8.setPhoneNo("");
        customer8.setPostAddr1("");
        customer8.setPostAddr2("");
        customer8.setPostAddr3("");
        customer8.setPostAddr4("");
        customer8.setTwitterName("");
        customer8.setInstagramName("");
        customer8.setRemarks("");
        customer8.setCustomerGroup(UUID.fromString("558ea73e-5dba-4d9c-90fb-36a26ede2ec2"));
        customer8.setMember(memberDev);
        customerService.addCustomer(customer8);
    }
}
