package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommentBoxPageObjects {

	// find the commentbox locator by using @FindBy Annotation
	@FindBy(xpath = "//textarea[@class='form-control']")
	public static WebElement CommentBox;
}
