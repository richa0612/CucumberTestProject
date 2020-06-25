package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import utilities.SeleniumWebDriver;

public class AfterActions {
	
	@After
	
	public static void tearDown(Scenario scenario) {
		
		WebDriver driver = SeleniumWebDriver.getDriver();
		
		if (scenario.isFailed()) {
			
			byte[] screenshotBytes = ((TakesScreenshot)
					driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshotBytes, "image/png");
		
		SeleniumWebDriver.tearDown();
		
	}

}
}
