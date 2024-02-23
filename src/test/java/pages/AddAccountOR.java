package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

//Locating Elements
public class AddAccountOR {
	@FindBy(xpath="//a[contains(text(),'New Account')]") public WebElement newaccounbtn;
	@FindBy(xpath="//input[@name='cusid']") public WebElement fldcucstomerid;
	@FindBy(xpath="//select[@name='selaccount']") public WebElement addacounttype;
	@FindBy(xpath="//input[@name='inideposit']") public WebElement fldinitioaldpt;
	@FindBy(xpath="//input[@name='button2']") public WebElement clksubmitbtn;
	
	public AddAccountOR(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Handling Elements
	public void addNewAccount() {
		newaccounbtn.click();
	}
	public void fieldCustomerId() {
		fldcucstomerid.sendKeys("29441");
	}
	public void selectAccountType() {
		Select sc=new Select(addacounttype);
		sc.selectByIndex(1);
	}
	public void fieldInitialDeposite() {
		fldinitioaldpt.sendKeys("25000");
	}
	public void clickSubmitButton2() {
		clksubmitbtn.click();
		
	}
}
