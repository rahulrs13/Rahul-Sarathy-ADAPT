import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import junitassignment.BankAccount;
import junitassignment.InsufficientFundsExpcetion;
class Q3 {
	@Test
	void test() {
		BankAccount b = new BankAccount();
		assertThrows(InsufficientFundsExpcetion.class,() -> b.withdraw(20000));
	}

}
