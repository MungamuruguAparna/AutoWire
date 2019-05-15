package com.aw.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.aw.beans.Cab;
import com.aw.beans.Driver;
import com.aw.beans.Ride;

@Configuration
@ComponentScan("com.aw.beans")
public class AppConfig {
	 
	@Bean
	public Driver driver() {
		Driver driver =new Driver();
		driver.setContactNo("4421222");
		driver.setName("robert");
		return driver;
	}
	@Bean
	public Driver driver1() {
		Driver driver =new Driver();
		driver.setContactNo("4421222");
		driver.setName("smith");
		return driver;
	}
	
	@Bean
	public Ride ride() {
		Ride ride=new Ride();
		ride.setDestination("madhapur");
		ride.setSource("ammerpet");
		return ride;
	}
	

}
