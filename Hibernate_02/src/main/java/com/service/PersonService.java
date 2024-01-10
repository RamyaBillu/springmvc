package com.service;

import java.util.List;

import com.entity.AdharEntity;
import com.entity.Person;

public  interface PersonService {
	 Person save(Person person);
	Person update(Person person);
	Person get(long id);
	List<Person>getAll();
	public void save (AdharEntity entity);
	

}
