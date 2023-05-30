package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_FACEBOOK 
{
	
		//declartaion
			@FindBy(id="email")
			private WebElement nametext ;
			@FindBy(name="pass")
			private WebElement passtext ;
			@FindBy(name="login")
			private WebElement loginbutton ;
			//initialization
			public  Pom_FACEBOOK(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
				//utilization
			public void undata(String un)
			{
				nametext.sendKeys(un);
			}
			public void pwddata(String pwd)
			{
				passtext.sendKeys(pwd);
			}
			public void login()
			{
				loginbutton.click();
			}
		}


