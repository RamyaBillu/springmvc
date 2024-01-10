package com.spring;

public class Product1 {
	private String name;
	private  double price;
	private Delivery d;
	public Product1() {
		System.out.println("hiii");
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Delivery getD() {
		return d;
	}
	public void setD(Delivery d) {
		this.d = d;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", d=" + d + "]";
	}
	
	
}
	
	