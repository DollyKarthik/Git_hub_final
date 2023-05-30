package Framework;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Asserttest  extends AssertGenric
{
@Test
public void  login() throws InterruptedException 
{
	driver.findElement(By.id("email")).sendKeys("kartgukj");
	driver.findElement(By.id("pass")).sendKeys("doll");
	driver.findElement(By.name("login")).click();
	Thread.sleep(2000);
	String ti = driver.getTitle();
	System.out.println(ti);
	Assert.assertEquals(ti,"Facebook – log in or sign up");
	System.out.println("1");
}

}
