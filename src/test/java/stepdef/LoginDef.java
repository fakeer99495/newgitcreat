package stepdef;

import org.openqa.selenium.Alert;

import base.Driver;
import io.cucumber.java.en.*;
import pages.LoginOR;


public class LoginDef extends Driver{
	LoginOR loginor;
	@Given(": User navigate to {string}.")
	public void user_navigate_to(String string) {
		loginor=new LoginOR(d);
	    d.get(url);
	}
	@When(": User enter valid username as {string} and valid password {string}")
	public void user_enter_valid_username_as_and_valid_password(String username, String password) throws Exception {
		loginor.setUsername(username);
		Thread.sleep(2000);
		loginor.setPassword(password);
		Thread.sleep(2000);
		
	    
	}
	@When(": click on login button")
	public void click_on_login_button() throws Exception {
		loginor.clickLoginButton();
		Thread.sleep(2000);
	   
	}
	@Then(": click on logout button")
	public void click_on_logout_button() throws Exception {
		loginor.clickLogout();
		Thread.sleep(2000);
	}
	@Then("click on Alert ok button")
		public void click_on_alert_ok_button() throws Exception {
		   Alert al=d.switchTo().alert();
		    al.accept();
		    Thread.sleep(2000);
	   
	}
}
