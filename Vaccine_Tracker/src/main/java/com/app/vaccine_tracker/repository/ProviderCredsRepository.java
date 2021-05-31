package com.app.vaccine_tracker.repository;

import com.app.vaccine_tracker.model.ProviderCredential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProviderCredsRepository extends JpaRepository<ProviderCredential, Integer> {
    //@Query("SELECT p.\"password\", p.username, FROM vaccine_schema.provider_credential p where p.\"username\" = ?1")
    public ProviderCredential findByUsername(String username);

}
