package com.app.vaccine_tracker.repository;

import com.app.vaccine_tracker.model.Patient;
import com.app.vaccine_tracker.model.PatientCredential;
import com.app.vaccine_tracker.model.VaccineRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VaccineRecordRepository extends JpaRepository<VaccineRecord,Integer> {

        public List<VaccineRecord> findAllByPatient(Patient patient);
        //select * FROM vaccine_schema.vaccine_record where patient_ssn = '123-12-1234';

}
