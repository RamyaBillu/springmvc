package com.college.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.bean.Standard;
import com.college.entity.StandardEntity;
import com.college.repository.StandardRepository;

@Service
public class StandardServiceImpl implements StandardService {

	@Autowired
	private StandardRepository standardRepository;

	@Override
	public void save(Standard standard) {
		StandardEntity entity = new StandardEntity();
		entity.setCount(standard.getCount());
		entity.setName(standard.getName());
		entity.setFaculty(standard.getFaculty());
		standardRepository.save(entity);
	}

}
