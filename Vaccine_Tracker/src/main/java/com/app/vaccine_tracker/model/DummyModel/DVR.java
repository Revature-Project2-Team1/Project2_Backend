package com.app.vaccine_tracker.model.DummyModel;

import com.app.vaccine_tracker.model.Patient;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;


@Data
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class DVR {


    private int id;

    private String vaccineType;
    private String lot;
    private Date date;
    private String ssn;
}
