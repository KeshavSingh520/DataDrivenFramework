package testcase;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.base;
import utilities.TestUtil;

public class AddCustomerTest extends base {
	public static String alertText;
	@Test(dataProvider = "getData")
	public void addACustomer(String firstName, String lastName, String postCode) {

		click("addCustomerBtn_CSS");
		type("firstName_CSS", firstName);
		type("lastName_CSS", lastName);
		type("postCode_CSS", postCode);
		click("addCust_CSS");
		Alert alert=driver.switchTo().alert();
		
		alertText=alert.getText();
		System.out.println(alertText);
		
	}

	@DataProvider
	public Object[][] getData() {

		return TestUtil.getData("LoginTest");
	}

}
