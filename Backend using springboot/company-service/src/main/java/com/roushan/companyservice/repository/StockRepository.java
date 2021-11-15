package com.roushan.companyservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.roushan.companyservice.entity.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer>{

}
