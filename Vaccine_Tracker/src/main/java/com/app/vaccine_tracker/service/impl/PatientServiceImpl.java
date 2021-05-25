package com.app.vaccine_tracker.service.impl;

import com.app.vaccine_tracker.model.Patient;
import com.app.vaccine_tracker.service.PatientService;

public class PatientServiceImpl implements PatientService {

    @Override
    public Patient addPatient(Patient customer) {
        return null;
    }

/*    private String url = "http://localhost:9000/customer/";
    private RestTemplate restTemplate=new RestTemplate();
    private PatientDAO patientDAO;

    @Override
    public Patient addConsumer(Patient patient) {
        return restTemplate.postForObject(url, customerDAO.addCustomer(patient), Patient.class);
    }*/

}
