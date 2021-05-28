package com.app.vaccine_tracker.service;

import com.app.vaccine_tracker.model.PatientCredential;

public interface PatientService {

   public PatientCredential PatientCredentialValidatorWithUsername(String username, String password);
   public PatientCredential PatientCredentialValidatorWithEmail(String email, String password);


}
