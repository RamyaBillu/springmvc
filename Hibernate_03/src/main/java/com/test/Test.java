package com.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.SchoolConfig;
import com.entity.School;
import com.entity.Student;
import com.service.SchoolService;


public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SchoolConfig.class);
     SchoolService schoolService= context.getBean(SchoolService.class);
     Student student=new Student();
     student.setName("vaishali");
     schoolService.save(student);
     
     Student student1=new Student();
     student1.setName("shalini");
     schoolService.save(student1);

     Student student2=new Student();
     student2.setName("ishu");
     schoolService.save(student2);
     
     List<Student>students=new ArrayList();
     students.add(student);
     students.add(student1);
     students.add(student2);



     
     School school=new School();
     school.setName("Vidyanikethan");
     school.setAddress("tirupati");
     school.setStudents(students);
     schoolService.save(school);
     
     
     
     

	}

}
