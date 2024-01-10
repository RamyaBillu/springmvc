package com.test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.Student_course_config;
import com.entity.StudentEntity;
import com.service.CourseService;

public class StudentTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Student_course_config.class);

		CourseService courseService = context.getBean(CourseService.class);

		StudentEntity entity = new StudentEntity();
		entity.setName("java");
		entity.setFee(100000.00);

		courseService.save(entity);
		List<StudentEntity> studentEntities = courseService.getAll();
		for (StudentEntity entity2 : studentEntities) {
			System.out.println(entity2.getId());
			System.out.println(entity2.getName());
			System.out.println(entity2.getFee());
			System.out.println("------------------------------");
		}

		context.close();

	}

}
