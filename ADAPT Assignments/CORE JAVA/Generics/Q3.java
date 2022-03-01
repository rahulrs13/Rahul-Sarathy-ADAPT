package Generics;
import java.util.Arrays;
public class Q3 {
	public static <T> void swap(T[] a,int i,int j) {
		T temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	public static void main (String[] args) {
		String [] a = {"1","2"};
		System.out.println("Before Swap: "+Arrays.toString(a));
		swap(a,0,1);
		System.out.println("After Swap: "+Arrays.toString(a));
	}
}
