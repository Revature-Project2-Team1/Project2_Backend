package com.app.vaccine_tracker.service.impl;

import com.app.vaccine_tracker.exception.UserException;
import com.app.vaccine_tracker.model.PatientCredential;
import com.app.vaccine_tracker.model.ProviderCredential;
import com.app.vaccine_tracker.repository.ProviderCredsRepository;
import com.app.vaccine_tracker.service.ProviderService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProviderServiceImpl implements ProviderService {
    private static Logger vaxify = Logger.getLogger(ProviderServiceImpl.class);

    private ProviderCredsRepository providerCredsRepository;

    @Overridez
    public ProviderCredential ProviderCredentialValidatorWithUsername(String username, String password) {
        ProviderCredential providerCredential = providerCredsRepository.findByUsername(username);
        try {
            System.out.println(providerCredential.getUsername()+" password "+providerCredential.getPassword());
            if (providerCredential.getPassword().equals(password) && providerCredential.getUsername().equals(username)) {
                return providerCredential;
            }else{
                vaxify.warn("Account is not found");
                throw new UserException("Account is not found");
            }
        }catch (UserException e){
            vaxify.error(e);
        }
        return providerCredential;
    }
}
