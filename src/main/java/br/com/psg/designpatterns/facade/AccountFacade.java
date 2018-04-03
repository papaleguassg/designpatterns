package br.com.psg.designpatterns.facade;

import java.math.BigDecimal;

public class AccountFacade {
	
	public Boolean transfer(Long idAccountFrom, Long idAccountTo, BigDecimal value) {
		Account from = AccountRepository.findById(idAccountFrom);
		Account to = AccountRepository.findById(idAccountTo);
		Transfer transfer = new Transfer();
		transfer.setFrom(from);
		transfer.setTo(to);
		transfer.setValue(value);
		return transfer.execute();
	}
	
}
