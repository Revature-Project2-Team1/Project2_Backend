package com.app.vaccine_tracker.service.impl;
import com.app.vaccine_tracker.exception.UserException;
import com.app.vaccine_tracker.model.PatientCredential;
import com.app.vaccine_tracker.repository.PatientCredsRepository;
import com.app.vaccine_tracker.service.PatientService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PatientServiceImpl implements PatientService {
    private static Logger vaxify = Logger.getLogger(PatientServiceImpl.class);

    @Autowired
    private PatientCredsRepository patientCredsRepository;


    @Override
    public PatientCredential PatientCredentialValidatorWithUsername(String username, String password) {
        PatientCredential patientCredential = patientCredsRepository.findByUsername(username);
        System.out.println(patientCredential.getUsername());
        try {
            if (patientCredential.getPassword().equals(password) && patientCredential.getUsername().equals(username)) {
                return patientCredential;
            }else{
                throw new UserException("Account is not found");
            }
        }catch (UserException e){
            vaxify.error(e);
        }
        return patientCredential;
    }

    @Override
    public PatientCredential PatientCredentialValidatorWithEmail(String email, String password) {
        PatientCredential patientCredential = patientCredsRepository.findByEmail(email);
        try {
            if (patientCredential.getPassword().equals(password) && patientCredential.getUsername().equals(email)) {
                return patientCredential;
            }else{
                throw new UserException("Account is not found");
            }
        }catch (UserException e){
            vaxify.error(e);
        }
        return patientCredential;
    }
}
