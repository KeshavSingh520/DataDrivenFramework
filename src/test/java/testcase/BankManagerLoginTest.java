package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.base;

public class BankManagerLoginTest extends base {
	
	
	@Test
	public void loginAsBankManager() {
		
		click("bmlBtn_CSS");
		Assert.assertTrue(isElementPresent("addCustomerBtn_CSS"),"Bank Manager not logged in");
		
	}

}
