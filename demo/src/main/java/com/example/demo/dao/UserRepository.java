package com.example.demo.dao;



import org.springframework.data.repository.CrudRepository;

import com.example.demo.modal.Student;



// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<Student, Integer> {

}