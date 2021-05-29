package com.app.vaccine_tracker.service;

import com.app.vaccine_tracker.model.ProviderCredential;

public interface ProviderService {
    public ProviderCredential ProviderCredentialValidatorWithUsername(String username, String password);
}
