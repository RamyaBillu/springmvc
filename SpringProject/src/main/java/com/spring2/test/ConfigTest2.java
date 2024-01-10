package com.spring2.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.ItemService;
import com.service.ItemServiceImpl;
import com.spring2.Cart;
import com.spring2.Item;
import com.spring2.LoadConfig;

public class ConfigTest2 {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				new String[] { "configuration.xml" });

//				Cart cart = applicationContext.getBean(Cart.class);
//				System.out.println(cart);
//
//				Item item = applicationContext.getBean(Item.class);
//				System.out.println(item);

//		LoadConfig config = applicationContext.getBean(LoadConfig.class);
//
		System.out.println(applicationContext.getBean(Cart.class));
		System.out.println(applicationContext.getBean(Item.class));
		
		applicationContext.registerShutdownHook();

	}

}
