package com.app.vaccine_tracker.service;

import com.app.vaccine_tracker.model.DummyModel.DVR;
import com.app.vaccine_tracker.model.VaccineRecord;

import java.util.Date;

public interface VaccineRecordService {

    //public boolean addVaccineRecord(String ssn, String vaccineType, Date date, String lot);
    public String addVaccineRecord(DVR dvr);

}
//SSN: "312312311"
//        VaccineType: "Moderna"
//        date: "11/11/1994"
//        lot: "3232"