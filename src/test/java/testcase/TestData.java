package testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestData {
	
	public static WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver.get("htpp://google.com");
		
	}
	@Test
	public void show()
	{
		
		System.out.println("Show method");
	}

}
