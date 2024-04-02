package testcases;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonFunctions.TC_001_CommonFunctions;
import pageObjects.FacilityFunctionPageObjects;

public class TC_004_FacilityFunction extends TC_001_CommonFunctions {

	@Test
	public void clickTexBox() {
		// use pagefactory and init the elements
		PageFactory.initElements(driver, FacilityFunctionPageObjects.class);
		
		// select the dropdown list 
		Select select = new Select(FacilityFunctionPageObjects.DropDown);
		select.selectByIndex(2);
		
		
	}
	
	
	
	
}
