package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.TC_001_CommonFunctions;
import pageObjects.VisitDatePageObjects;

public class TC_007_VisitDate extends TC_001_CommonFunctions {

	@Test
	public void clickTable() {
	PageFactory.initElements(driver, VisitDatePageObjects.class); //use pagefactory and init elements 
	VisitDatePageObjects.ClickCalendar.click(); // click calendar
	}
	@Test
	public void nextButton() {
	PageFactory.initElements(driver, VisitDatePageObjects.class); //use pagefactory and init elements
	VisitDatePageObjects.NextButton.click(); // click nextbutton
	}
	@Test
	public void selectDate() {
	PageFactory.initElements(driver, VisitDatePageObjects.class); //use pagefactory and init elements
	VisitDatePageObjects.SelectDate.click(); // select the date
	}
}
