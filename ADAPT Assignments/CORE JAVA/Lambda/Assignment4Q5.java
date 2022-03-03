package Lambda;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class Assignment4Q5 {
	static List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
    public static void main(String[] args) { 
    	Assignment4Q5.processWords(list);
    }
    public static String processWords(List<String> list) {
        
        Consumer<List<String>> displayFirst = test_list -> {
            
            list.stream().forEach(a -> System.out.print(a.charAt(0) + " "));
            
        };
        displayFirst.accept(list);
        return null;
    }
}
