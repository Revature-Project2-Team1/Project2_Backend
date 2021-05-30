package com.app.vaccine_tracker.repository;

import com.app.vaccine_tracker.model.Patient;
import com.app.vaccine_tracker.model.VaccineRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccineRecordRepository extends JpaRepository<VaccineRecord,Integer> {

}
