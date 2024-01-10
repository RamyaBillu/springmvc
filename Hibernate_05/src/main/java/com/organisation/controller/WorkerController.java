package com.organisation.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.organisation.bean.Worker;

@Controller
public class WorkerController {

	private static Logger log = LoggerFactory.getLogger(WorkerController.class.getSimpleName());

	@RequestMapping(path = "/worker", method = RequestMethod.GET)
	public ModelAndView worker() {
		Map map = new HashMap();
		map.put("headerName", "Worker");

		return new ModelAndView("worker", "work", new Worker()).addAllObjects(map);
	}

	@RequestMapping(path = "/worker", method = RequestMethod.POST)
	public ModelAndView createWorker(@ModelAttribute Worker worker) {
		log.info(worker.toString());
		return new ModelAndView("worker", "work", worker);
	}

}
