package com.example.demo.modal;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Phycisian {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="PHYCISIAN_ID")
	private Integer physcisianId;
	private String firstName;
	private String lastName;
	@Embedded
	private Address address;
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	@ElementCollection
	private List<String> speciality;
	@OneToMany(mappedBy = "phycision")
	private Set<PatientphycisianAssociation> patient_phycision = new HashSet<PatientphycisianAssociation>();
	
	public List<String> getSpeciality() {
		return speciality;
	}
	
	public Set<PatientphycisianAssociation> getPatient_phycision() {
		return patient_phycision;
	}
	public void setPatient_phycision(Set<PatientphycisianAssociation> patient_phycision) {
		this.patient_phycision = patient_phycision;
	}
	public void setSpeciality(List<String> speciality) {
		this.speciality = speciality;
	}
	public Integer getPhyscisianId() {
		return physcisianId;
	}
	public void setPhyscisianId(Integer physcisianId) {
		this.physcisianId = physcisianId;
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
