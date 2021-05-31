package com.app.vaccine_tracker.service.impl;

import com.app.vaccine_tracker.exception.UserException;
import com.app.vaccine_tracker.model.DummyModel.DVR;
import com.app.vaccine_tracker.model.Patient;
import com.app.vaccine_tracker.model.PatientCredential;
import com.app.vaccine_tracker.model.VaccineRecord;
import com.app.vaccine_tracker.repository.PatientRepository;
import com.app.vaccine_tracker.repository.VaccineRecordRepository;
import com.app.vaccine_tracker.service.VaccineRecordService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.apache.log4j.Logger;

import java.util.Date;

@Service
public class VaccineRecordServiceImpl implements VaccineRecordService {
    Logger vaxify = Logger.getLogger(VaccineRecordServiceImpl.class);
    @Autowired
    @Lazy
    private VaccineRecordRepository vaccineRecordRepository;

    @Autowired
    private PatientRepository patientRepository;



    @Override
    public boolean addVaccineRecord( DVR dvr) {
        boolean status =false;
        VaccineRecord vaccineRecord = new VaccineRecord();
        vaccineRecord.setDate(dvr.getDate());
        vaccineRecord.setLot(dvr.getLot());
        vaccineRecord.setVaccineType(dvr.getVaccineType());

        Patient patient1 = new Patient();
        patient1.setCustomerSSN(dvr.getSsn());

        Patient patient = patientRepository.getPatientByCustomerSSN(patient1.getCustomerSSN());
        vaxify.info(patient.getStatus());
        if(patient1 == null){
            throw new UserException("Your SSN doesn't exist in the database. Please try again");
        }else {
            vaccineRecord.setPatient(patient);
            if(patient.getStatus().equals("unvaccinated")) {
                patient.setStatus("partial");
            }else if(patient.getStatus().equals("partial"))
            {
                patient.setStatus("vaccinated");
            }else
            {
                vaxify.info(patient.getStatus());
                throw new UserException("Already Fully Vaccinate");
            }
            vaccineRecordRepository.save(vaccineRecord);
            patientRepository.save(patient);
            return status = true;
        }
    }
}
