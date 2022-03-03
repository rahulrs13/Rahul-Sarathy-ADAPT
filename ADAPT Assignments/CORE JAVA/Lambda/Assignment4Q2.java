package Lambda;
import java.util.ArrayList;
public class Assignment4Q2 {
	  private int totalPrice;
	    private String status;
	    public Assignment4Q2(int totalPrice, String status) {
			super();
			this.totalPrice = totalPrice;
			this.status = status;
		}
		public int getTotalPrice() {
			return totalPrice;
		}
		public void setTotalPrice(int totalPrice) {
			this.totalPrice = totalPrice;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		@Override
		public String toString() {
			return "Assignment4Q2 [totalPrice=" + totalPrice + ", status=" + status + "]";
		}
	public static ArrayList<Assignment4Q2> listOfOrders(ArrayList<Assignment4Q2> orders) {
	ArrayList<Assignment4Q2> listOfOrders = new ArrayList<>();
	for (Assignment4Q2 ord : orders) {
	if ((ord.getStatus() == "ACCEPTED" || ord.getStatus() == "COMPLETED") && ord.getTotalPrice() > 1000) {
			listOfOrders.add(ord);
			System.out.println(ord);
				}
			}
			return listOfOrders;
			
		}
	public static void main(String[] args) {
		Assignment4Q2 l1 = (new Assignment4Q2(1200,"ACCEPTED"));
		Assignment4Q2 l2 = (new Assignment4Q2(1912,"COMPLETED"));
		Assignment4Q2 l3 = (new Assignment4Q2(1423,"NOTACCEPTED"));
		Assignment4Q2 l4 = (new Assignment4Q2(120,"ACCEPTED"));
		Assignment4Q2 l5 = (new Assignment4Q2(10,"NOTACCEPTED"));
		ArrayList<Assignment4Q2> orders = new ArrayList<>();
		orders.add(l1);
		orders.add(l2);
		orders.add(l3);
		orders.add(l4);
		orders.add(l5);
		listOfOrders(orders);
		}
	}
