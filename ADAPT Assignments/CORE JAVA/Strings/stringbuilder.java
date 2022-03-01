package Strings;
public class stringbuilder {
	public static void main(String[] args) {
		StringBuilder a = new StringBuilder();
		a.append("StringBuffer,is a peer class of String that provide much of the fuctionality of strings");
		System.out.println(a);
		StringBuilder b = new StringBuilder("It is used to _ at the specified index position");
		b.replace(14, 15,"insert text" );
		System.out.println(b);
		StringBuilder c = new StringBuilder("This method returns the reversed object on which it was called");
		System.out.println(c.reverse());
		System.out.println(c.substring(0, 1));
	}
}
