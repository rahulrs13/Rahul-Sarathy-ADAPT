package com.assign.spring;
import org.springframework.beans.factory.annotation.Autowired;
public class BankAccountServiceImpl implements BankAccountService {
    
	@Autowired
	private BankAccountepositoryImpl repoimp;
	@Override
	public double withdraw(long accountId, double balance) {
		double withdraw = repoimp.getBalance(accountId) - balance;
		repoimp.updateBalance(accountId, balance);
		System.out.println("Withdraw "+ withdraw);	
		return accountId; 		
	}

	@Override
	public double deposit(long accountId, double balance) {
		double deposite = repoimp.getBalance(accountId) + balance;
		repoimp.updateBalance(accountId, balance);
		System.out.println("Deposite "+deposite);
		return accountId;
	}

	@Override
	public double getBalance(long accountId) {
		System.out.println("Balance "+ repoimp.getBalance(accountId));
		return accountId;
	}

	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double amont) {
	     fromAccount = 223134563;
	     toAccount = 892671930;
	     amont = 1203;
	     repoimp.updateBalance(toAccount, amont);
		return true;
	}
	

}
