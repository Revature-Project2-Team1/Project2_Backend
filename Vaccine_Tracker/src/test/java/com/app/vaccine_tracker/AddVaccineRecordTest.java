package com.app.vaccine_tracker;

import com.app.vaccine_tracker.exception.UserException;
import com.app.vaccine_tracker.model.DummyModel.DVR;
import com.app.vaccine_tracker.service.VaccineRecordService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.mockito.Mockito.*;
public class AddVaccineRecordTest {

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


}
