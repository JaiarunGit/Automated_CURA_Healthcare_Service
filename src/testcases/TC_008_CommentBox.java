package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import commonFunctions.TC_001_CommonFunctions;
import pageObjects.CommentBoxPageObjects;

public class TC_008_CommentBox extends TC_001_CommonFunctions {

	@Test
	public void commentBox() {
		
		// use pagefactory and init the elements
		PageFactory.initElements(driver, CommentBoxPageObjects.class);
		
		CommentBoxPageObjects.CommentBox.click(); // click the commentbox
		
		// enter some value from config file
		CommentBoxPageObjects.CommentBox.sendKeys(properties.getProperty("comment"));
		
	}
	
	
}
