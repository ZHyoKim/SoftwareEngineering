import org.junit.*;
import static org.junit.Assert.*;
public class TestCreate{

	@Test
	public void testCreateMemo() {
		Memo memo = new Memo();
		assertTrue(memo.create("just for test"));
	}
	
	@Test
	public void testCreateAccount() {
		Account account = new Account();
		assertTrue(account.create(20171225,"pen",2017));
	}
} 
