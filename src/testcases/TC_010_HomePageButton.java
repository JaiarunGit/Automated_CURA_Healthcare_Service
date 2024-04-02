package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.TC_001_CommonFunctions;
import pageObjects.HomePageButtonPageObjects;

public class TC_010_HomePageButton extends TC_001_CommonFunctions {

	@Test
	public void homePage() {
		
		// use pagefactory and init the elements
		PageFactory.initElements(driver, HomePageButtonPageObjects.class);
		HomePageButtonPageObjects.HomePage.click(); // click the HomePage button
		
	}
}
