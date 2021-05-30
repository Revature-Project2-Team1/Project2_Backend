package com.app.vaccine_tracker.service.impl;
import com.app.vaccine_tracker.exception.UserException;
import com.app.vaccine_tracker.model.Patient;
import com.app.vaccine_tracker.model.PatientCredential;
import com.app.vaccine_tracker.repository.PatientCredsRepository;
import com.app.vaccine_tracker.repository.PatientRepository;
import com.app.vaccine_tracker.service.PatientService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PatientServiceImpl implements PatientService {
    private static Logger vaxify = Logger.getLogger(PatientServiceImpl.class);

    @Autowired
    @Lazy
    private PatientCredsRepository patientCredsRepository;

    @Autowired
    private PatientRepository patientRepository;


    @Override
    public PatientCredential PatientLoginWithUsername(String username, String password) {
        PatientCredential patientCredential = patientCredsRepository.findByUsername(username);
        if (patientCredential == null) {
            vaxify.warn("Account is not found");
            throw new UserException("Account is not found");
        }
        if (patientCredential.getUsername().equals(username) && patientCredential.getPassword().equals(password)) {
            return patientCredential;
        } else {
            vaxify.warn("Invalid username or password");
            throw new UserException("Invalid username or password");
        }
    }

    @Override
    public PatientCredential PatientLoginWithEmail(String email, String password) {
        PatientCredential patientCredential = patientCredsRepository.findByEmail(email);
        if (patientCredential == null) {
            vaxify.warn("Account is not found");
            throw new UserException("Account is not found");
        }
        System.out.println(patientCredential.getPassword());
        if (patientCredential.getPassword().equals(password) && patientCredential.getEmail().equals(email)) {
            return patientCredential;
        } else {
            vaxify.warn("Invalid username or password");
            throw new UserException("Invalid email or password.");
        }
    }

    @Override
    public boolean registerPatientAccount(String email, String username, String password, String customerSSN) {
        boolean status = false;
        Patient patient1 = patientRepository.getPatientByCustomerSSN(customerSSN);
        List<PatientCredential> patientCredentialList = patientCredsRepository.findAllByEmail(email);
        List<PatientCredential> patientCredentialList1 = patientCredsRepository.findAllByUsername(username);
        Patient patient = new Patient();
        patient.setCustomerSSN(customerSSN);
        if (patient1 == null) {
            throw new UserException("Your SSN doesn't exist in the database. Please try again");
        } else {
            PatientCredential patientCredentialTemp = patientCredsRepository.findByPatient(patient);
            if (patientCredentialTemp != null) {
               throw new UserException("You already have an account with us");

            } else {
                if(!patientCredentialList.isEmpty()) throw new UserException("This email is already registered with us");
                if(!patientCredentialList1.isEmpty()) throw new UserException("This Username is already registered with us");
                PatientCredential patientCredential = new PatientCredential();
                patientCredential.setEmail(email);
                patientCredential.setUsername(username);
                patientCredential.setPassword(password);
                patientCredential.setPatient(patient);
                patientCredsRepository.save(patientCredential);
                return status = true;
            }
        }

    }

    @Override
    public boolean validatePatientCredential(String customerSSN, String email) {
        boolean status = false;
        PatientCredential patientCredentialTemp = patientCredsRepository.findByEmail(email);
        if(patientCredentialTemp == null) throw new UserException("Email is not found. Please try again");
        Patient patient = patientCredentialTemp.getPatient();
        String lastFourDigits = patient.getCustomerSSN().substring(patient.getCustomerSSN().length() - 1);
        if(lastFourDigits.equals(customerSSN)&&patientCredentialTemp.getEmail().equals(email)){
            status= true;
        }else {
            throw new UserException("Your information is not matched");
        }

        return status;
    }

    @Override
    public PatientCredential updatePassword(String email, String password) {
        PatientCredential patientCredential = patientCredsRepository.findByEmail(email);
        patientCredential.setEmail(email);
        patientCredential.setPassword(password);
        return patientCredsRepository.save(patientCredential);
    }
}


