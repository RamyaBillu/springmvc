package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.repository.ItemRepository;
import com.spring2.Item;

@Service(value="myservice")
public class ItemServiceImpl implements ItemService {

		@Value("${url}")
		private String url;
		@Value("${username1}")
		private String username;
		@Value("${password}")
		private String password;
		//private ItemRepository itemRepository;

		public Item save(Item item) {
			return item;
		}

		public Item get(long id) {
			return null;
		}

		public Item update(Item item) {
			return null;
		}

		public void delete(long id) {

		}

		public List<Item> items() {
			return null;
		}

		@Override
		public String dburl() {
			return url+","+username+","+password;
		}

	}


