package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOR {
	
	@FindBy(name="uid") public WebElement tusername;
	@FindBy(name="password") public WebElement tpassword;
	@FindBy(name="btnLogin") public WebElement tbutton;
	@FindBy(xpath="//a[normalize-space()='Log out']") public WebElement tlogout;
	public LoginOR(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String uname) {
		tusername.sendKeys(uname);
		
	}
	public void setPassword(String pwd) {
		tpassword.sendKeys(pwd);
		
	}
	public void clickLoginButton() {
		tbutton.click();
	}
	public void clickLogout() {
		tlogout.click();
	}
	

}
