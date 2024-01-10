
package com.service;

import java.util.List;

import com.entity.Department;
import com.entity.Student;

public interface DepartmentService {
	Department save(Department dept);

	Department update(Department dept);

	Department get(long id);

	List<Student> getAll();

	public void save(Student student);

}
