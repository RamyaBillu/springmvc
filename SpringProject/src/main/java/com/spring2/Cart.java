package com.spring2;

import org.springframework.stereotype.Component;

@Component
public class Cart {
	private int id;
	private String name;
	public Cart()
	{
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Cart(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", name=" + name + "]";
	}
	

}
