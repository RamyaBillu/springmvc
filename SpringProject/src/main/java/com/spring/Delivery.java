package com.spring;

public class Delivery {
	private String address;


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Delivery [address=" + address + "]";
	}
	

}
