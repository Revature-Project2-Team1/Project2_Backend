package com.app.vaccine_tracker.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Entity
@Table
@Data
@NoArgsConstructor
public class QRrecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int qr_id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ssn")
    private Patient patient;

    private long time_stamp;



}
