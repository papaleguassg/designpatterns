package br.com.psg.designpatterns.facade;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * A fake repository
 * @author leandroulisses
 */
public class AccountRepository {

	private static Map<Long, Account> accounts = new HashMap<>();
	
	static {
		Account account = new Account();
		account.setId(1l);
		account.setName("Ozzy Osbourne");
		account.setValue(new BigDecimal("600.0"));
		accounts.put(1l, account);
		
		account = new Account();
		account.setId(2l);
		account.setName("Michael Jackson");
		account.setValue(new BigDecimal("1600.0"));
		accounts.put(2l, account);
	}
	
	
	public static Account findById(Long id) {
		return accounts.get(id);
	}
	
}
