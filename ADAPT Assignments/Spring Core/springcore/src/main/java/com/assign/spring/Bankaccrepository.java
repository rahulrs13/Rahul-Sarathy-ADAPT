package com.assign.spring;

import org.springframework.stereotype.Component;

@Component
public interface Bankaccrepository {
	public double getBalance(long accountId);
	public double updateBalance(long accountId, double newBalance);
}
