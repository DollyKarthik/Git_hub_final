package POM;

import org.testng.annotations.Test;

public class TEST_INSTAGRAM_LOGIN  extends GENRIC_INSTAGRAM
{
	
	@Test
	public void login() throws InterruptedException
	{
		POM_INSTAGRAM p=new POM_INSTAGRAM(driver);
		p.eml("doll");
		Thread.sleep(2000);
		p.pasd("doll");
		Thread.sleep(2000);
		p.logbut();
	}
	}


