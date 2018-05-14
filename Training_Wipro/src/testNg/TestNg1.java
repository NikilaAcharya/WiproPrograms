package testNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNg1 {
	public static WebDriver driver;
	
@Test(priority=10,dataProvider = "getCredentials",groups="smoke")
  public void login(String sUser, String sPass) {
		driver.findElement(By.name("userName")).sendKeys(sUser);
		driver.findElement(By.name("password")).sendKeys(sPass);
		
		//Click on button
		driver.findElement(By.name("login")).click();
		//Assert.assertTrue(driver.findElement(By.name("passCount")).isDisplayed());
		
		if (sUser.equals("invalid"))
		{
			driver.get("http://newtours.demoaut.com");
		}
		
	  
  }

@Test(priority=11,enabled=true,groups="regression")
public void flightDetails() {
	//Select From List box
			new Select(driver.findElement(By.name("passCount"))).selectByVisibleText("2");
			new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("London");
			
			//Radio Button
			driver.findElement(By.xpath("//input[@value='Business']")).click();
			
			//Explicit Wait
			WebDriverWait wait=new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.elementToBeClickable(By.name("findFlights")));
			driver.findElement(By.name("findFlights")).click();
	  
}
@Parameters({"url1"})
  @BeforeMethod
  public void beforeMethod(String sUrl) {
	 // driver.get(sUrl);
  }

  @AfterMethod
  public void afterMethod() {
  }

  @Parameters({"url1"})
  @BeforeClass(groups="init")
  public void beforeClass(String sUrl) {
	  driver=new FirefoxDriver();
	  driver.get(sUrl);
	  Assert.assertEquals(driver.getTitle(), "Welcome: Mercury Tours");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterClass(groups="init")
  public void afterClass() {
	  driver.close();
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
	 
  }

  @AfterSuite
  public void afterSuite() {
	
  }
  
  @DataProvider()
  public Object[][] getCredentials(){
   Object data[][] = new Object[2][2];
   data[0][0] = "invalid";
   data[0][1] = "invalid";
  
   data[1][0] = "mercury";
   data[1][1] = "mercury";
  
   
  
   
   return data;
  } 

}
