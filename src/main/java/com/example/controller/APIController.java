package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.manager.Manager;
import com.example.manager.TYPE;
import com.example.models.Request;

@RestController
public class APIController {
	private static final Logger logger = LoggerFactory.getLogger(APIController.class);
	private Manager manager = Manager.getInstance();
	
	
	@GetMapping(path="/test1")
	public String test1(@RequestParam(name = "test", required = true) String test) {
		Request re = new Request();
		re.test = test;
		return manager.work(re, TYPE.TEST1);

	}
	
	@PostMapping(path="test2")
	public String test2(@RequestBody Request re) {
		return manager.work(re, TYPE.TEST2);
	}
	
}
