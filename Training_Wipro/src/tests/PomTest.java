package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pages.Home;
import pages.Login;

public class PomTest {
	public WebDriver driver; 
	
	//@BeforeClass
	public void setUp()
	{
		
	}
	
	@Test
  public void testPom() {
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Login loginObj=new Login(driver);
		loginObj.login("mercury", "mercury");
		Home homeObj=new Home(driver);
		homeObj.fill_details();
  }
}
