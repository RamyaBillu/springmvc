package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.StudentEntity;
import com.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepository courseRepository;



	@Override
	public StudentEntity save(StudentEntity entity) {
		courseRepository.save(entity);
		return entity;
	}

	@Override
	public StudentEntity update(StudentEntity entity) {
		courseRepository.update(entity);
		return entity;
	}

	@Override
	public StudentEntity get(long id) {
		Optional<StudentEntity> entityOptional=
		courseRepository.get(id);
	StudentEntity studentEntity = entityOptional
				.orElseThrow(() -> new IllegalArgumentException("Recored not found"));
		return studentEntity;

	}

	@Override
	public List<StudentEntity> getAll() {
		List<StudentEntity> studentEntities = courseRepository.getAll();
		return studentEntities;
	}
		

}
