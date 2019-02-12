package com.handzap.assignment.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.handzap.assignment.service.ScrapService;

@RestController
public class Endpoint {
	
	@Autowired
	ScrapService service;
	
	@GetMapping("/getAllAnchors")
	public void getAnchors() {
		service.getAnchors();
	}

}
