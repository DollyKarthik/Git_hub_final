package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Genricflif
{
	public WebDriver driver;
@BeforeMethod
public void openappl()
{
	System.setProperty("webdriver.chrome.driver","./CHRO1/chromedriver.exe");
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com");
}
@AfterMethod
public void close()
{
	driver.close();
}
}
