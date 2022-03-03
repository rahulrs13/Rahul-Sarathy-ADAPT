package Lambda;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.Map.Entry;
class Details implements Comparable<Details>{
	private String name;
	private String email;
	private String gender;
	
	public Details(String name, String email, String gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getGender() {
		return gender;
	}
	@Override
	public String toString() {
		return "Name:"+name+" Email:"+email+" Gender:"+gender;
	}
	@Override
	public int compareTo(Details o) {
		return this.getName().compareTo(o.getName());
	}
	
}
class phoneNumber implements Comparable<phoneNumber>{
	private long number;

	public phoneNumber(long number) {
		super();
		this.number = number;
	}
	public long getNumber() {
		return number;
	}
	public String toString() {
		return String.valueOf(number);
		
	}
	@Override
	public int compareTo(phoneNumber o) {
		return this.toString().compareTo(o.toString());
	}	
}
public class Assignment4Q7 {
	public static void main(String[] args) {
		Details D1 = new Details("Rahul", "Ra@gmail.com", "Male");
		Details D2 = new Details("hiiw", "hi@gmail.com", "Male");
		Details D3 = new Details("Heema", "hm@gmail.com", "Male");
		Details D4 = new Details("Jithin", "ch@gmail.com", "Male");
		Details D5 = new Details("Shyam", "sh@gmail.com", "Male");
		phoneNumber P1 = new phoneNumber(9505962633l);
		phoneNumber P2 = new phoneNumber(9515962633l);
		phoneNumber P3 = new phoneNumber(9525962633l);
		phoneNumber P4 = new phoneNumber(9535962633l);
		phoneNumber P5 = new phoneNumber(9545962633l);
		Map<phoneNumber, Details> map = new TreeMap<>();
		map.put(P1,D1);
		map.put(P2,D2);
		map.put(P3,D3);
		map.put(P4,D4);
		map.put(P5,D5);
		newStringBuilder(map,p->System.out.println(p));
	}
	private static void newStringBuilder(Map<phoneNumber, Details> map,Consumer<StringBuilder> consumer) {
		StringBuilder stringBuilder =new StringBuilder();
		for(Entry<phoneNumber, Details> entry:map.entrySet()) {
			stringBuilder.append(entry.getKey());
			stringBuilder.append(entry.getValue());
		}
		consumer.accept(stringBuilder);	
	}
}
