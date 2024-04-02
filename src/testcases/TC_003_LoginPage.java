package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.TC_001_CommonFunctions;
import pageObjects.LoginPagePageObjects;

public class TC_003_LoginPage extends TC_001_CommonFunctions{

	@Test
	public void login() {
		// use Pagefactory and init the elements
		PageFactory.initElements(driver, LoginPagePageObjects.class);
		
		// enter the username from config file
		LoginPagePageObjects.userName.sendKeys(properties.getProperty("username"));
		// enter the password from config file
		LoginPagePageObjects.passWord.sendKeys(properties.getProperty("password"));
		// click the login button
		LoginPagePageObjects.loginBTN.click(); 

		
	}
	
		
	
	
}
