package com.assign.spring;

public class BankAccountepositoryImpl implements Bankaccrepository {
    
	Bankaccount b = new Bankaccount();
	
	@Override
	public double getBalance(long accountId) {
		if(b.getAccountId()==accountId) {
			return b.getAccountBalance();
		}
		else {
			return b.getAccountBalance();
		}
		
	}

	@Override
	public double updateBalance(long accountId, double newBalance) {
		double updateBalance = 100;
		if(b.getAccountId()==accountId) {
			updateBalance = newBalance;
			b.setAccountBalance(newBalance);
			System.out.println("Updated Balance"+getBalance(accountId));
		}
		else {
			updateBalance = newBalance;
			b.setAccountBalance(updateBalance);
		}
		return updateBalance;
	}
	 


}
