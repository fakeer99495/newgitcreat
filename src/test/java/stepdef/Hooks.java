package stepdef;

import base.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void Beforescenario() {
		
		Driver.lunchBrowser();
		
		System.out.println("********** Before scenario ***************");
		
	}
	@After
	public void Afterscenario() {
		Driver.tearDown();
		System.out.println("********** After scenario ***************");
	}

}
