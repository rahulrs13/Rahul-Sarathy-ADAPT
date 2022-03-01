package BasicDataStructures;
class ArmstrongNumBetweenRange{
	public int amstrongNumbersInRange(int min, int max) {
		int d1,d2,d3;
		for (int i = min;i<=max;i++)
		{
			int c = i;
			d1 = c%10;
			c = c/10;
			d2 = c %10;
			c = c/10;
			d3 = c%10;
			int b = (d1*d1*d1) + (d2*d2*d2) + (d3*d3*d3);
			if (i == b)
			{
			System.out.println(i + " Is a Amstrong");	
			}
		}
		return 0;
	}
}
public class Assignment1Q2 {
	public static void main(String args[])
	{
		int no1 = 100;
		int no2 = 999;
		ArmstrongNumBetweenRange obj = new ArmstrongNumBetweenRange();
		obj.amstrongNumbersInRange(no1, no2);

	}
}
