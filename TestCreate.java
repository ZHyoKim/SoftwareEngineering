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
		account.create(20171225,"pen",2017);
		assertTrue(account.date==20171225);
		assertEquals(account.item,"pen");
		assertTrue(account.price==2017);


	}
} 
