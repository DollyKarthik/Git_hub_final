package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AssertGenric
{
	public WebDriver driver;
@BeforeMethod
public void openappl()
{
	System.setProperty("webdriver.chrome.driver","./CHRO1/chromedriver.exe");
 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com");
}
@AfterMethod
public void closappl()
{
	driver.close();
}
}
