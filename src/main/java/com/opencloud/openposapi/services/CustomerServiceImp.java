package com.opencloud.openposapi.services;

import com.opencloud.openposapi.entities.Customer;
import com.opencloud.openposapi.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by ivanchan on 16/1/2017.
 */
@Service("CustomerService")
public class CustomerServiceImp implements CustomerService{
    @Autowired
    private CustomerRepository customerRepo;

    @Override
    public Customer getCustomer(UUID customerKey) {
        return this.customerRepo.findOne(customerKey);
    }

    @Override
    public List<Customer> listCustomer() {
        return this.customerRepo.findAll();
    }

    @Override
    public Customer addCustomer(Customer customer) {
        if (customer.getCustomerKey() == null) {
            customer.setCustomerKey(UUID.randomUUID());
        }
        return this.customerRepo.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        Customer existCustomer = this.customerRepo.findOne(customer.getCustomerKey());
        if (existCustomer == null) {
            return null;
        }else {
            if (existCustomer != null) {
                existCustomer.setCustomerCode(customer.getCustomerCode());
                existCustomer.setCompanyName(customer.getCompanyName());
                existCustomer.setFirstName(customer.getFirstName());
                existCustomer.setLastName(customer.getLastName());
                existCustomer.setEmailAddress(customer.getEmailAddress());
                existCustomer.setFaxNo(customer.getFaxNo());
                existCustomer.setHomeAddr1(customer.getHomeAddr1());
                existCustomer.setHomeAddr2(customer.getHomeAddr2());
                existCustomer.setHomeAddr3(customer.getHomeAddr3());
                existCustomer.setHomeAddr4(customer.getHomeAddr4());
                existCustomer.setMobileNo(customer.getMobileNo());
                existCustomer.setPhoneNo(customer.getPhoneNo());
                existCustomer.setSex(customer.getSex());
                existCustomer.setInstagramName(customer.getInstagramName());
                existCustomer.setTwitterName(customer.getTwitterName());
                existCustomer.setWebSite(customer.getWebSite());
            }
        }
        return this.customerRepo.save(existCustomer);
    }

    @Override
    public void deleteCustomer(UUID customerKey) {
        this.customerRepo.delete(customerKey);
    }
}
