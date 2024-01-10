package com.spring;


public class AlternateDeliveryAddress {

	private Long id;

	private Address address;

	private Cart cart;

	public AlternateDeliveryAddress(Long id, Address address, Cart cart) {
		this.id = id;
		this.address = address;
		this.cart = cart;
	}

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

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "AlternateDeliveryAddress [id=" + id + ", address=" + address + ", cart="
				+ cart + "]";
	}

}



