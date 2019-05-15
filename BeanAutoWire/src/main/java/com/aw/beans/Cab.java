package com.aw.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("cab")
public class Cab {
	@Autowired
	@Qualifier("driver1")
	private Driver driver;
	@Autowired
	private Ride ride;
	
	public void setRide(Ride ride) {
		this.ride = ride;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	@Override
	public String toString() {
		return "Cab [driver=" + driver + ", ride=" + ride + "]";
	}
	
	

}
