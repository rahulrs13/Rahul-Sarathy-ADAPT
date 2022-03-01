package collection;
import java.util.HashSet;
import java.util.Set;
public class Q2 {
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();
		s.add(2);
		s.add(12);
		s.add(55);
		s.add(93);
		s.add(44);
		s.add(15);
		s.add(53);
		s.add(91);
		s.add(3);
		s.add(6);
		System.out.println(s);
		s.add(12); //duplicate number rejected
	}
}
