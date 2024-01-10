package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages= {"com.service","com.repository"})
@Import(value = Hibernate_config.class)
public class Student_course_config {
	
	
	}


