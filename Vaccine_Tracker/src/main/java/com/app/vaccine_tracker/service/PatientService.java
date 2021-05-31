package com.app.vaccine_tracker.service;

import com.app.vaccine_tracker.model.Patient;

public interface PatientService {

   public String PatientLoginWithUsername(String username, String password);
   public String PatientLoginWithEmail(String email, String password);
   public boolean registerPatientAccount(String email, String username, String password, String customerSSN);
   public boolean validatePatientCredential(String ssn, String email);
   public void updatePassword(String email, String password);
   public Patient getStatus(String ssn);




}
