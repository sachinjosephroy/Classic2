package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePage;
import pageObjects.LoginPage;

public class PageObjectManager {
	
	WebDriver driver;
	LoginPage login;
	HomePage home;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public LoginPage getLoginPage() {
		return (login==null) ? new LoginPage(driver) : login;
	}
	
	public HomePage getHomePage() {
		return (home==null) ? new HomePage(driver) : home;
	}

}
