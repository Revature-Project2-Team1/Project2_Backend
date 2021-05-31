package com.app.vaccine_tracker.service.impl;

import com.app.vaccine_tracker.exception.UserException;
import com.app.vaccine_tracker.model.Patient;
import com.app.vaccine_tracker.repository.PatientRepository;
import com.app.vaccine_tracker.service.QRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QRServiceImpl implements QRService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public Patient getPatient(String ssn){

        Optional<Patient> optional=patientRepository.findById(ssn);

        if(optional.isPresent()){
            return optional.get();
        }
        else{
            throw new UserException("User not Found");
        }
    }


}
