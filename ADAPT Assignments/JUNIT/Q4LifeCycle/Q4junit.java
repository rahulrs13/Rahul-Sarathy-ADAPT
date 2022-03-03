import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import junitassignment.Q4;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class Q4junit {
	Q4 k;
	@BeforeEach
	void init() {
	k = new Q4();
	}
	@AfterEach
	void print() {
		System.out.println("Addition");
	}
	@AfterAll
	void pop() {
		System.out.println("Using Afterall");
	}
	@BeforeAll
	void bing() {
		System.out.println("Using BeforAll");
	}
	@Test
	void test() {
		assertEquals(5,k.add(2, 3));
		System.out.println(k);
	}
	@Test
	void tes() {
		assertEquals(22,k.add(11, 11));
		System.out.println(k);
	}
}
