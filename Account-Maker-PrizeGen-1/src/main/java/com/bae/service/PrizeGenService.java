package com.bae.service;

import org.springframework.stereotype.Service;

@Service
public interface PrizeGenService {
	String getPrize(String num);
};