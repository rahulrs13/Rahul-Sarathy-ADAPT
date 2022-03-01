package collection;
import java.util.LinkedList;
import java.util.List;
public class Q4 {
	public static void main(String[] args) {
		List<String> date = new LinkedList<>();
		date.add("01-02-2002");
		date.add("21-11-2000");
		date.add("30-01-2012");
		date.add("04-04-2022");
		for (String it : date) {
		String[] strings = it.split("-");
		if((int)Integer.parseInt(strings[2])%4==0 && (int)Integer.parseInt(strings[2])%100==0 && (int)Integer.parseInt(strings[2])%400==0) {
			System.out.println(it+" Leap Year");
		}
		else {
			System.out.println(it+" Not a Leap Year");
		}
    }
	}
}
