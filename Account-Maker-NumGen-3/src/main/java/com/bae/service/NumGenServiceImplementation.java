package com.bae.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class NumGenServiceImplementation implements NumGenService {
	
	public String getNum() {
		Random rnd = new Random();
		char alpha = (char) (rnd.nextInt(3) + 'a');
		String num = String.format("%06d", rnd.nextInt(99999));
		return String.valueOf(alpha) + num;
	}
}