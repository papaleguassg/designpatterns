package br.com.psg.designpatterns.facade;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class AccountFacadeTest {

	@Test
	public void should_subtract_money() {
		AccountFacade facade = new AccountFacade();
		Assert.assertTrue(facade.transfer(1l, 2l, new BigDecimal("500.0")));
		Assert.assertEquals(new BigDecimal("100.0"), AccountRepository.findById(1l).getValue());
	}
	
	@Test
	public void should_add_money() {
		AccountFacade facade = new AccountFacade();
		Assert.assertTrue(facade.transfer(1l, 2l, new BigDecimal("500.0")));
		Assert.assertEquals(new BigDecimal("2600.0"), AccountRepository.findById(2l).getValue());
	}
	
	@Test(expected = RuntimeException.class)
	public void should_thow_an_exception() {
		AccountFacade facade = new AccountFacade();
		Assert.assertTrue(facade.transfer(1l, null, new BigDecimal("500.0")));
	}
	
}
