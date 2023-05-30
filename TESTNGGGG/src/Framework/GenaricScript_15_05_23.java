package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenaricScript_15_05_23 
{
	public WebDriver driver;
@BeforeMethod
public void openapp()
{
	System.setProperty("webdriver.gecko.driver","./CHRO/geckodriver.exe");
	 driver=new FirefoxDriver();
	 driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
@AfterMethod
public void closapp() 
{
	driver.close();
}
}
