package com.hospital.service;

import com.hospital.entity.Appointment;

import java.util.List;

public interface AppointmentService {
    List<Appointment> getAllAppointments();
    String delAppointment(Integer id);
    Appointment getAppointment(Integer id);
    String UpdateAppointment(Appointment appointment);
    String addAppointment(Appointment appointment);
}