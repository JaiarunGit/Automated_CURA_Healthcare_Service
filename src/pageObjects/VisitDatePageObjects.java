package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VisitDatePageObjects {

	// find the calendar locator by using @FindBy Annotation
	@FindBy(id = "txt_visit_date")
	public static WebElement ClickCalendar;
	
	// find the nextbutton locator by using @FindBy Annotation
	@FindBy(xpath = "//th[@class='next']")
	public static WebElement NextButton;
	
	// find the selectdate locator by using @FindBy Annotation
	@FindBy(xpath = "(//td[contains(text(),'10')])[1]")
	public static WebElement SelectDate;
	
}
