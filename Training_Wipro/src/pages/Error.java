package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Error {

	@FindBy(name="userName")
	 WebElement txt_user_name;
	
	@FindBy(name="password")
	 WebElement txt_password;
	
	@FindBy(name="login")
	 WebElement btn_login;
}
