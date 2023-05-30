package Framework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestScript_15_05_23forGenaric extends GenaricScript_15_05_23
{
@Test
public void logi() throws InterruptedException 
{
	driver.findElement(By.id("email")).sendKeys("charli");
	driver.findElement(By.id("pass")).sendKeys("dolly");
	driver.findElement(By.name("login")).click();
	Thread.sleep(2000);
	String ti = driver.getTitle();
	System.out.println(ti);
}

}
