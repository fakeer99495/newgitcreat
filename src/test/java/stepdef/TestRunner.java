package stepdef;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	@CucumberOptions(
		    features = {"Feature Folder"},
			glue={"stepdef"},
			//dryRun = true,
			monochrome =true,
	        plugin = {"pretty",
	                  "html:target/report/cucumber.html",
	                  "json:target/report/cucumber.json"
	                 },
	        tags="@Login"
		  

			)
	 
	public class TestRunner extends AbstractTestNGCucumberTests
	{
		//@Override
		//@DataProvider(parallel=true)
		//public Object[][] scenarios(){
		//	return super.scenarios();
		//}
	 
}
