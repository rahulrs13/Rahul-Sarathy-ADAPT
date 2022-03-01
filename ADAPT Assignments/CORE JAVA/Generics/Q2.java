package Generics;
import java.util.HashMap;
import java.util.Map.Entry;
public class Q2 {
	public static void main(String[] args) {
		HashMap<Integer,Double> aa = new HashMap<>();
		aa.put(1, 2.3);
		aa.put(2, 1.4);
		aa.put(3, 3.8);
		aa.put(4, 8.3);
		aa.put(5, 7.7);
		aa.put(6, 6.8);
		aa.put(7, 5.2);
		aa.put(8, 6.9);
		aa.put(9, 4.2);
		aa.put(10, 9.1);
		for (Entry<Integer, Double> c :aa.entrySet()) {
			System.out.println(c);
		}
	}
}
