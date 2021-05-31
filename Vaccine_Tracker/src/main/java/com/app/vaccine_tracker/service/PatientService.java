package com.app.vaccine_tracker.service;

import com.app.vaccine_tracker.model.Patient;
import com.app.vaccine_tracker.model.PatientCredential;

public interface PatientService {

   public PatientCredential PatientLoginWithUsername(String username, String password);
   public PatientCredential PatientLoginWithEmail(String email, String password);
   public boolean registerPatientAccount(String email, String username, String password, String customerSSN);
   public boolean validatePatientCredential(String ssn, String email);
   public void updatePassword(String email, String password);


}
