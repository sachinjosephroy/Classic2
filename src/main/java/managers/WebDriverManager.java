package managers;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManager {
	
	WebDriver driver;
	String browsername;
	String browserversion;
	
	public WebDriverManager() {
		String osName = System.getProperty("os.name");
		if (osName.equalsIgnoreCase("windows 7")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium Grid\\chromedriver.exe");
			driver = new ChromeDriver();
			Capabilities cap = ((ChromeDriver) driver).getCapabilities();
			/*browsername = cap.getBrowserName().toUpperCase();
			browserversion = cap.getVersion();
			test.setDescription("Operating System: " + osName.toUpperCase() + ", " + "<br />" + "Browser: " + browsername + " " + browserversion);*/
		}
		else if (osName.equalsIgnoreCase("windows 10")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium Grid\\geckodriver.exe");
			driver = new FirefoxDriver();
			Capabilities cap = ((FirefoxDriver) driver).getCapabilities();
			//browsername = cap.getBrowserName().toUpperCase();
			
			/*System.setProperty("webdriver.edge.driver", prop.getProperty("edgedriverpath"));
			driver = new EdgeDriver();
			Capabilities cap = ((EdgeDriver) driver).getCapabilities();
			browsername = cap.getBrowserName().toUpperCase();*/
			
			//test.setDescription("Operating System: " + osName.toUpperCase() + ", " + "<br />" + "Browser: " + browsername);
		}
		this.driver = driver;	
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	public void quitDriver() {
		driver.quit();
	}

}
