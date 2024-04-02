package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookAppointmentButtonPageObjects {

	// find the BookAppointment button locator by using @FindBy Annotation
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement BookAppointment;
}
