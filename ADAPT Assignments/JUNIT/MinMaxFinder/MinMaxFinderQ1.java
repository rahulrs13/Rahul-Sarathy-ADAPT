import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import junitassignment.MinMaxFinder;
class MinMaxFinderQ1 {
	@Test
	void test() {
		MinMaxFinder e = new MinMaxFinder();
		assertArrayEquals(new int[]{3,56},e.findMinMax(new int[]{56,34,7,3,54,3,34,34,53}));
		System.out.println(e);
	}
	@Test
	void single() {
		MinMaxFinder q = new MinMaxFinder();
		assertEquals(3,q.Minfinder(new int[]{56,34,7,3,54,3,34,34,53}));
		System.out.println(q);
		assertEquals(56,q.Maxfinder(new int[]{56,34,7,3,54,3,34,34,53}));
		System.out.println(q);
	}
}
