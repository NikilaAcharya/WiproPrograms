package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Home {


	@FindBy(name="passCount")
	 WebElement lst_pass_count;
	
	
	@FindBy(name="fromPort")
	 WebElement lst_from_loc;
	
	@FindBy(name="findFlights")
	 WebElement btn_find_flight;
	
	public Home(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void fill_details()
	{
		new Select(lst_pass_count).selectByVisibleText("2");
		new Select(lst_from_loc).selectByVisibleText("London");
		btn_find_flight.click();
	}
}
