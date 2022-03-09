package com.crm.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Pagefactory or Object reposetory
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	WebElement loginButton;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement loginButton1;
	
	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	WebElement SignUp;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public HomePage login(String username,String password) throws InterruptedException
	{
		Thread.sleep(8000);
		loginButton.click();
		Thread.sleep(8000);
		email.sendKeys(username);
		pwd.sendKeys(password);
		loginButton1.click();
		
		
		
		
		return new HomePage();
	}
	
	
	

}
