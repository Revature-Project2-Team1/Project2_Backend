package com.app.vaccine_tracker.controller;

import com.app.vaccine_tracker.exception.UserException;
import com.app.vaccine_tracker.service.PatientService;
import com.app.vaccine_tracker.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"http://vaccine-verification-bucket.s3-website.us-east-2.amazonaws.com","http://localhost:4200"})
public class ProviderController {

    @Autowired
    private ProviderService providerService;

    @GetMapping("/provider/username-login/{username}/{password}")
    @ExceptionHandler(UserException.class)
    public ResponseEntity<Object> ProviderCredentialValidatorWithUsername(@PathVariable String username, @PathVariable String password){
        try {
            return new ResponseEntity<Object>(providerService.ProviderCredentialValidatorWithUsername(username, password), HttpStatus.OK);
        }catch(UserException e) {
            return new ResponseEntity<Object>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }
}
