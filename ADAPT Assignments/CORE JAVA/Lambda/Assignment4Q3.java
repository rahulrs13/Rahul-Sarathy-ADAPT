package Lambda;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class Assignment4Q3 {
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
		
		printAll(orders,condition->condition.getStatus().startsWith("A") && condition.getTotalPrice()>10000,()->orders.get(3),x->x.getTotalPrice(),p->System.out.println(p));

	}
	private static void printAll(List<Assignment4Q2> orders,Predicate<Assignment4Q2> predicate,Supplier<Assignment4Q2> supplier,Function<Assignment4Q2, Integer> function,Consumer<Assignment4Q2> consumer) {
		Map<Integer,String> list2 = new HashMap<>();
		for(Assignment4Q2 iDetails : orders ) {
			list2.put(function.apply(iDetails),iDetails.getStatus());
			if(predicate.test(iDetails)) {
				consumer.accept(iDetails);
			}
		}
		System.out.println(supplier.get());
		System.out.println(list2);

	}

}

