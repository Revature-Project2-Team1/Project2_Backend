package com.app.vaccine_tracker.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

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
    @Column(name = "ssn")
    private String customerSSN;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(nullable = false)
    private String dob;
    @Column(name = "fullname", nullable = false)
    private String fullName;
    private String status;
    @ManyToOne
    private Address address;
    @OneToMany(mappedBy = "patient")
    List<VaccineRecord> vaccineRecordList = new ArrayList<>();
}
