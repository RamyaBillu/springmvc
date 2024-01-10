package com.college.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.college.bean.Standard;
import com.college.entity.StandardEntity;
import com.college.service.StandardService;

@Controller
public class CollegeController {

	@Autowired
	private StandardService standardService;

	@RequestMapping(path = "/standard", method = RequestMethod.GET)
	public ModelAndView stantard() {
		return new ModelAndView("standard", "stand", new Standard());

	}

	@RequestMapping(path = "/standard", method = RequestMethod.POST)
	public ModelAndView stantard(@ModelAttribute(name = "stand") Standard standard) {

		standardService.save(standard);
		return new ModelAndView("standard", "stand", standard);
	}

}
