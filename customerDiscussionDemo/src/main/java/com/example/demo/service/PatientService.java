package com.example.demo.service;
import com.example.demo.modal.Address;
import com.example.demo.modal.Patient;
import com.example.demo.modal.Phycisian;

public interface PatientService {
	
   void addPatient(Patient patient ,Address address);
   void addPhycisian(Phycisian phycisian,Address address);
   void bookAppointment(java.util.Date date, String reason, Integer PatientId, Integer phycisionId );
   
}
