import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	Calculator calc;
	
	@BeforeEach
	void setup() {
		calc = new Calculator();
	}
	
	@Test
	@DisplayName("Simple multiplication")
	void testMultiply() {
		assertEquals(20, calc.multiply(4, 5), "Multiplication does not work");
		//assertTrue(calc.multiply(4, 5) == 30, "Answer of 4 * 5 is not 30");
	}
	
	@Test
	@Disabled("Add is not ready for test yet")
	@DisplayName("Simple Addition")
	void testAdd() {
		assertEquals(10, calc.add(5,  5), "Addition does not work");
	}
}
