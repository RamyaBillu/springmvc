package com.repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.entity.StudentEntity;

@Repository
@Transactional
public class CourseRepository {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void save(StudentEntity entity) {
		hibernateTemplate.save(entity);
	}

	public void update(StudentEntity entity) {
		hibernateTemplate.update(entity);

	}

	public Optional<StudentEntity> get(Long id) {
		StudentEntity studentEntity = hibernateTemplate.get(StudentEntity.class, id);
		return Optional.ofNullable(studentEntity);
	}

	public List<StudentEntity> getAll() {
		List<StudentEntity> StudentEntities = hibernateTemplate.loadAll(StudentEntity.class);
		return StudentEntities;
	}

}
