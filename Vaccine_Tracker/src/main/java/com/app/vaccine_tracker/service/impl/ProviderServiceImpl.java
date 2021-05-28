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

    @Override
    public ProviderCredential ProviderCredentialValidatorWithUsername(String username, String password) {
        Optional<ProviderCredential> optional = providerCredsRepository.findByUsername(username);
        try {
            if (optional.get().getPassword().equals(password) && optional.get().getUsername().equals(username)) {
                return optional.get();
            }else{
                throw new UserException("Account is not found");
            }
        }catch (UserException e){
            vaxify.error(e);
        }
        return optional.get();
    }
}
