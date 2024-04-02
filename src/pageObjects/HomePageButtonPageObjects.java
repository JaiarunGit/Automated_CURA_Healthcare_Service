package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageButtonPageObjects {

	// find the HomePage button locator by using @FindBy Annotation
	@FindBy(xpath = "//a[@class='btn btn-default']")
	public static WebElement HomePage;
	
}
