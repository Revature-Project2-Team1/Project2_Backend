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
public class User {

    @Id
    @Email(message = "Invalid email")
    private String email;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "provider_email")
    private Provider provider;
    @Column(name ="fullname", nullable = false)
    private String fullName;
    @Column(nullable = false)
    private  String password;
    @Column(unique = true, nullable = false)
    private String ssn;
    @OneToOne
    @JoinColumn(name = "patient_ssn")
    private Patient patient;


}
