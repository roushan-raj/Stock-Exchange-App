package com.roushan.exchangeservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roushan.exchangeservice.entity.StockExchange;
import com.roushan.exchangeservice.repository.StockExchangeRepository;

@Service
public class StockExchangeService {
	
	@Autowired
	private StockExchangeRepository stockExchangeRepository;
	
	public List<StockExchange> getAllStockExchanges(){
		return stockExchangeRepository.findAll();
	}
	
	public StockExchange addStockExchange(StockExchange stockExchange) {
		return stockExchangeRepository.save(stockExchange);
	}
	
	public StockExchange getStockExchangeById(int id) {
		Optional<StockExchange> stockExchangeOptional = stockExchangeRepository.findById(id);
		if(stockExchangeOptional.isPresent())
			return stockExchangeOptional.get();
		return null;
	}
	
}
