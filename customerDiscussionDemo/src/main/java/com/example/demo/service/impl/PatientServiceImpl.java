package com.example.demo.service.impl;

import java.sql.Date;
import java.sql.Timestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modal.Address;
import com.example.demo.modal.Patient;
import com.example.demo.modal.PatientphycisianAssociation;
import com.example.demo.modal.Phycisian;
import com.example.demo.repository.BookAppointmentRepository;
import com.example.demo.repository.PatientRepository;
import com.example.demo.repository.PhycisianRepository;
import com.example.demo.service.PatientService;
@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository patientRepository;
	@Autowired
	PhycisianRepository phycisianRepository;
	@Autowired
	BookAppointmentRepository bookAppointmentRepository;
	
	@Override
	public void addPatient(Patient patient,Address address) {
		patient.setAddress(address);
		patientRepository.save(patient);
	}

	@Override
	public void addPhycisian(Phycisian phycisian,Address address) {
		phycisian.setAddress(address);
		phycisianRepository.save(phycisian);
		
	}

	@Override
	public void bookAppointment(java.util.Date date, String reason, Integer PatientId, Integer phycisionId) {
		Date date1 = new Date(date.getTime());
		Timestamp time = new Timestamp(date.getTime());
		PatientphycisianAssociation ppr = new PatientphycisianAssociation();
		ppr.setDate(date1);
		ppr.setReason(reason);
		ppr.setTime(time);
	    ppr.setPatient(patientRepository.getOne(PatientId));
		ppr.setPhycision(phycisianRepository.getOne(phycisionId));
	    bookAppointmentRepository.save(ppr);
		
	}

}
