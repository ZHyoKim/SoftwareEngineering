import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	@Test
	public void testUpdateAccount() {
		HW hw = new HW();
		//오로지 update만 test하기 위해
		hw.accounts[0] = new Account();
		hw.accounts[0].date = 20170110;
		hw.accounts[0].item = "one";
		hw.accounts[0].price = 1111;
		hw.accounts[0].update(0, 20170111, "update one", 1112);
		
		//create함수를 쓴 상태에서 test
		hw.accounts[1] = new Account();
		hw.accounts[1].create(20170220, "two", 2222);
		assertTrue(hw.accounts[1].update(1, 20170221, "update two", 2223));
		
		assertEquals(hw.accounts[0].date, 20170111);
		assertEquals(hw.accounts[0].item, "update one");
		assertEquals(hw.accounts[0].price, 1112);
		
		assertEquals(hw.accounts[1].date, 20170221);
		assertEquals(hw.accounts[1].item, "update two");
		assertEquals(hw.accounts[1].price, 2223);
	}
	
	@Test
	public void testDeleteAccount() {
		HW hw = new HW();
		hw.accounts[0] = new Account();
		hw.accounts[0].date = 20171111;
		hw.accounts[0].item = "one";
		hw.accounts[0].price = 1111;
		hw.accounts[1] = new Account();
		hw.accounts[1].create(20171222, "two", 2222);
		// (account_number) = (the number of Account objects)
		hw.account_number = 2;

		assertTrue(hw.accounts[1].delete(1)==1);
		//account_number increases after creating an Account object.
		//(the last index of accounts array) = (account_number - 1)
		assertEquals(hw.accounts[hw.account_number-1].date, 20171111);
		assertEquals(hw.accounts[hw.account_number-1].item, "one");
		assertEquals(hw.accounts[hw.account_number-1].price, 1111);
	}

}

