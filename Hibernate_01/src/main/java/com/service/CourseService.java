package com.service;

import java.util.List;

import com.entity.StudentEntity;

public interface CourseService {
	StudentEntity save(StudentEntity entity);
	StudentEntity update(StudentEntity entity);
	StudentEntity get(long id);
	List<StudentEntity>getAll();
	

}
