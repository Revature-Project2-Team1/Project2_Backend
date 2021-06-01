package com.app.vaccine_tracker.service;

import com.app.vaccine_tracker.model.Patient;

public interface PatientService {

   public Patient patientLoginWithUsername(String username, String password);
   public Patient patientLoginWithEmail(String email, String password);
   public boolean registerPatientAccount(String email, String username, String password, String customerSSN);
   public boolean validatePatientCredential(String ssn, String email);
   public void updatePassword(String email, String password);
   public Patient getStatus(String ssn);




}
