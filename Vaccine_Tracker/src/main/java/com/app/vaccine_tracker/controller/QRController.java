package com.app.vaccine_tracker.controller;

import com.app.vaccine_tracker.exception.UserException;
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

            return new ResponseEntity<Object>(qrService.addQR(qrRecord), HttpStatus.OK);

    }

    @DeleteMapping("/qr/delete/{ssn}")
    @ExceptionHandler(UserException.class)
    public void deleteQR(@PathVariable String ssn){

        qrService.deleteQR(ssn);
    }

    @GetMapping("/qr/check-qr/{ssn}")
    public ResponseEntity<Object> checkQR(@PathVariable String ssn){

        try {
            return new ResponseEntity<Object>(qrService.checkQR(ssn), HttpStatus.OK);
        } catch(UserException e) {
            return new ResponseEntity<Object>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

}
