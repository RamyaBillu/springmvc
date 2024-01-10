package com.repository;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.entity.AdharEntity;
import com.entity.Person;
@Repository
@Transactional
	

public class PersonRepository {
	

	
		@Autowired
		private HibernateTemplate hibernateTemplate;

		public void save(Person person) {
			hibernateTemplate.save(person);
		}

		public void save(AdharEntity entity) {
			hibernateTemplate.save(entity);
		}

		public void update(Person person) {
			hibernateTemplate.update(person);

		}

		public Optional<Person> get(Long id) {
			Person person = hibernateTemplate.get(Person.class, id);
			return Optional.ofNullable(person);
		}

		public List<Person> getAll() {
			List<Person> persons = hibernateTemplate.loadAll(Person.class);
			return persons;
		}

	}



