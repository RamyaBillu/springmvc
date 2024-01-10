package com.spring2;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
public class LoadConfig {

	@Bean(initMethod = "init")
	public Item createItem() {
		Item item = new Item();
		item.setName("Jean");
		item.setId(10);
		return item;
	}

	@Bean
	public Cart createCart() {
		Cart cart = new Cart();
		cart.setName("CART-1");
		cart.setId(20);
		return cart;
	}

}



