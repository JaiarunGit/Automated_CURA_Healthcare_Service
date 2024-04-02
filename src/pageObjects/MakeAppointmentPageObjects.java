package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MakeAppointmentPageObjects {

	// Find the MakeAppointment Locator by using @FindBy Annotation
	@FindBy(xpath = "//a[@id = 'btn-make-appointment']") 
	public static WebElement makeAppointment;

}

