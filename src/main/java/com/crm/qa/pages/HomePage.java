package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//span[contains(text(),'Jagtap')]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//body/div[@id='ui']/div[1]/div[1]/div[3]/a[1]/i[1]")
	WebElement contactsLink;
	
	@FindBy(xpath="//span[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//span[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
		
	}
	
	public boolean verifyUserName()
	{
		return userNameLabel.isDisplayed();
	}
	
	public ConntactsPage clickOnContactLinks()
	{
		contactsLink.click();
		return new ConntactsPage();
	}
	
	public  DealsPage clickOnDealsLinks()
	{
		dealsLink.click();
		return new DealsPage();
		
	}
	
	public TasksPage clickOnTasksLinkk()
	{
		tasksLink.click();
		return new TasksPage();
	}

	/*
	 * public void clickOnContactLink() { Actions action = new Actions(driver);
	 * action.moveToElement(contactsLink).build().perform(); newc }
	 */
	

}
