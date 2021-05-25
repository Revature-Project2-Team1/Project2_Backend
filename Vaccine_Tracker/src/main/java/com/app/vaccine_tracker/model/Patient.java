package com.app.vaccine_tracker.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Data
@NoArgsConstructor
@ToString
public class Patient {

    @Id
    @Column(name = "patient_ssn")
    private String customerSSN;
    private String status;
    @Column(name = "vaccine_type")
    private String vaccineType;
    private String dob;
    private String lot;
    @ManyToOne
    private Address address;

    @OneToMany
    private List<Date> dateList = new ArrayList<>();


}
