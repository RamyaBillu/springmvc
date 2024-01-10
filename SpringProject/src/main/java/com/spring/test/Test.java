package com.spring.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.spring.Product1;

public class Test {
	public static void main(String[] args) {
//			BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("webcon.xml"));
//	Product product=(Product)beanFactory.getBean("prod");
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("webcon.xml");
		Product1 product1=(Product1)applicationContext.getBean("prod");
		Product1 p=(Product1)applicationContext.getBean("prod");


		System.out.println(product1);
	}

}
