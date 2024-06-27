package org.example.service;
import org.example.model.Patient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PatientServiceImpl implements PatientService {

    private static Map<Long, Patient> patientDatabase = new HashMap<>();
    private static long nextId = 1;

    @Override
    public Patient getPatientById(Long id) {
        return patientDatabase.get(id);
    }

    @Override
    public Long addPatient(Patient patient) {
        Long id = getNextId();
        patient.setId(id);
        patientDatabase.put(id, patient);
        return id;
    }

    @Override
    public void deletePatient(Long id) {
        patientDatabase.remove(id);
    }

    // Helper method to generate next unique ID for patients
    private synchronized Long getNextId() {
        return nextId++;
    }
}
