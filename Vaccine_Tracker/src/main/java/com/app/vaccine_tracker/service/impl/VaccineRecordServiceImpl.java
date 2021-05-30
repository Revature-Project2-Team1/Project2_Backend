package com.app.vaccine_tracker.service.impl;

import com.app.vaccine_tracker.exception.UserException;
import com.app.vaccine_tracker.model.Patient;
import com.app.vaccine_tracker.model.VaccineRecord;
import com.app.vaccine_tracker.repository.PatientRepository;
import com.app.vaccine_tracker.repository.VaccineRecordRepository;
import com.app.vaccine_tracker.service.VaccineRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@Service
public class VaccineRecordServiceImpl implements VaccineRecordService {
    @Autowired
    @Lazy
    private VaccineRecordRepository vaccineRecordRepository;

    @Autowired
    private PatientRepository patientRepository;
    private String url="http://localhost:9000/patient/VaccineRecord/";

    private RestTemplate restTemplate=new RestTemplate();

    @Override
    public VaccineRecord addVaccineRecord(VaccineRecord vaccineRecord) {
//        boolean status = false;
//        Patient patient1 = patientRepository.getPatientByCustomerSSN(ssn);
//        Patient patient = new Patient();
//        patient.setCustomerSSN(ssn);
//        if(patient1 == null){
//            throw new UserException("Patient SSN doesn't exist in the database. Please try again");
//        }else
//        {
//            VaccineRecord vaccineRecord = new VaccineRecord();
//            vaccineRecord.setVaccineType(vaccineType);
//            vaccineRecord.setDate(date);
//            vaccineRecord.setLot(lot);
//            vaccineRecordRepository.save(vaccineRecord);
//            return status = true;
//        }
        return restTemplate.postForObject(url, vaccineRecord, VaccineRecord.class);


    }
}
