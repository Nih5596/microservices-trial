package com.develop.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class ExchangeValue {

	@Id
	private Long id;
	private String from1;
	private String to1;
	private BigDecimal conversionMultiple;
	private int port;

	public ExchangeValue() {

	}

	public ExchangeValue(Long id, String from1, String to1,
			BigDecimal conversionMultiple, int port) {
		super();
		this.id = id;
		this.from1 = from1;
		this.to1 = to1;
		this.conversionMultiple = conversionMultiple;
		this.port = port;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom1() {
		return from1;
	}

	public void setFrom1(String from1) {
		this.from1 = from1;
	}

	public String getTo1() {
		return to1;
	}

	public void setTo1(String to1) {
		this.to1 = to1;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}
