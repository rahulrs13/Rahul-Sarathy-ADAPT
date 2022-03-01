package BasicDataStructures;
import java.util.Scanner;
class SiCi {
public double simpleInterest(double principalAmount,int time,double interestRate) {
		double simpleInterest;
		simpleInterest = (principalAmount*time*interestRate)/100;
		System.out.print("Simple Interest : "+ simpleInterest);
		return simpleInterest;
}
	public double compoundInterest(double principalAmount, int time, double interestRate) {
		double compoundInterest;
		compoundInterest = principalAmount * Math.pow((1 + interestRate),time)-principalAmount;
		System.out.print("Compound Interest : "+ compoundInterest);
		return compoundInterest;
}
}
public class Assignment1Q3 {
	public static void main(String[] args) {
		SiCi obj = new SiCi();
		Scanner sc = new Scanner(System.in);
		double interestRate = sc.nextDouble();
		int time = sc.nextInt();
		double principalAmount = sc.nextDouble();
		obj.simpleInterest(principalAmount,time,interestRate);
		interestRate = sc.nextDouble();
		time = sc.nextInt();
		principalAmount = sc.nextDouble();
		obj.compoundInterest(principalAmount, time, interestRate);
		sc.close();
		}
}
