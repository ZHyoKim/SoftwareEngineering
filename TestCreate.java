import org.junit.*;
import static org.junit.Assert.*;
public class Test1513466 {

	@Test
	public void testCreateMemo() {
		Memo memo = new Memo();
		System.out.println("type 'just for test'");
		memo.create();//type "just for test"
		assertEquals(memo.text,"just for test");
	}
	
	@Test
	public void testCreateAccount() {
		Account account = new Account();
		System.out.println("type date : 20171225");
		System.out.println("type item : pen");
		System.out.println("type price: 2017");
		account.create();
		assertTrue(account.date==20171225);
		assertEquals(account.item,"pen");
		assertTrue(account.price==2017);


	}
} 
