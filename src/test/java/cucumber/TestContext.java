package cucumber;

import org.openqa.selenium.WebDriver;

import managers.PageObjectManager;
import managers.WebDriverManager;

public class TestContext {
	
	WebDriver driver;
	WebDriverManager webDriverManager;
	private PageObjectManager pageObjectManager;
	
	public TestContext() {
		webDriverManager = new WebDriverManager();
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
	}
	
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}

}
