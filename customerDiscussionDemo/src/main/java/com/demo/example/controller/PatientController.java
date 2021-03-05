package com.demo.example.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.modal.Address;
import com.example.demo.modal.Patient;
import com.example.demo.modal.Phycisian;
import com.example.demo.service.impl.PatientServiceImpl;

@RestController
public class PatientController {

	@Autowired
	private PatientServiceImpl patientServiceImpl;
	@Autowired
    private ModelMapper modelMapper;

	@PostMapping(path = "/addPatient")
	public @ResponseBody String savePatient(@Validated Patient patient, Address address) {
		patientServiceImpl.addPatient(patient, address);
		return "Saved";
	}

	@PostMapping(path = "/addPhycisian")
	public @ResponseBody String savePhycisian(@Validated Phycisian phycisian, Address address) {
		patientServiceImpl.addPhycisian(phycisian, address);
		return "Saved";
	}

	@PostMapping(path = "/bookAppointment")
	public @ResponseBody String bookAppointment(@RequestParam java.util.Date date, @RequestParam String reason,
			@RequestParam Integer PatientId, @RequestParam Integer phycisionId) {
		patientServiceImpl.bookAppointment(date, reason, PatientId, phycisionId);
		return "Saved";

	}
}
