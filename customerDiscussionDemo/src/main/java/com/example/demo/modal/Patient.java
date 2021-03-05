package com.example.demo.modal;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Patient {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PATIENT_ID")
	private Integer patientId;
	private String firstName;
	private String lastName;
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Embedded
	private Address address;
	@OneToMany(mappedBy = "patient")
	private Set<PatientphycisianAssociation> patient_phycision = new HashSet<PatientphycisianAssociation>();

	public Set<PatientphycisianAssociation> getPatient_phycision() {
		return patient_phycision;
	}

	public void setPatient_phycision(Set<PatientphycisianAssociation> patient_phycision) {
		this.patient_phycision = patient_phycision;
	}

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	

	
	

}
