package org.example.service;

import org.example.model.Doctor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DoctorServiceImpl implements DoctorService {

    private static Map<Long, Doctor> doctorDatabase = new HashMap<>();
    private static long nextId = 1;

    @Override
    public Doctor getDoctorById(Long id) {
        return doctorDatabase.get(id);
    }

    @Override
    public Long addDoctor(Doctor doctor) {
        Long id = getNextId();
        doctor.setId(id);
        doctorDatabase.put(id, doctor);
        return id;
    }

    @Override
    public void deleteDoctor(Long id) {
        doctorDatabase.remove(id);
    }

    private synchronized Long getNextId() {
        return nextId++;
    }
}
