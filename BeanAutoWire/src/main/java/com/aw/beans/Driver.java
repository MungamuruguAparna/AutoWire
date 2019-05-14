package com.aw.beans;

public class Driver {
	private String name;
	private String contactNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	@Override
	public String toString() {
		return "Driver [name=" + name + ", contactNo=" + contactNo + "]";
	}
	
	

}
