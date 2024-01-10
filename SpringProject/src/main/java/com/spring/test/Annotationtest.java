package com.spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.ShoppingConfig;
import com.service.ItemService;
import com.service.ItemServiceImpl;
import com.spring2.Cart;
import com.spring2.ConfigClass;
import com.spring2.Item;

public class Annotationtest {
   public static void main(String[] args) {
	AnnotationConfigApplicationContext applicationconfig=new AnnotationConfigApplicationContext
			(ShoppingConfig.class);
//	Item item=applicationconfig.getBean(Item.class);
//	Cart cart=applicationconfig.getBean(Cart.class);
//	System.out.println(cart);
//	System.out.println(item);
	ItemService its = (ItemService) applicationconfig.getBean("myservice",ItemServiceImpl.class);
	String url = its.dburl();
	System.out.println(url);

}
}
