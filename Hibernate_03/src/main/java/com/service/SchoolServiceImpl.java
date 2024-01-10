package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.School;
import com.entity.Student;
import com.repository.SchoolRepository;
@Service


public class SchoolServiceImpl implements SchoolService {
	@Autowired
	private SchoolRepository schoolRepository;


	@Override
	public School save(School school) {
		schoolRepository.save(school);
		return school;
	}

	@Override
	public School update(School school) {
		schoolRepository.update(school);
		return school;
	}

	@Override
	public School get(long id) {
		Optional<School> entityOptional = schoolRepository.get(id);
		School school = entityOptional.orElseThrow(() -> new IllegalArgumentException("Recored not found"));
		return school;

	}

	@Override
	public List<Student> getAll() {
		List<Student> students = schoolRepository.getAll();
		return students;
	}

	@Override
	public void save(Student student) {
		schoolRepository.save(student);

		
	}

}
