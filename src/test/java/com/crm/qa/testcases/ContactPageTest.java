package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ConntactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactPageTest extends TestBase {
	LoginPage lp;
	HomePage hp;
	ConntactsPage cp;
	TestUtil tu;
	
	public ContactPageTest()
	{
		super();		
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		initialization();
		Thread.sleep(18000);
		try {
					Thread.sleep(18000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		tu =new TestUtil();
		lp = new LoginPage();
		cp= new ConntactsPage();
		hp = lp.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void varifyContactsPageLabel()
	{
		//tu.switchToFrame();
		Assert.assertTrue(cp.verifyContactLabel(), "Contact label is missing on the page");
	}
	
	@Test(priority=2)
	public void validateCreatNewContact()
	{
		hp.clickOnContactLinks();
		cp.creatNewContact("Umesh", "Jagtap", "Infosys");
	}
	
	
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

	

}
