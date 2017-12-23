import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorTest {

	@Test
	public void testSubtract() {
		Calculator c = new Calculator();
		assertTrue(c.subtract(10, 2.5) == 7.5);
	}
	
	@Test
	public void testInchToCm(){
		Calculator c = new Calculator();
		assertTrue(c.InchToCm(10) == 25.4);
	}
}
