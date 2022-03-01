package OOPS;
class Rectangle5 extends Shape5 {
    public String draw(String p) {
		return p = "Drawing Rectangle";
		}
}
class Line5 extends Shape5{
    public String draw(String d) {
    	return d = "Drawing Line";
		}
}
class Cube5 extends Shape5 {
    public String draw(String p) {
		return p = "Drawing Cube";
}
}
abstract class Shape5 {
    abstract public String draw(String p);
}
public class Assignment2Q5 {
	public static void main(String[] args) { 
    Shape5 s = new Rectangle5();
    Shape5 a = new Line5();
    Shape5 b = new Cube5();
    System.out.println(s.draw(null));
	}
}

