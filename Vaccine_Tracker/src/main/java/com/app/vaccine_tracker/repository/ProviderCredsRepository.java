package com.app.vaccine_tracker.repository;

import com.app.vaccine_tracker.model.PatientCredential;
import com.app.vaccine_tracker.model.ProviderCredential;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProviderCredsRepository extends JpaRepository<ProviderCredential, Integer> {
    public Optional<ProviderCredential> findByUsername(String Username);

}
