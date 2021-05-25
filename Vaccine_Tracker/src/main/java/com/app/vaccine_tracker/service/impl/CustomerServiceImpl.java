package com.app.vaccine_tracker.service.impl;

import com.app.vaccine_tracker.model.Customer;
import com.app.vaccine_tracker.model.Patient;
import com.app.vaccine_tracker.service.CustomerService;
import org.springframework.web.client.RestTemplate;

public class CustomerServiceImpl implements CustomerService {
    @Override
    public Patient addConsumer(Patient customer) {
        return null;
    }

/*    private String url = "http://localhost:9000/customer/";
    private RestTemplate restTemplate=new RestTemplate();

    @Override
    public Customer addConsumer(Customer customer) {
        return restTemplate.postForObject(url, customer, Customer.class);
    }*/
}
