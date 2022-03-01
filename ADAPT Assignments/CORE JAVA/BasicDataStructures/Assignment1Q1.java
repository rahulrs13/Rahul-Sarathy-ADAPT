package BasicDataStructures;
import java.util.Scanner;
class ArmstrongOrNot {
    public boolean armstrongCheck(int num) {
    	int d1,d2,d3,c;
		c = num;
		d1 = c%10;
		c = c/10;
		d2 = c%10;
		c = c/10;
		d3 = c%10;
		int result = (d1*d1*d1) + (d2*d2*d2) + (d3*d3*d3);
		System.out.println(result);
		if(num == result) {
			System.out.println("The number is Armstrong");	
		}
		else
		{
			System.out.print("The number is not Armstrong");	
		}
		return false;
    	}
    }
public class Assignment1Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ArmstrongOrNot obj = new ArmstrongOrNot();
		obj.armstrongCheck(num);
		sc.close();
	}
}
