package com.app.vaccine_tracker.service;

import com.app.vaccine_tracker.model.Patient;

public interface PatientService {

   public Patient PatientCredentialValidatorWithUsername(String username, String password, String ssn);
   public Patient PatientCredentialValidatorWithEmail(String email, String password, String ssn);


}
