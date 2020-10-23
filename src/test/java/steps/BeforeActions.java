package steps;

import cucumber.api.java.Before;
import utils.SeleniumDriver;

public class BeforeActions {
	static SeleniumDriver seleniumDriver;
	
	@Before
	public static void setup() {
		
		SeleniumDriver.setUpDriver();
	}
	
	public static void setupDriver(){
		if(seleniumDriver == null) {
			seleniumDriver = new SeleniumDriver();
		}
	}
}