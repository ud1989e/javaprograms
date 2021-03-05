package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.modal.ProductStock;
import com.example.demo.modal.StockDeatils;


public interface StockDetailsRepository extends CrudRepository<StockDeatils, Integer> {
    
	/*@Query(value = "SELECT JOB_INSTANCE_ID, JOB_EXECUTION_ID, JOB_NAME, JOB_TYPE, START_TIME, END_TIME, STATUS, USERNAME  FROM JOBS_VW", nativeQuery = true)
    List<Job> getAll(); */
    @Query(value = "SELECT `product_id`,`product_name`,`totalprice`,`totalquantity` from stock_deatils_view where product_id=?1", nativeQuery = true)
    List<StockDeatils> getStocksByProductId(Integer producId);

}