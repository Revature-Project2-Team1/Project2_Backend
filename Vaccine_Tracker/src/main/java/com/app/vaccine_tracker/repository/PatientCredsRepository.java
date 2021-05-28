
package com.app.vaccine_tracker.repository;
import com.app.vaccine_tracker.model.PatientCredential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface PatientCredsRepository extends JpaRepository<PatientCredential, Integer> {

    //public Optional<PatientCredential> findByUsername(String username);
    @Query("From PatientCredential Where username = ?1")
    public PatientCredential getPatient(String username);
    public PatientCredential findByEmail(String email);
}