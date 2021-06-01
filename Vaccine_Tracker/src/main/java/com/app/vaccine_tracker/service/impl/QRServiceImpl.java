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
import java.util.function.Consumer;

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
    public void deleteQR(int qr_id){

            qrRepository.deleteById(qr_id);
    }

    @Override
    public QRrecord checkQR(int qr_id){
        Optional<QRrecord> optional=qrRepository.findById(qr_id);

        if(optional.isPresent()){
            return optional.get();
        }
        else{
            throw new UserException("QR not Found");
        }

    }



}
