package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
	public static WebDriver d;
	public static String url="https://demo.guru99.com/v4/";
	public static void lunchBrowser()
	{
		//d=new ChromeDriver();
		d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		d.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		
	}
	public static void tearDown()
	{
		d.quit();
	}

}
