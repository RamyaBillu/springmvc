package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.service.ItemService;

@Configuration
@ComponentScan(basePackages = { "com.service" })
@PropertySource(value = "db.properties")

public class ShoppingConfig {
	
	@Autowired
	@Qualifier(value = "myservice")
	private ItemService myservice;

}
