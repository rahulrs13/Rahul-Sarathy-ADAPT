package Exceptionhandling;

import java.util.Scanner;
public class Q3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double balance,withdraw,deposite;
		long id;
		balance = 1000;
		System.out.print("Enter ID: ");
		id = sc.nextLong();
		System.out.println("Account balance: "+balance);
		deposite = sc.nextDouble();
		balance += deposite;
		System.out.println("Balance:"+ balance);
		try {
			withdraw = sc.nextDouble();
			if (withdraw>balance) {
				throw new InsufficientBalanceException("InsufficientBalanceException");
			}
			else if (withdraw<0) {
				throw new IllegalBankTransactionException("IllegalBankTransactionException");
			}
		}
		catch (InsufficientBalanceException a){
			System.out.println(a);
		}
		catch (IllegalBankTransactionException a) {
			System.out.println(a);
		}
}
}
