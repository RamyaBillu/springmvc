package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.ItemRepository;
import com.spring2.Item;

@Service(value = "specialService")
	public class SpecialItemServiceImpl implements ItemService {

		//@Autowired
		private ItemRepository itemRepository;

		

		public Item get(long id) {
			return null;
		}

		

		public void delete(long id) {

		}

		public List<Item> items() {
			return null;
		}

		@Override
		public Item save(Item item) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Item update(Item item) {
			// TODO Auto-generated method stub
			return null;
		}



		@Override
		public String dburl() {
			// TODO Auto-generated method stub
			return null;
		}
}



