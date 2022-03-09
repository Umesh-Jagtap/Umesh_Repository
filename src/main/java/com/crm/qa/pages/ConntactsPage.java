package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ConntactsPage  extends TestBase {
	
	@FindBy(xpath=("//body/div[@id='ui']/div[1]/div[1]/div[3]/a[1]/i[1]"))
	WebElement contactsLabel;
	
	@FindBy(xpath=("//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]"))
	WebElement creatNewContactsLabel;
	
	@FindBy(xpath=("//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]"))
	WebElement firstName;
	
	@FindBy(xpath=("//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
	WebElement lastName;
	
	@FindBy(xpath=("//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/input[1]"))
	WebElement company;
	
	@FindBy(xpath=("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/button[2]"))
	WebElement saveButton;
	
	public ConntactsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifyContactLabel()
	{
		return contactsLabel.isDisplayed();
	}
	
	/*
	 * public void selectContactsByName() { driver.findElement(By.xpath(
	 * "//body/div[@id='ui']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]"
	 * )).click(); }
	 */
	
	public void creatNewContact(String  fName,String lName,String comp)
	{
		contactsLabel.click();
		creatNewContactsLabel.click();
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		company.sendKeys(comp);
		saveButton.click();
		
		
		
	}
	

}
