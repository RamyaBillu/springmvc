package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.AdharEntity;
import com.entity.Person;
import com.repository.PersonRepository;

@Service

public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;

	@Override
	public Person save(Person person) {
		personRepository.save(person);
		return person;
	}

	@Override
	public Person update(Person person) {
		personRepository.update(person);

		return person;
	}

	@Override
	public Person get(long id) {
		Optional<Person> entityOptional = personRepository.get(id);
		Person person = entityOptional.orElseThrow(() -> new IllegalArgumentException("Recored not found"));
		return person;

	}

	@Override
	public List<Person> getAll() {
		List<Person> persons = personRepository.getAll();
		return persons;
	}

	public void save(AdharEntity entity) {
		personRepository.save(entity);
		
	}

}
