package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.TestUtils;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	WebElement tbUsername;
	
	@FindBy(name="password")
	WebElement tbPassword;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement btnLogin;
	
	public void getUrl() {
		driver.get("https://classic.crmpro.com/index.html");
	}
	
	public void enterCredentials() {
		tbUsername.sendKeys("sroyamt");
		tbPassword.sendKeys("Sroyamt123@");
	}
	
	public void clickLoginBtn() {
		TestUtils.doJavaScriptExecutor(driver, btnLogin);
	}

}
