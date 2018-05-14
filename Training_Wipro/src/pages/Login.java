package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy(name="userName")
	 WebElement txt_user_name;
	
	@FindBy(name="password")
	 WebElement txt_password;
	
	@FindBy(name="login")
	 WebElement btn_login;
	
	public void login(String sUsername,String sPassword)
	{
		txt_user_name.sendKeys(sUsername);
		txt_password.sendKeys(sPassword);
		btn_login.click();
	}
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
 
}
