package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.modal.ProductStock;

public interface ProductStockRepository extends CrudRepository<ProductStock, Integer> {

}