package com.app.vaccine_tracker.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

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
<<<<<<< HEAD
}
=======






}
>>>>>>> 7425d2e088d21747e0fffe493d84d8927f7f5b4c
