package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxPageObjects {

	// find the checkbox locator by using @FindBy Annotation
	@FindBy(id = "chk_hospotal_readmission")  
	public static WebElement CheckBox;
	
}
