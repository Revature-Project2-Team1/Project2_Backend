package com.app.vaccine_tracker.controller;

import com.app.vaccine_tracker.model.Patient;
import com.app.vaccine_tracker.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/customer")
    public Patient addCustomer(Patient patient){
        return customerService.addConsumer(patient);
    }
}
