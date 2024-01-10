package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class DeliveryAddress {

	private Long id;

	private Address address;

	private Cart cart;

	public Long getId() {
		return id;
	}

	public Address getAddress() {
		return address;
	}

	public Cart getCart() {
		return cart;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	@Autowired
//	@Qualifier(value = "cart")
	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "DeliveryAddress [id=" + id + ", Address=" + address + ", cart=" + cart + "]";
	}

}
