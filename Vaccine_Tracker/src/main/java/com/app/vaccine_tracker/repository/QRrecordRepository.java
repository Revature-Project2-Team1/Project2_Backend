package com.app.vaccine_tracker.repository;

import com.app.vaccine_tracker.model.Patient;
import com.app.vaccine_tracker.model.QRrecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface QRrecordRepository extends JpaRepository<QRrecord,Integer> {

}
