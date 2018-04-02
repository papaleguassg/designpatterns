package br.com.psg.designpatterns.facade;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class AccountFacadeTest {

	@Test
	public void should_transfer_money() {
		AccountFacade facade = new AccountFacade();
		Assert.assertTrue(facade.transfer(1l, 2l, new BigDecimal("500.0")));
	}
	
}
