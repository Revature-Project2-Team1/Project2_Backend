package com.app.vaccine_tracker.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.Email;

import javax.persistence.*;

@Entity
@Table
@Data
@NoArgsConstructor
@ToString
public class PatientCredential {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    @JoinColumn(name = "ssn")
    private Patient patient;
    @Column(unique = true)
    private String username;
    @Column(unique = true)
    @Email(message = "invaid input")
    private String email;
    private String password;
}
