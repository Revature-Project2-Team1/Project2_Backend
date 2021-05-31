package com.app.vaccine_tracker.controller;

import com.app.vaccine_tracker.exception.UserException;
import com.app.vaccine_tracker.service.QRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class QRController {

    @Autowired
    private QRService qrService;

    @GetMapping("/qr/find-patient/{ssn}")
    @ExceptionHandler(UserException.class)
    public ResponseEntity<Object> getPatient(@PathVariable String ssn){

        try {
            return new ResponseEntity<Object>(qrService.getPatient(ssn), HttpStatus.OK);
        } catch(UserException e) {
            return new ResponseEntity<Object>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
