package com.bae.service;

import org.springframework.stereotype.Service;

@Service
public class PrizeGenServiceImplementation implements PrizeGenService {

	public String getPrize(String num) {

		String prize = "you won $0, sorry";
		int accLen = num.length();
		char accChar = num.charAt(0);

		if (accLen == 11) {
			switch (accChar) {
			case 'a':
				prize = "you won $0, sorry";
				break;
			case 'b':
				prize = "you won $5,000";
				break;
			case 'c':
				prize = "you won $10,000!";
				break;

			}
		} else if (accLen == 9) {
			switch (accChar) {
			case 'a':
				prize = "you won $0, sorry";
				break;
			case 'b':
				prize = "you won $500";
				break;
			case 'c':
				prize = "you won $750!";
				break;

			}
		} else if (accLen == 7) {
			switch (accChar) {
			case 'a':
				prize = "you won $0, sorry";
				break;
			case 'b':
				prize = "you won $50";
				break;
			case 'c':
				prize = "you won $100!";
				break;

			}
		} else {
			return prize;
		}
		return prize;
	}

}
