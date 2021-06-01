package com.app.vaccine_tracker;

import com.app.vaccine_tracker.model.Address;
import com.app.vaccine_tracker.model.DummyModel.DVR;
import com.app.vaccine_tracker.model.Patient;
import com.app.vaccine_tracker.model.ProviderCredential;
import com.app.vaccine_tracker.model.VaccineRecord;
import com.app.vaccine_tracker.repository.ProviderCredsRepository;
import com.app.vaccine_tracker.repository.VaccineRecordRepository;
import com.app.vaccine_tracker.service.PatientService;
import com.app.vaccine_tracker.service.ProviderService;
import com.app.vaccine_tracker.service.VaccineRecordService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    public List<VaccineRecord> createVRForTest() throws ParseException {
        List<VaccineRecord> vaccineRecords = new ArrayList<>();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatter2 = new SimpleDateFormat("MM/dd/yyyy");
        String source = "02/16/2020";

        Date dat;
        dat = formatter2.parse(source);
        source = formatter.format(dat);
        VaccineRecord vaccineRecord=new VaccineRecord();
        vaccineRecord.setId(1);
        vaccineRecord.setDate(dat);
        vaccineRecord.setLot("123124");
        vaccineRecord.setVaccineType("Moderna");

        vaccineRecords.add(vaccineRecord);
        vaccineRecords.add(vaccineRecord);
        vaccineRecords.add(vaccineRecord);
        vaccineRecords.add(vaccineRecord);


        return vaccineRecords;
    }

    public String createDVRForTest() throws ParseException {

        DVR dvr = new DVR();
        dvr.setId(1);
        dvr.setLot("2313");
        dvr.setSsn("322-32-3242");
        dvr.setVaccineType("Moderna");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatter2 = new SimpleDateFormat("MM/dd/yyyy");
        String source = "02/16/2020";

        Date dat;
        dat = formatter2.parse(source);
        source = formatter.format(dat);
        dvr.setDate(dat);
        return dvr.toString();
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
    @Test
    public void test3() throws ParseException{
        DVR dvr = new DVR();
        VaccineRecordService vaccineRecordService = mock(VaccineRecordService.class);
        when(vaccineRecordService.addVaccineRecord(dvr)).thenReturn(createDVRForTest());
        Assertions.assertNotNull(dvr);

    }
    @Test
    public void test4() throws ParseException{
        Patient patient = new Patient();
        VaccineRecordRepository vaccineRecordRepository = mock(VaccineRecordRepository.class);
        when(vaccineRecordRepository.findAllByPatient(patient)).thenReturn(createVRForTest());
        Assertions.assertNotNull(patient);
    }
    public Patient createPatient(){
        Patient patient = new Patient();
        Address address = new Address();
        address.setAddressId(1);
        address.setCity("Seattle");
        address.setStreet("12312");
        patient.setCustomerSSN("123-12-1234");
        patient.setAddress(address);
        patient.setDob("12/1/1991");
        return patient;
    }


    @Test
    public void testPatientLoginWithUsername(){
        PatientService patientService = mock(PatientService.class);
        Patient patient = new Patient();
        patient.setCustomerSSN("123-12-1234");
        when(patientService.patientLoginWithUsername("phuch", "phucsonmy")).thenReturn(createPatient());
        Assertions.assertNotNull(patientService);
    }

    @Test
    public void testPatientLoginWithEmail(){
        PatientService patientService = mock(PatientService.class);
        Patient patient = new Patient();
        patient.setCustomerSSN("123-12-1234");
        when(patientService.patientLoginWithEmail("phuch@email", "phucsonmy")).thenReturn(createPatient());
        Assertions.assertNotNull(patientService);
    }

    @Test
    public void testRegisterPatientAccount(){
        PatientService patientService = mock(PatientService.class);
        when(patientService.registerPatientAccount("phuch@gmail", "phuch", "password", "123-12-1234")).thenReturn(true);
        Assertions.assertEquals(true,patientService.registerPatientAccount("phuch@gmail", "phuch", "password", "123-12-1234") );
    }

    @Test
    public void testValidatePatientCredentials(){
        PatientService patientService = mock(PatientService.class);
        when(patientService.validatePatientCredential("123-12-1234", "phuch@gmail.com")).thenReturn(true);
        Assertions.assertEquals(true,patientService.validatePatientCredential("123-12-1234", "phuch@gmail.com") );
    }
}
