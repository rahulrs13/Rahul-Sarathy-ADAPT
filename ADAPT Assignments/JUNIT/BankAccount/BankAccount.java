package junitassignment;
public class BankAccount {
  public int withdraw(int w) throws InsufficientFundsExpcetion {
	  int balance = 1800;
		  if (w>balance)
			  throw new InsufficientFundsExpcetion("InsufficientFundsExpcetion");
		return w;
  }
}