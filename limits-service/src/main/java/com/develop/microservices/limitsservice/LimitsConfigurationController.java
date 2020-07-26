package com.develop.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.develop.microservices.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configuration config;

	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsConfiguration() {
		return new LimitConfiguration(config.getMaximum(), config.getMinimum());
	}
}
