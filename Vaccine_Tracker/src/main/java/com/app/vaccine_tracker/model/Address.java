package com.app.vaccine_tracker.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Data
@NoArgsConstructor
public class Address {

    @Id
    @Column(name = "id")
    private int addressId;

    @Column(name = "street")
    private String street;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "zip")
    private int zip;

    @OneToMany(mappedBy = "address")
    private List<Patient> patientList = new ArrayList<>();

}
