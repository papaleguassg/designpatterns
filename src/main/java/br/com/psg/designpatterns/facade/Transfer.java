package br.com.psg.designpatterns.facade;

import java.math.BigDecimal;

public class Transfer {
	
	private Account from;
	private Account to;
	private BigDecimal value;
	
	public Account getFrom() {
		return from;
	}
	public void setFrom(Account from) {
		this.from = from;
	}
	public Account getTo() {
		return to;
	}
	public void setTo(Account to) {
		this.to = to;
	}
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	
	public Boolean execute() {
		getFrom().setValue(getFrom().getValue().subtract(value));
		getTo().setValue(getTo().getValue().add(value));
		return true;
	}
	
}
