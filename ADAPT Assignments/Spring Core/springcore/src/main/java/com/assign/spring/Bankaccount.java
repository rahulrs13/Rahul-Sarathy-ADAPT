package com.assign.spring;
public class Bankaccount {
private long accountId;
private String  accountHolderName, accountType;
private double accountBalance;
public long getAccountId() {
	return accountId;
}
public void setAccountId(long accountId) {
	this.accountId = accountId;
}
public String getAccountHolderName() {
	return accountHolderName;
}
public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public double getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
}
@Override
public String toString() {
	return "Bankaccount [accountId=" + accountId + ", accountHolderName=" + accountHolderName + ", accountType="
			+ accountType + ", accountBalance=" + accountBalance + "]";
}

}