package com.opencloud.openposapi.controllers;

import com.opencloud.openposapi.entities.Customer;
import com.opencloud.openposapi.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * Created by ivanchan on 18/1/2017.
 */
@RestController
public class CustomerController extends ApiController {
    private CustomerService customerServ;

    @Autowired
    public CustomerController(CustomerService customerServ) {
        this.customerServ = customerServ;
    }

    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    public ResponseEntity<List<Customer>> ListCustomer() {
        List<Customer> lstCustomer = customerServ.listCustomer();
        return new ResponseEntity<List<Customer>>(lstCustomer, HttpStatus.OK);
    }

    @RequestMapping(value = "/customer/{id}", method = RequestMethod.GET)
    public ResponseEntity<Customer> getCustomer(@PathVariable("id")UUID customerKey){
        Customer customer = customerServ.getCustomer(customerKey);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @RequestMapping(value = "/customer", method = RequestMethod.POST)
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
        Customer savedCustomer = customerServ.addCustomer(customer);
        return new ResponseEntity<Customer>(savedCustomer, HttpStatus.OK);
    }

    @RequestMapping(value = "/customer/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Customer> updateCustomer(@PathVariable("id")UUID customerKey, @RequestBody Customer customer) {
        Customer savedCustomer = customerServ.updateCustomer(customerKey, customer);
        return new ResponseEntity<Customer>(savedCustomer, HttpStatus.OK);
    }
}
