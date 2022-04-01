package com.assign.spring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Bankapp {
	public static void main(String[] args) {
	
		ApplicationContext con = new ClassPathXmlApplicationContext("comass.xml");
		Bankaccount bnk = (Bankaccount) con.getBean("bnka");
		BankAccountController bkcon = (BankAccountController) con.getBean("bcon");
	    BankAccountServiceImpl simpl = (BankAccountServiceImpl) con.getBean("sil");
	    BankAccountepositoryImpl reimpl = (BankAccountepositoryImpl) con.getBean("ril");
	    
	    bnk.toString();
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter deposit amount : ");
			double depositAmount = sc.nextDouble();
			bkcon.deposit(bnk.getAccountId(), depositAmount);
			break;
		case 2:
			double withdrawAmount = sc.nextDouble();
			bkcon.withdraw(bnk.getAccountId(), withdrawAmount);
			break;
		case 3:
			bkcon.getBalance(bnk.getAccountId());
			break;
		case 4:
			System.out.println("Enter Fund Transfer amount : ");
			double transferAmount = sc.nextDouble();
			bkcon.fundTransfer(bnk.getAccountId(), choice, transferAmount);
			break;
		default:
		}
	}
}
