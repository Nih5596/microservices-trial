package com.develop.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository
		extends
			JpaRepository<ExchangeValue, Long> {

	ExchangeValue findByFrom1AndTo1(String from, String to);
}
