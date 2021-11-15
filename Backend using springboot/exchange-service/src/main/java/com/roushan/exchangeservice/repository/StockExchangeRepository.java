package com.roushan.exchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.roushan.exchangeservice.entity.StockExchange;

@Repository
public interface StockExchangeRepository extends JpaRepository<StockExchange, Integer> {

}
