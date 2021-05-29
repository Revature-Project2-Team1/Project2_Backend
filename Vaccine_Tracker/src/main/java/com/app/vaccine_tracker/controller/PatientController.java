package com.app.vaccine_tracker.controller;

import com.app.vaccine_tracker.exception.UserException;
import com.app.vaccine_tracker.model.Patient;
import com.app.vaccine_tracker.model.PatientCredential;
import com.app.vaccine_tracker.service.PatientService;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PatientController {

    @Autowired

    private PatientService patientService;

    @GetMapping("/patient/username-login/{username}/{password}")
    //@ExceptionHandler(UserException.class)
    public ResponseEntity<Object> patientLoginWithUsername(@PathVariable String username, @PathVariable String password){

        try {
            return new ResponseEntity<Object>(patientService.PatientLoginWithUsername(username, password), HttpStatus.OK);
        }catch(UserException e) {
            return new ResponseEntity<Object>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/patient/email-login/{email}/{password}")
    //@ExceptionHandler(UserException.class)
    public ResponseEntity<Object> patientLoginWithEmail(@PathVariable String email, @PathVariable String password){
        try {
            return new ResponseEntity<Object>(patientService.PatientLoginWithEmail(email, password), HttpStatus.OK);
        }catch(UserException e) {
            return new ResponseEntity<Object>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/patient/register/{email}/{username}/{password}/{ssn}")
    //@ExceptionHandler(UserException.class)
    public ResponseEntity<Object> registerPatientAccount(@PathVariable String email, @PathVariable String username, @PathVariable String password, @PathVariable String ssn){
        try {
            return new ResponseEntity<Object>(patientService.registerPatientAccount(email, username, password, ssn), HttpStatus.OK);
        }catch(UserException e){
            return new ResponseEntity<Object>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/patient/validatepatientcredential/{ssn}/{email}")
    //@ExceptionHandler(UserException.class)
    public ResponseEntity<Object> validatePatientCredential(@PathVariable String ssn, @PathVariable String email){
        try {
            return new ResponseEntity<Object>(patientService.validatePatientCredential(ssn, email), HttpStatus.OK);
        }catch(UserException e){
            return new ResponseEntity<Object>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/patient/updatepassword/{password}/{email}")
    //@ExceptionHandler(UserException.class)
    public ResponseEntity<Object> updatePassword(@PathVariable String password, @PathVariable String email){
        try {
            return new ResponseEntity<Object>(patientService.updatePassword(email, password), HttpStatus.OK);
        }catch(UserException e){
            return new ResponseEntity<Object>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }
 }
