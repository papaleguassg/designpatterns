package br.com.psg.designpatterns.facade;

import java.math.BigDecimal;

public class AccountFacade {
	
	private AccountRepository repository;
	
	public AccountFacade() {
		repository = new AccountRepository();
	}

	public Boolean transfer(Long idAccountFrom, Long idAccountTo, BigDecimal value) {
		Account from = repository.findById(idAccountFrom);
		Account to = repository.findById(idAccountTo);
		Transfer transfer = new Transfer();
		transfer.setFrom(from);
		transfer.setTo(to);
		transfer.setValue(value);
		return transfer.execute();
	}
	
}
