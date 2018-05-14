package p1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AdvancedControl {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			driver=new  FirefoxDriver();
			driver.get("file:///E:/Selenium/docs/sample.html");
			driver.findElement(By.id("button1")).click();
			
			//List l=  driver.getWindowHandles();
			
			List<WebElement> all = driver.findElements(By.xpath("//input[@type='checkbox']"));

			for (WebElement element : all)
			{
				element.click();
			}
			
			 File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("E:/Selenium/Training/home_page_2.png"));

	}

}
