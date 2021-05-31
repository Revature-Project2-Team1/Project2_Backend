package com.app.vaccine_tracker.model;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@Data
@NoArgsConstructor
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "clinicId")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Clinic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clinic_id")
    private String clinicId;

    @Column(name = "clinic_site")
    private String clinicSite;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    @JsonIgnore
    private Address address ;
    @ManyToOne
    @JsonIgnore
    private Provider provider;

}
