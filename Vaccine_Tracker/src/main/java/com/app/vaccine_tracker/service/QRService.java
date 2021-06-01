package com.app.vaccine_tracker.service;

import com.app.vaccine_tracker.model.Patient;
import com.app.vaccine_tracker.model.QRrecord;

public interface QRService {

public Patient getPatient(String ssn);

public QRrecord addQR(QRrecord qrRecord);
public void deleteQR(int qr_id);
public QRrecord checkQR(int qr_id);



}
