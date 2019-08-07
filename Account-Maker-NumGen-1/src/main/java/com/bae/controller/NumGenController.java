package com.bae.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.service.NumGenService;

@RestController
@RequestMapping("/NumGen")
public class NumGenController {

	private NumGenService service;
	
	@Autowired
	public NumGenController(NumGenService service) {
		this.service = service;
	}
	
	public NumGenController() {
	}
	
	@GetMapping("/NumGen")
	public ResponseEntity<String> getPrize() {
		return new ResponseEntity<>(service.getNum(), HttpStatus.OK);
	}
}
