package commonFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TC_001_CommonFunctions {
	public static WebDriver driver;
	public static Properties properties;

	public Properties loadPropertyFile() throws IOException {
		FileInputStream fileInputStream = new FileInputStream("config.properties");
		properties = new Properties();
		properties.load(fileInputStream);
		return properties;
	}

	@BeforeSuite
	public void launchBrowser() throws IOException {
		loadPropertyFile();
		// get the browser property from config.properties file
		properties.getProperty("browser"); 
		// get the Browser Url from config.properties file
		String url = properties.getProperty("Url"); 
		// get the driver path from config.properties file
		String driverlocation = properties.getProperty("DriverLocation");
		
		
		System.setProperty("webdriver.chrome.driver", driverlocation);
		// Launch the Browser
		driver = new ChromeDriver(); 
		// maximize the window
		driver.manage().window().maximize(); 
		// Enter the Browser Url
		driver.get(url); 
	}

	@AfterSuite
	public void tearDown() {
		// Close the Browser
		driver.quit(); 

	}

}
