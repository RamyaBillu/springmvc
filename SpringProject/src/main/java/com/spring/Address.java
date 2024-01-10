package com.spring;

public class Address {
	private String address1;


	public void init() {
		System.out.println("Init method executed.....!!!");
	}

	public void destory() {
		System.out.println("Destory method executed.....!!!");
	}

	public String getAddress1() {
		return address1;
	}

	
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	@Override
	public String toString() {
		return "Address [address1=" + address1 + "]";
	}

	
	

}
