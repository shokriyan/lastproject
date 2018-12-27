package stepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utility.SetupClass;

public class Hooks {
	SetupClass setup;
	@Before
	public void setupRun() {
		setup = new SetupClass();
		setup.setUp();

	}
	
	@After
	public void closingBrowser() {
		setup.tearDown();
		
	}
	
	

}
