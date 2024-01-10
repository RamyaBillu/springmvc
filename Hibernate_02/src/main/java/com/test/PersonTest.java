package com.test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.PersonConfig;
import com.entity.AdharEntity;
import com.entity.Person;
import com.service.PersonService;

public class PersonTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(PersonConfig.class);
        PersonService personService=context.getBean(PersonService.class);
        AdharEntity adharentity=new AdharEntity();
        adharentity.setAddress("bangalore");
        personService.save(adharentity);
        Person person=new Person();
        person.setName("dhraksha");
        person.setLocation("india");
        person.setEntity(adharentity);
        person.setEntity(adharentity);
        personService.save(person);
        List<Person> persons = personService.getAll();
		for (Person entity2 : persons) {
			System.out.println(entity2.getId());
			System.out.println(entity2.getName());
			System.out.println(entity2.getLocation());
			System.out.println(entity2.getEntity());
			System.out.println("------------------------------");
		}


        
	}

}
