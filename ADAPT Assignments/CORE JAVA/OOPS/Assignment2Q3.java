package OOPS;
import java.util.ArrayList;
class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    public int getCash() {
    	return totalDeposits + creditLimit;	
    }
}
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    public int getCash() {
    	return totalDeposits + fixedDepositAmount;
    }
}
public class Assignment2Q3 {
	 public static int totalCashInBank(ArrayList<Integer> cash){
		 int sum = 0;
		 for (int i=0;i<=cash.size()-1;i++) {
			 sum = sum + cash.get(i);
		 }
		 return sum;
		 }
		    public int getCash(){
				return 0;
		    }
		public static void main(String[] args) {
		ArrayList<Integer> cash = new ArrayList<>();
		CurrentAccount obj1 = new CurrentAccount();
		SavingsAccount obj2 = new SavingsAccount();
		cash.add(obj1.getCash());
		cash.add(obj2.getCash());
		System.out.println(totalCashInBank(cash));
		}
}
