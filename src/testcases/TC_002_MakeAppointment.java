package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import commonFunctions.TC_001_CommonFunctions;
import pageObjects.MakeAppointmentPageObjects;

public class TC_002_MakeAppointment extends TC_001_CommonFunctions {

	@Test
	public void makeAppointment() {
		// use Pagefactory and init the elements
		PageFactory.initElements(driver, MakeAppointmentPageObjects.class); 

		MakeAppointmentPageObjects.makeAppointment.click();

	}
}
