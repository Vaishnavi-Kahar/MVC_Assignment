package org.example.service;

import org.example.model.Doctor;

public interface DoctorService {
    Doctor getDoctorById(Long id);
    Long addDoctor(Doctor doctor);
    void deleteDoctor(Long id);
}
