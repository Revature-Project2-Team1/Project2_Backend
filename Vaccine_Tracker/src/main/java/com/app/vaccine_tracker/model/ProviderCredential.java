package com.app.vaccine_tracker.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@NoArgsConstructor
public class ProviderCredential {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "provider_email")
    private Provider provider;

    @Column(unique = true)
    private String username;
    private String password;

}
