package POM;

import org.testng.annotations.Test;

public class Test_FACEBOOK extends  Gernric_FACEBOOK
{
	
		@Test
		public void login() 
		{
			Pom_FACEBOOK p=new Pom_FACEBOOK(driver);
			p.undata("charli");
			//Thread.sleep(2000);
			p.pwddata("doll");
			//Thread.sleep(2000);
			p.login();
}
}