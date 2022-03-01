package Strings;
public class stringbuffer {
	public static void main(String[] args) {
		StringBuffer a = new StringBuffer();
		a.append("StringBuffer,is a peer class of String that provide much of the fuctionality of strings");
		System.out.println(a);
		StringBuffer b = new StringBuffer("It is used to _ at the specified index position");
		b.replace(14, 15,"insert text" );
		System.out.println(b);
		StringBuffer c = new StringBuffer("This method returns the reversed object on which it was called");
		System.out.println(c.reverse());	
	}
}
