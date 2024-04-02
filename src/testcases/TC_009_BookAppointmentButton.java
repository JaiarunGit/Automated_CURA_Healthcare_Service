package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.TC_001_CommonFunctions;
import pageObjects.BookAppointmentButtonPageObjects;

public class TC_009_BookAppointmentButton extends TC_001_CommonFunctions {

	@Test
	public void bookAppointment() {
		
		// use pagefactory and init the elements
		PageFactory.initElements(driver, BookAppointmentButtonPageObjects.class);
		BookAppointmentButtonPageObjects.BookAppointment.click(); // click the BookAppointment btn
	}
}
