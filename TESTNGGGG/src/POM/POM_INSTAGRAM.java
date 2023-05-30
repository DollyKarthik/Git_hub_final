package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_INSTAGRAM
{
//declaration
	@FindBy(xpath = "//input[@aria-label='email']")
	private WebElement textemail;
	@FindBy(xpath = "//input[@aria-label='password']")
	private WebElement textpass;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement logbut;
	
	//initialization
	public POM_INSTAGRAM(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//utilization
	public void eml(String doll)
	{
		textemail.sendKeys("9663580330");
	}
	public void pasd(String charli)
	{
		textpass.sendKeys("8277465347");
	}
	public void logbut()
	{
		logbut.click();
	}
	
	
}
