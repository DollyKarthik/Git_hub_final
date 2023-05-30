package POM;

import javax.swing.GroupLayout.Group;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TESTNGGROUP 
{
	@Test(groups = {"functional"})
	public void data1()
	{
		Reporter.log("Dolly");
	}
	@Test(groups = {"sanity"})
	public void data2()
	{
		Reporter.log("queen");
	}
	@Test(groups = {"smoke"})
	public void data3()
	{
		Reporter.log("king");
	}
	@Test(groups = {"functional","sanity"})
	public void data4()
	{
		Reporter.log("siva");
	}
	@Test(groups = {"integration"})
	public void data5()
	{
		Reporter.log("karthi",true);
	}
	@Test(groups = {"sanity","smoke"})
	public void data6()
	{
		Reporter.log("char",true);
	}
	@Test(groups = {"functional","integration"})
	public void data7()
	{
		Reporter.log("Doll");
	}
	}

