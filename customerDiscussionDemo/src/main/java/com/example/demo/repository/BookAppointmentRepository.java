package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.modal.PatientphycisianAssociation;
@Repository
public interface BookAppointmentRepository extends JpaRepository<PatientphycisianAssociation, Integer>{

}
