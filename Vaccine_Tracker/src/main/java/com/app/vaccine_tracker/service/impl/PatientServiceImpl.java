package com.app.vaccine_tracker.service.impl;

import com.app.vaccine_tracker.model.Patient;
import com.app.vaccine_tracker.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientService patientService;


    @Override
    public Patient PatientCredentialValidatorWithUsername(String username, String password, String ssn) {
        return null;
    }

    @Override
    public Patient PatientCredentialValidatorWithEmail(String email, String password, String ssn) {
        return null;
    }
}
