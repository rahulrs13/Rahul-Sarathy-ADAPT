package Strings;
public class String123 {
	public static void main(String[] args) {
		String str = "Hello World";
		System.out.println(str.length());
		String a = "Hello,";
		String b = "How are you?";
		System.out.println(a.concat(b));
		String c = "Java String pool refers to collection of Strings which are stored in heap memory";
		System.out.println(c.toLowerCase());
		System.out.println(c.toUpperCase());
		System.out.println(c.replace('a', '$'));
		System.out.println(c.matches("java string pool refers to collection of strings which are stored in heap memory"));
		System.out.println(c.equalsIgnoreCase("java string pool refers to collection of strings which are stored in heap memory"));	
	}
}
