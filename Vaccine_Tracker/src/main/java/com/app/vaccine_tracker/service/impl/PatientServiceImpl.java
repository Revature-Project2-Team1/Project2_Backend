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
import org.springframework.transaction.annotation.Transactional;

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
    public String PatientLoginWithUsername(String username, String password) {
        try {

            PatientCredential patientCredential = patientCredsRepository.findByUsername(username);
            Patient patient = patientCredential.getPatient();
            String ssn = patient.getCustomerSSN();

            if (patientCredential == null) {
                vaxify.warn("Account is not found");
                throw new UserException("Account is not found");
            }
            if (patientCredential.getUsername().equals(username) && patientCredential.getPassword().equals(password)) {

                return ssn;
            } else {
                vaxify.warn("Invalid username or password");
                throw new UserException("Invalid username or password");
            }
        }catch (NullPointerException a){
            throw new UserException("Account is not found");
        }
    }

    @Override
    public String PatientLoginWithEmail(String email, String password) {
        try {
            PatientCredential patientCredential = patientCredsRepository.findByEmail(email);
            Patient patient = patientCredential.getPatient();
            String ssn = patient.getCustomerSSN();
            if (patientCredential == null) {
                vaxify.warn("Account is not found");
                throw new UserException("Account is not found");
            }
            if (patientCredential.getPassword().equals(password) && patientCredential.getEmail().equals(email)) {
                return ssn;
            } else {
                vaxify.warn("Invalid username or password");
                throw new UserException("Invalid email or password.");
            }
        }catch (NullPointerException a){
            throw new UserException("Account is not found");
        }
    }

    @Override
    public boolean registerPatientAccount(String email, String username, String password, String customerSSN) {
        boolean status = false;
        try {
            Patient patient1 = patientRepository.getPatientByCustomerSSN(customerSSN);
            List<PatientCredential> patientCredentialList = patientCredsRepository.findAllByEmail(email);
            List<PatientCredential> patientCredentialList1 = patientCredsRepository.findAllByUsername(username);
            Patient patient = new Patient();
            patient.setCustomerSSN(customerSSN);
            if (patient1 == null) {
                throw new UserException("Your ssn doesn't exist in the database. Please try again");
            } else {
                PatientCredential patientCredentialTemp = patientCredsRepository.findByPatient(patient);
                if (patientCredentialTemp != null) {
                    throw new UserException("You already have an account with us");

                } else {
                    if (!patientCredentialList.isEmpty())
                        throw new UserException("This email is already registered with us");
                    if (!patientCredentialList1.isEmpty())
                        throw new UserException("This username is already registered with us");
                    PatientCredential patientCredential = new PatientCredential();
                    patientCredential.setEmail(email);
                    patientCredential.setUsername(username);
                    patientCredential.setPassword(password);
                    patientCredential.setPatient(patient);
                    patientCredsRepository.save(patientCredential);
                    return status = true;
                }
            }
        } catch (NullPointerException e) {
            vaxify.warn(e.getMessage());
        }
        return status;
    }


    @Override
    public boolean validatePatientCredential(String customerSSN, String email) {
        boolean status = false;
        try {
            PatientCredential patientCredentialTemp = patientCredsRepository.findByEmail(email);
            if (patientCredentialTemp == null) throw new UserException("Email is not found. Please try again");
            Patient patient = patientCredentialTemp.getPatient();
            String lastFourDigits = patient.getCustomerSSN().substring(patient.getCustomerSSN().length() - 4);
            if (lastFourDigits.equals(customerSSN) && patientCredentialTemp.getEmail().equals(email)) {
                return status = true;
            } else {
                throw new UserException("Your information is not matched");
            }
        }catch (NullPointerException a){
            throw new UserException("Email not found");
        }
    }

    @Override
    @Transactional
    public void updatePassword(String email, String password) {
       patientCredsRepository.updatePassword(password, email);
    }

    @Override
    public Patient getStatus(String ssn) {
        Patient patient = patientRepository.getPatientByCustomerSSN(ssn);
        return patient;
    }


}


