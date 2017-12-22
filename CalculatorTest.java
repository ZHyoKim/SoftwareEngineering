import static org.junit.Assert.*;
import org.junit.*;

public class CalculatorTest {

	@Test
	public void testDivide() {
		Calculator c = new Calculator();
		assertTrue(c.divide(10, 2.5) == 4);
	}
	
	@Test
	public void testInchToCm(){
		Calculator c = new Calculator();
		assertTrue(c.InchToCm(10) == 25.4);
	}
}