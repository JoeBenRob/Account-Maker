package com.bae.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bae.persistence.domain.Account;

@Service
public interface AccountService {

	Account getAccount(Long id);

	List<Account> getAllAccounts();

	Account createAccount(Account account);
	
	public String getPrize(String num);
	
	public String getNum(); 
}
