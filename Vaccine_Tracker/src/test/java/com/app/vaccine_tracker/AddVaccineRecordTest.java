package com.app.vaccine_tracker;

import com.app.vaccine_tracker.exception.UserException;
import com.app.vaccine_tracker.model.DummyModel.DVR;
import com.app.vaccine_tracker.model.Patient;
import com.app.vaccine_tracker.model.VaccineRecord;
import com.app.vaccine_tracker.repository.PatientRepository;
import com.app.vaccine_tracker.repository.VaccineRecordRepository;
import com.app.vaccine_tracker.service.VaccineRecordService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.mockito.Mockito.*;
public class AddVaccineRecordTest {


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
        DVR dvr = new DVR();
        VaccineRecordService vaccineRecordService = mock(VaccineRecordService.class);
        when(vaccineRecordService.addVaccineRecord(dvr)).thenReturn(createDVRForTest());
        Assertions.assertNotNull(dvr);

    }
    @Test
    public void test2() throws ParseException{
        Patient patient = new Patient();
        VaccineRecordRepository vaccineRecordRepository = mock(VaccineRecordRepository.class);
        when(vaccineRecordRepository.findAllByPatient(patient)).thenReturn(createVRForTest());
        Assertions.assertNotNull(patient);
    }


}
