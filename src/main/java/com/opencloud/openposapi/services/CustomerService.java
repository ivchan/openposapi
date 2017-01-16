package com.opencloud.openposapi.services;

import com.opencloud.openposapi.entities.Customer;

import java.util.List;
import java.util.UUID;

/**
 * Created by ivanchan on 16/1/2017.
 */
public interface CustomerService {
    Customer getCustomer(UUID customerKey);
    List<Customer> listCustomer();
    Customer addCustomer(Customer customer);
    Customer updateCustomer(Customer customer);
    void deleteCustomer(UUID customerKey);
}
