package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.modal.Phycisian;

@Repository
public interface PhycisianRepository  extends JpaRepository<Phycisian, Integer>{

}
