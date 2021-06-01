package com.app.vaccine_tracker;

import com.app.vaccine_tracker.model.ProviderCredential;
import com.app.vaccine_tracker.repository.ProviderCredsRepository;
import com.app.vaccine_tracker.service.ProviderService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ProviderCredentialTest {

    public ProviderCredential ProviderCredentialValidatorWithUsernameTest()  throws ParseException {
        ProviderCredential providerCredential = new ProviderCredential();
        providerCredential.setId(1);
        providerCredential.setUsername("phuch");
        providerCredential.setPassword("phucsonmy");
        return providerCredential;
    }

    @Test
    public void test1() throws ParseException{
        ProviderCredential providerCredential = new ProviderCredential();
        ProviderCredsRepository providerCredsRepository = mock(ProviderCredsRepository.class);
        when(providerCredsRepository.findByUsername(providerCredential.getUsername())).thenReturn(ProviderCredentialValidatorWithUsernameTest());
        Assertions.assertNotNull(providerCredential);
    }

    @Test
    public void test2() throws ParseException{
        ProviderCredential providerCredential = new ProviderCredential();
        ProviderService providerService = mock(ProviderService.class);
        when(providerService.ProviderCredentialValidatorWithUsername(providerCredential.getUsername(), providerCredential.getPassword())).thenReturn(ProviderCredentialValidatorWithUsernameTest());
        Assertions.assertNotNull(providerCredential);
    }
}
