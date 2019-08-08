package com.bae.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bae.persistence.domain.Account;
import com.bae.persistence.domain.SentAccount;
import com.bae.persistence.repository.AccountRepository;

@Service
public class AccountServiceImplementation implements AccountService {

	private AccountRepository repository;

	private RestTemplate restTemplate;

	@Autowired
	private JmsTemplate jmsTemplate;

	@Autowired
	public AccountServiceImplementation(AccountRepository repository, RestTemplate restTemplate) {
		this.repository = repository;
		this.restTemplate = restTemplate;
	}

	@Override
	public Account getAccount(Long id) {
		Account accountToGet = repository.findById(id).get();
		return accountToGet;

	}

	@Override
	public List<Account> getAllAccounts() {
		return repository.findAll();
	}

	@Override
	public Account createAccount(Account account) {
		String num = getNum();
		account.setAccountNumber(num);
		account.setPrize(getPrize(num));
		sendToQueue(account);
		return repository.save(account);
	}

	@Override
	public String getNum() {

		ResponseEntity<String> exchangeNum = restTemplate.exchange("http://account-maker-numgen:8083/NumGen/NumGen/",
				HttpMethod.GET, null, String.class);

		return exchangeNum.getBody();
	}

	@Override
	public String getPrize(String num) {

		ResponseEntity<String> exchangePrize = restTemplate.exchange("http://account-maker-prizegen:8082/PrizeGen/PrizeGen/" + num,
				HttpMethod.GET, null, String.class);

		return exchangePrize.getBody();
	}

	private void sendToQueue(Account account) {
		SentAccount accountToStore = new SentAccount(account);
		jmsTemplate.convertAndSend("AccountQueue", accountToStore);
	}

}
