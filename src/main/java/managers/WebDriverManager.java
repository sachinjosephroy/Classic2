package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
	
	WebDriver driver;
	
	public WebDriverManager() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Grid\\chromedriver.exe");
		this.driver = new ChromeDriver();	
	}
	
	public WebDriver getDriver() {
		return driver;
	}

}
