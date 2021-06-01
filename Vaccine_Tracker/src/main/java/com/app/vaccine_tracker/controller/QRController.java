package com.app.vaccine_tracker.controller;

import com.app.vaccine_tracker.exception.UserException;
import com.app.vaccine_tracker.model.Patient;
import com.app.vaccine_tracker.model.QRrecord;
import com.app.vaccine_tracker.service.QRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"http://vaccine-verification-bucket.s3-website.us-east-2.amazonaws.com","http://localhost:4200"})
@RestController
public class QRController {

    @Autowired
    private QRService qrService;

    @GetMapping("/qr/find-patient/{ssn}")
    public ResponseEntity<Object> getPatient(@PathVariable String ssn){

        try {
            return new ResponseEntity<Object>(qrService.getPatient(ssn), HttpStatus.OK);
        } catch(UserException e) {
            return new ResponseEntity<Object>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/qr/add")
    public ResponseEntity<Object> addQR(@RequestBody QRrecord qrRecord){
        qrService.addQR(qrRecord);
            return new ResponseEntity<Object>(qrRecord, HttpStatus.OK);

    }

    @DeleteMapping("/qr/delete/{qr_id}")
    public void deleteQR(@PathVariable int qr_id){

        qrService.deleteQR(qr_id);
    }

    @GetMapping("/qr/check-qr/{qr_id}")
    @ExceptionHandler(UserException.class)
    public ResponseEntity<Object> checkQR(@PathVariable int qr_id){

        try {
            return new ResponseEntity<Object>(qrService.checkQR(qr_id), HttpStatus.OK);
        } catch(UserException e) {
            return new ResponseEntity<Object>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

}
