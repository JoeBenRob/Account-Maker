package com.bae.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.service.PrizeGenService;

@RestController
@RequestMapping("/PrizeGen")
public class PrizeGenController {
	
	private PrizeGenService service;
	
	@Autowired
	public PrizeGenController(PrizeGenService service) {
		this.service = service;
	}
	
	public PrizeGenController() {
	}
	
	@GetMapping("/PrizeGen/{num}")
	public ResponseEntity<String> getPrize(@PathVariable String num) {
		return new ResponseEntity<>(service.getPrize(num), HttpStatus.OK);
	}
}
