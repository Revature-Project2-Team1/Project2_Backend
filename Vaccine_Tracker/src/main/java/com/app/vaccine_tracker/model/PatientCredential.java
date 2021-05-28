package com.app.vaccine_tracker.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import javax.persistence.*;

@Entity
@Table
@Data
@NoArgsConstructor

public class PatientCredential {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ssn")
    private Patient patient;
    @Column(unique = true)
    private String username;
    @Column(unique = true)
    private String email;
    private String password;

}
