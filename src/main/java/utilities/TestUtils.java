package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestUtils {
	
	public static void doJavaScriptExecutor(WebDriver driver, WebElement element) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].click()", element);
	}
	
	public static void getFrame(WebDriver driver) {
		driver.switchTo().frame("mainpanel");
	}

}
