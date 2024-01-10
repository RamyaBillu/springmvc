package com.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages= {"com.service","com.repository"})
@Import(value = HibernateConfig.class)
public class PersonConfig {
	
	
	}


