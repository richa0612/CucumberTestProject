package steps;

import cucumber.api.java.Before;
import utilities.SeleniumWebDriver;

public class BeforeActions {
	

	@Before
	public static void setUp (){
		
		SeleniumWebDriver.setUpDriver();
		
	}

}
