package stepdef;

import base.Driver;
import io.cucumber.java.en.Then;
import pages.AddAccountOR;

public class NewAccount extends Driver{
	AddAccountOR addaccor;
	
	
	@Then("user should click on new account button")
	public void user_should_click_on_new_account_button() throws Exception {
		addaccor= new AddAccountOR(d);
		addaccor.addNewAccount();
		Thread.sleep(2000);
	}
	@Then("user should Add new account form")
	public void user_should_add_new_account_form() throws Exception {
		addaccor.fieldCustomerId();
		Thread.sleep(2000);
		addaccor.selectAccountType();
		Thread.sleep(2000);
		addaccor.fieldInitialDeposite();
		Thread.sleep(2000);
	}
	@Then("user should click submit button")
	public void user_should_click_submit_button() throws Exception {
		addaccor.clickSubmitButton2();
		Thread.sleep(2000);
	}
}
