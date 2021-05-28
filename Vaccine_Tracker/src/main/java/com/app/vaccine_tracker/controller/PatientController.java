package com.app.vaccine_tracker.controller;

import com.app.vaccine_tracker.exception.UserException;
import com.app.vaccine_tracker.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/patient/login-username/{username}/{password}")
    @ExceptionHandler(UserException.class)
    public ResponseEntity<Object> PatientCredentialValidatorWithUsername(@PathVariable String username, @PathVariable String password){
        try {
            return new ResponseEntity<Object>(patientService.PatientCredentialValidatorWithUsername(username, password), HttpStatus.OK);
        }catch(UserException e) {
            return new ResponseEntity<Object>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/patient/login/{email}/{password}")
    @ExceptionHandler(UserException.class)
    public ResponseEntity<Object> PatientCredentialValidatorWithEmail(@PathVariable String email, @PathVariable String password){
        try {
            return new ResponseEntity<Object>(patientService.PatientCredentialValidatorWithEmail(email, password), HttpStatus.OK);
        }catch(UserException e) {
            return new ResponseEntity<Object>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }
 }
