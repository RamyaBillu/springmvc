package com.repository;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.entity.Department;
import com.entity.Student;


@Repository
@Transactional
public class DepartmentRepository {
	

	
		@Autowired
		private HibernateTemplate hibernateTemplate;

		public void save(Department dept) {
			hibernateTemplate.save(dept);
		}

		public void save(Student student) {
			hibernateTemplate.save(student);
		}

		public void update(Department dept) {
			hibernateTemplate.update(dept);

		}

		public Optional<Department > get(Long id) {
			Department dept = hibernateTemplate.get(Department.class, id);
			return Optional.ofNullable(dept);
		}

		public List<Student> getAll() {
			List<Student> students = hibernateTemplate.loadAll(Student.class);
			return students;
		}

	}




