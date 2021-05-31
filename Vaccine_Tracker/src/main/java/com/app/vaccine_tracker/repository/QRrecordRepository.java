package com.app.vaccine_tracker.repository;

import com.app.vaccine_tracker.model.QRrecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QRrecordRepository extends JpaRepository<QRrecord,String> {

 /*   @Query("select q from vaccine_schema.qrrecord q  where ssn=ssn")
    public Integer findByssn(String ssn);*/

}
