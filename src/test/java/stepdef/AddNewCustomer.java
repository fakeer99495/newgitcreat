package stepdef;

import base.Driver;
import io.cucumber.java.en.*;
import pages.AddNewCustomerOR;

public class AddNewCustomer extends Driver{
	AddNewCustomerOR addnew;
	@When(": click on new customer button")
	public void click_on_new_customer_button() throws Exception {
		addnew=new AddNewCustomerOR(d);
		addnew.newCustomerclick();
		Thread.sleep(2000);
	   
	}
	@Then(": user should add new customer details")
	public void user_should_add_new_customer_details() throws Exception {
		addnew.enterName();
		addnew.clickMaleButton();
		addnew.clickDb();
		addnew.EnterAddress();
		addnew.EnterCity();
		addnew.EnterState();
		addnew.EnterPincode();
		addnew.EnterMobileNumber();
		addnew.EnterEmail();
		addnew.EnteePassword();
		Thread.sleep(8000);
	    
	}
	@Then(": User should click Submit button")
	public void user_should_click_submit_button() throws Exception {
		addnew.clickSubbmitbutton();
		Thread.sleep(4000);
	}
	@Then("User should click Home button")
	public void user_should_click_home_button() throws Exception {
		addnew.clickHomebutton();
		Thread.sleep(3000);
		
	}

}
