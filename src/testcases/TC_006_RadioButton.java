package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.TC_001_CommonFunctions;
import pageObjects.RadioButtonPageObjects;

public class TC_006_RadioButton extends TC_001_CommonFunctions {

	@Test
	public void radioButton() {

		// use pagefactory and init the elements
		PageFactory.initElements(driver, RadioButtonPageObjects.class);
		
		// click the Radio button
		RadioButtonPageObjects.RadioButton.click();

	}

}
