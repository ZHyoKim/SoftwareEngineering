import static org.junit.Assert.*;
import org.junit.*;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator c = new Calculator();
		assertTrue(c.add(10.5, 2.5) == 13);
	}
	
	@Test
	public void testInchToCm(){
		Calculator c = new Calculator();
		assertTrue(c.InchToCm(10) == 25.4);
	}
}