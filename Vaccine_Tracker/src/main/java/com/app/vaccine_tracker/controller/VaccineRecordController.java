package com.app.vaccine_tracker.controller;

import com.app.vaccine_tracker.exception.UserException;
import com.app.vaccine_tracker.model.VaccineRecord;
import com.app.vaccine_tracker.service.VaccineRecordService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
@CrossOrigin(origins = "http://localhost:9000")
@RestController
public class VaccineRecordController {

    @Autowired
    private VaccineRecordService vaccineRecordService;

    @PostMapping("/patient/VaccineRecord")
    public ResponseEntity<Object> addVaccineRecord
            (@RequestBody VaccineRecord vaccineRecord) {
        System.out.println(vaccineRecord);
        return new ResponseEntity<Object>(vaccineRecordService.addVaccineRecord(vaccineRecord), HttpStatus.OK);

    }


}

//SSN: "312312311"
//        VaccineType: "Moderna"
//        date: "11/11/1994"
//        lot: "3232"