package com.app.vaccine_tracker.service.impl;

import com.app.vaccine_tracker.exception.UserException;
import com.app.vaccine_tracker.model.Patient;
import com.app.vaccine_tracker.model.QRrecord;
import com.app.vaccine_tracker.repository.PatientRepository;
import com.app.vaccine_tracker.repository.QRrecordRepository;
import com.app.vaccine_tracker.service.QRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QRServiceImpl implements QRService {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private QRrecordRepository qrRepository;

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

    @Override
    public QRrecord addQR(QRrecord qrRecord){
        return qrRepository.save(qrRecord);
    }

    @Override
    public void deleteQR(String ssn){
        Optional<QRrecord> optional=qrRepository.findById(ssn);
        if(optional.isPresent()) {
            qrRepository.deleteById(ssn);
        }else {
            throw new UserException("User has no previous QR");
        }
    }

    @Override
    public QRrecord checkQR(String ssn){
        Optional<QRrecord> optional=qrRepository.findById(ssn);

        if(optional.isPresent()){
            return optional.get();
        }
        else{
            throw new UserException("QR not Found");
        }

    }



}
