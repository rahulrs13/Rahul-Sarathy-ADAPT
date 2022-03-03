package Lambda;
import java.util.Arrays;
import java.util.List;
public class Assignment4Q6 {
	static List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
	public static void main(String[] args) {
		Assignment4Q6.convertToUpperCase(list);
	}
	public static List<String> convertToUpperCase(List<String> list) {
		 list.replaceAll(s-> s.toUpperCase());
		 System.out.println(list);
		 return list;
		
		} 
}
