
package com.app.vaccine_tracker.repository;
import com.app.vaccine_tracker.model.Patient;
import com.app.vaccine_tracker.model.PatientCredential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Repository
public interface PatientCredsRepository extends JpaRepository<PatientCredential, Integer> {

    public PatientCredential findByUsername(String username);
    public PatientCredential findByEmail(String email);
    public PatientCredential findByPatient(Patient patient);
    public List<PatientCredential> findAllByEmail(String email);
    public List<PatientCredential> findAllByUsername(String username);
    @Modifying
    //@Transactional
    @Query("update  PatientCredential p set p.password = ?1 where p.email = ?2")
    public void updatePassword(@Param("password") String password,@Param("email") String email);
}