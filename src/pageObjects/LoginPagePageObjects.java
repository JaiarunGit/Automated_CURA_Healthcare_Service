package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPagePageObjects {

	//Find the username Locator by using @FindBy Annotation
	@FindBy(id = "txt-username") 
	public static WebElement userName;
	
	//Find the password Locator by using @FindBy Annotation
	@FindBy(id = "txt-password") 
	public static WebElement passWord;
	
	//Find the loginBtn Locator by using @FindBy Annotation
	@FindBy(id = "btn-login") 
	public static WebElement loginBTN;
	
	
	
}
