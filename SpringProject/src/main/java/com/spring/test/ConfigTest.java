package com.spring.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.AlternateDeliveryAddress;
import com.spring.DBConnection;
import com.spring.DeliveryAddress;
import com.spring.Product;

public class ConfigTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("webcon.xml");

		Product product2 = (Product) applicationContext.getBean("product-2");
         DeliveryAddress Da=(DeliveryAddress)applicationContext.getBean("deliveryAddress");
		System.out.println(product2);
		System.out.println(Da);
		


		
		
	}

}
