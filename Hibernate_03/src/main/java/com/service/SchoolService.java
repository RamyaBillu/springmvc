
package com.service;

import java.util.List;

import com.entity.School;
import com.entity.Student;

public interface SchoolService {
	School save(School person);

	School update(School person);

	School get(long id);

	List<Student> getAll();

	public void save(Student student);

}
