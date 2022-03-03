package Lambda;
import java.util.ArrayList;
public class Assignment4Q4 {
	String words;
	public Assignment4Q4(String words) {
			super();
			this.words = words;
		}
	public static ArrayList<String> removeOddLength(ArrayList<String> stringList){
		ArrayList<String> removeOddLength = new ArrayList<String>();
		stringList.stream().filter(word-> word.length() % 2 != 0).forEach(word -> System.out.println(word));
		return removeOddLength;
	}
	public static void main(String[] args) {
		 ArrayList<String> stringList = new ArrayList<>();		
	     stringList.add("Hello");
	     stringList.add("He");
	     stringList.add("hey");
	     stringList.add("popeyo");
	     removeOddLength(stringList);
		}
}
