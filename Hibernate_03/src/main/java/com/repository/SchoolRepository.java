package com.repository;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.entity.School;
import com.entity.Student;


@Repository
@Transactional
	

public class SchoolRepository {
	

	
		@Autowired
		private HibernateTemplate hibernateTemplate;

		public void save(School school) {
			hibernateTemplate.save(school);
		}

		public void save(Student student) {
			hibernateTemplate.save(student);
		}

		public void update(School school) {
			hibernateTemplate.update(school);

		}

		public Optional<School> get(Long id) {
			School school = hibernateTemplate.get(School.class, id);
			return Optional.ofNullable(school);
		}

		public List<Student> getAll() {
			List<Student> students = hibernateTemplate.loadAll(Student.class);
			return students;
		}

	}




