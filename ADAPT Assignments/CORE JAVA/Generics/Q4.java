package Generics;
class Pair<K,V>{
	K key;
	V value;
	public void setkey(K key) {
		this.key=key;
	}
	public void setvalue(V value) {
		this.value=value;
	}
}
public class Q4 {
	public static void main(String[] args) {
		Pair<String,String> s = new Pair<String, String>();
		s.setkey("1");
		s.setvalue(" Hello");
		System.out.println(s.key+ s.value);
		Pair<String,java.util.Date> p = new Pair<>();
		p.setkey("Today is ");
		p.setvalue(new java.util.Date());
		System.out.println(p.key+p.value);
	}
}
