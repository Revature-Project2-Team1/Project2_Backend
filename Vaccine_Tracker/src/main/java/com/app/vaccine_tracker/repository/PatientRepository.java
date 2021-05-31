package com.app.vaccine_tracker.repository;

import com.app.vaccine_tracker.model.Patient;
import com.app.vaccine_tracker.model.PatientCredential;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, String> {

    public Patient getPatientByCustomerSSN(String customerSSN);
    public Patient getStatusByCustomerSSN(String customerSSN);

}
