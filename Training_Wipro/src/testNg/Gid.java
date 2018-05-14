package testNg;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Gid {
	
	public static WebDriver driver;
	
  @Test
  public void f() throws MalformedURLException {
	  
//	  String hubUrl="http://localhost:4444/wd/hub";
//	  DesiredCapabilities cap=  DesiredCapabilities.firefox();
//	  cap.setPlatform(Platform.WINDOWS);
//	 // cap.setVersion);
//	  cap.setBrowserName("firefox");
//	  System.out.println("before launch");
//	  driver =new RemoteWebDriver(new URL(hubUrl),cap);
//	  driver.get("http://www.google.com");
//	  System.out.println("after launch");
	  
	
  }
  
  //@Test
  public void f2() throws MalformedURLException {
	  
	  String hubUrl="http://localhost:4444/wd/hub";
	  DesiredCapabilities cap=  DesiredCapabilities.firefox();
	  cap.setPlatform(Platform.WINDOWS);
	  driver =new RemoteWebDriver(new URL(hubUrl),cap);
	  driver.get("http://www.yahoo.com");
	
  }
}
