package com.suthan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import brave.sampler.Sampler;

@Configuration
public class AppConfig {
	// collect data from slueth to provide to Zipclient data
	@Bean
	public Sampler samplerObject() {
		//return Sampler.NEVER_SAMPLE;
		
		return Sampler.ALWAYS_SAMPLE;
	
	}
	
	@Bean
	public  RestTemplate rt() {
		return new RestTemplate();
		
	}

}
