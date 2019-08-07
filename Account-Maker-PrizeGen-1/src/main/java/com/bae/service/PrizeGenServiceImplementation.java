package com.bae.service;

import org.springframework.stereotype.Service;

@Service
public class PrizeGenServiceImplementation implements PrizeGenService {
	
	public String getPrize(String num) {
		if (Math.random() * 10 < 5) {
			return num;
		}
		else {
			return num;
		}		
	}

}
