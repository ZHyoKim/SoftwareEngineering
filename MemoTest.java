import org.junit.*;
import static org.junit.Assert.*;


public class MemoTest {

	
	@Test
	public void updatetestMemo() {
		Memo memo_u = new Memo();
		System.out.println("update : successful?");
		assertTrue(memo_u.updatetest(2, "successful?"));
		
	}
	
	@Test 	
	 public void deletetestMemo() {
		Memo memo_d = new Memo();
		System.out.println("delete");
		assertTrue(memo_d.deletetest(1));
	}
	
}
