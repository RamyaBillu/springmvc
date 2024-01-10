package com.service;

import java.util.List;

import org.springframework.stereotype.Component;


import com.spring2.Item;
@Component
public interface ItemService {

		public Item save(Item item);

		public Item get(long id);

		public Item update(Item item);

		public void delete(long id);

		public List<Item> items();
		
		public String dburl();

	}


