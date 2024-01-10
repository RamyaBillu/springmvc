package com.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.DepartmentConfig;
import com.entity.Department;
import com.entity.Student;
import com.service.DepartmentService;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DepartmentConfig.class);
		DepartmentService deptService = context.getBean(DepartmentService.class);
		Department dept = new Department();
		dept.setName("cse");


		Student student = new Student();
		student.setName("vaishali");
		student.setDept(dept);

		
		List<Student> students = new ArrayList<>();
		students.add(student);
		
//		dept.setStudents(students);
		deptService.save(student);


		deptService.save(dept);

	}

}
