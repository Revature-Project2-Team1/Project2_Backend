package com.app.vaccine_tracker;
import com.app.vaccine_tracker.controller.PatientController;
import com.app.vaccine_tracker.model.Address;
import com.app.vaccine_tracker.model.Patient;
import com.app.vaccine_tracker.model.PatientCredential;
import com.app.vaccine_tracker.repository.PatientCredsRepository;
import com.app.vaccine_tracker.repository.PatientRepository;
import com.app.vaccine_tracker.service.PatientService;
import com.app.vaccine_tracker.service.impl.PatientServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
public class PatientServiceMockito {


    @Test
    public void testPatientLoginWithUsername(){
     PatientService patientService = mock(PatientService.class);
     Patient patient = new Patient();
     patient.setCustomerSSN("123-12-1234");
     when(patientService.patientLoginWithUsername("phuch", "phucsonmy")).thenReturn(patient);;
    }

    @Test
    public void testPatientLoginWithEmail(){
        PatientService patientService = mock(PatientService.class);
        Patient patient = new Patient();
        patient.setCustomerSSN("123-12-1234");
        when(patientService.patientLoginWithEmail("phuch@email", "phucsonmy")).thenReturn(patient);
        Assertions.assertNotNull(patientService);
    }

    @Test
    public void testRegisterPatientAccount(){
        PatientService patientService = mock(PatientService.class);
        when(patientService.registerPatientAccount("phuch@gmail", "phuch", "password", "123-12-1234")).thenReturn(patient);
        Assertions.assertNotNull(patientService);
    }
}
