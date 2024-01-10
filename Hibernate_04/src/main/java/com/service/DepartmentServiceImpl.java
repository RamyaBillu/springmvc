package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Department;
import com.entity.Student;
import com.repository.DepartmentRepository;
@Service

public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentRepository deptRepository;


	@Override
	public Department save(Department dept) {
		deptRepository.save(dept);
		return dept;
	}

	@Override
	public Department update(Department dept) {
		deptRepository.update(dept);
		return dept;
	}

	@Override
	public Department get(long id) {
		Optional<Department> entityOptional = deptRepository.get(id);
		Department dept = entityOptional.orElseThrow(() -> new IllegalArgumentException("Recored not found"));
		return dept;

	}

	@Override
	public List<Student> getAll() {
		List<Student> students = deptRepository.getAll();
		return students;
	}

	@Override
	public void save(Student student) {
		deptRepository.save(student);
		
	}

}
