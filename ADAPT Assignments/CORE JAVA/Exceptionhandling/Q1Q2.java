package Exceptionhandling;
public class Q1Q2 {
	public static void main(String[] args) {
		int i ,j ,k;
		i = 3;
		j = 0;
		try {
			k = i/j;
		}
		catch (ArithmeticException a) {
			System.out.print(a);
			throw new UnsupportedOperationException();
		}
	}
}
