package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerOR {
	
	//Addcustomer
	// Locateorsssss
	@FindBy(xpath="//a[text()='New Customer']") public WebElement cnewcustomer;
	@FindBy(xpath="//input[@name='name']") public WebElement tcustomername;
	@FindBy(xpath="//input[@value='m']") public WebElement mbutton;
	@FindBy(xpath="//input[@id='dob']") public WebElement cdob;
	@FindBy(xpath="//textarea[@name='addr']") public WebElement fldaddress;
	@FindBy(xpath="//input[@name='city']") public WebElement fldcity;
	@FindBy(xpath="//input[@name='state']") public WebElement fldstate;
	@FindBy(xpath="//input[@name='pinno']") public WebElement fldpincode;
	@FindBy(xpath="//input[@name='telephoneno']") public WebElement fldmobilenumber;
	@FindBy(xpath="//input[@name='emailid']") public WebElement fldemail;
	@FindBy(xpath="//input[@name='password']") public WebElement fldpassword;
	@FindBy(xpath="//input[@name='sub']") public WebElement btnsubmit;
	@FindBy(xpath="//a[contains(text(),'Home')]") public WebElement btnhome;
	
	public AddNewCustomerOR(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	/// Handling Elements
	public void newCustomerclick() {
		cnewcustomer.click();
		
	}
	public void enterName() {
		tcustomername.sendKeys("sai");
		
	}
	public void clickMaleButton() {
		mbutton.click();
	}
	public void clickDb() {
		cdob.sendKeys("01/01/2001");
	}
	public void EnterAddress() {
		fldaddress.sendKeys("Hyderabad");
	}
	public void EnterCity() {
		fldcity.sendKeys("Hithcity");
	}
	public void EnterState() {
		fldstate.sendKeys("Telengana");
	}
	public void EnterPincode() {
		fldpincode.sendKeys("520001");
	}
	public void EnterMobileNumber() {
		fldmobilenumber.sendKeys("9958745625");
	}
	public void EnterEmail() {
		fldemail.sendKeys("xyzKl2@gmail.com");
	}
	public void EnteePassword() {
		fldpassword.sendKeys("@S988560");
	}
	public void clickSubbmitbutton() {
		btnsubmit.click();
	}
	public void clickHomebutton() {
		btnhome.click();
	}
	
}
