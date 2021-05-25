package com.app.vaccine_tracker.controller;

import com.app.vaccine_tracker.model.Customer;
import com.app.vaccine_tracker.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/customer")
    public Customer addCustomer(Customer customer){
        return customerService.addConsumer(customer);
    }
}
