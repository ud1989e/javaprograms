package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.modal.Invoice;


public interface InvoiceRepository extends CrudRepository<Invoice, Integer> {

}