package com.app.vaccine_tracker.service.impl;

import com.app.vaccine_tracker.DAO.CustomerDAO;
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
    private CustomerDAO customerDAO;

    @Override
    public Patient addConsumer(Patient patient) {
        return restTemplate.postForObject(url, customerDAO.addCustomer(patient), Patient.class);
    }*/

}
