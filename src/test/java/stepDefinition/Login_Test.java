package stepDefinition;

import org.junit.Assert;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class Login_Test {
	
	TestContext testContext;
	LoginPage login;
	HomePage home;
	
	public Login_Test(TestContext context) {
		testContext = context;
		login = testContext.getPageObjectManager().getLoginPage();
		home = testContext.getPageObjectManager().getHomePage();
	}
	
	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() throws Throwable {
		login.getUrl();
	}

	@When("^user enters valid credentials$")
	public void user_enters_valid_credentials() throws Throwable {
		login.enterCredentials();
	}

	@When("^clicks the Login button$")
	public void clicks_the_Login_button() throws Throwable {
		login.clickLoginBtn();
	}

	@Then("^use should be logged in$")
	public void use_should_be_logged_in() throws Throwable {
		String username = home.getUsername();
		Assert.assertTrue("Username is incorrect", username.contains("Sachin Roy"));
		System.out.println(username);
	}

}
