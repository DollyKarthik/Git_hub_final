package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GENRIC_INSTAGRAM 
{
	public WebDriver driver;
@BeforeMethod
public void openapp()
{
	System.setProperty("webdriver.chrome.driver","./CHRO/chromedriver.exe");
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.instagram.com");
}
@AfterMethod
public void closapp()
{
	driver.close();
}
}
