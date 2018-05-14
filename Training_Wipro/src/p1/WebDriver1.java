package p1;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriver1 {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		//Launch Firefox Browser
		driver=new FirefoxDriver();
		
		//Launch Chrome
//		  File file = new File("E:\\Selenium\\Project\\Project - Copy\\Resources\\" + "chromedriver.exe");
//		  System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
//		  driver=new ChromeDriver();	
		
		  //Launch IE browser
		  
//		  final DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
//	      capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
//		  File file = new File("E:\\Selenium\\Project\\Project - Copy\\Resources\\" + "IEDriverServer.exe");
//		  System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
//		  driver=new InternetExplorerDriver(capabilities);
		  
		  
		//navigate to url
		driver.get("http://newtours.demoaut.com/");
		
		//Title print
		System.out.println("Title of the page is " +driver.getTitle());
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Enter text in text box
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		
		//Click on button
		driver.findElement(By.name("login")).click();
		
		//Select From List box
		new Select(driver.findElement(By.name("passCount"))).selectByVisibleText("2");
		new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("London");
		
		//Radio Button
		driver.findElement(By.xpath("//input[@value='Business']")).click();
		
		//Explicit Wait
		WebDriverWait wait=new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("findFlights")));
		driver.findElement(By.name("findFlights")).click();
		
		//driver.close();
	}

}
