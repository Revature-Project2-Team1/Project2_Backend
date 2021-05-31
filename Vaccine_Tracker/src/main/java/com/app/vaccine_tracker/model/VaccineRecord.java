package com.app.vaccine_tracker.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;


@Table
@Entity
@Data
@NoArgsConstructor
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class VaccineRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "vaccine_type")
    private String vaccineType;
    private String lot;
    @Column(name = "date", updatable = false)
<<<<<<< HEAD
    @DateTimeFormat(pattern = "yyyy/MM/dd")
=======
    @DateTimeFormat(pattern = "dd/MM/yyyy")
>>>>>>> 7cad742810954016a614ed72960c492a693371c6
    private Date date;
    @ManyToOne
    @JsonIgnore
    private Patient patient;
}
