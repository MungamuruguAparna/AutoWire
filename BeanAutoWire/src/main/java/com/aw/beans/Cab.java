package com.aw.beans;

public class Cab {
	private Driver driver;

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	@Override
	public String toString() {
		return "Cab [driver=" + driver + "]";
	}
	
	

}
