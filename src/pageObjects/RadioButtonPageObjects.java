package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RadioButtonPageObjects {

	// find the Radio Button locator by using @FindBy Annotation
	@FindBy(id = "radio_program_medicaid") 
	public static WebElement RadioButton;

}
