package org.example.service;

import org.example.model.Patient;

public interface PatientService {
    Patient getPatientById(Long id);
    Long addPatient(Patient patient);
    void deletePatient(Long id);
}
