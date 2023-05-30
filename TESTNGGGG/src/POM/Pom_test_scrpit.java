package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Pom_test_scrpit
{
@Test
public void login() throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./CHRO/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com");
	Pom_scrpt p=new Pom_scrpt(driver);
	p.undata("charli");
	Thread.sleep(2000);
	p.pwddata("doll");
	Thread.sleep(2000);
	p.login();
}
}
