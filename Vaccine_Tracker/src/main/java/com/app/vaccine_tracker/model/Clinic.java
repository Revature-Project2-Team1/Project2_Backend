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
public class Clinic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clinic_id")
    private String clinicId;

    @Column(name = "clinic_site")
    private String clinicSite;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
<<<<<<< HEAD
    private Address address;

=======
    private Address address ;
>>>>>>> 4b2b232b763971a4c01a8da1d4d6969bc30010fe
    @ManyToOne
    private Provider provider;
}
