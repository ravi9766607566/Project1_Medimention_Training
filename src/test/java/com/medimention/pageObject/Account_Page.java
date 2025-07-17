package com.medimention.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Account_Page extends Base_page
{
	WebDriver driver;
	public Account_Page(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//a[@class='navbar-brand']/small")
	@CacheLookup
	WebElement AccHead;
	
//	@FindBy(xpath = "//li[@class='green']//span")
	@FindBy(xpath = "//a[@role='button']")
	@CacheLookup
	WebElement UserHead;
	
	@FindBy(xpath = "//i[@class='ace-icon fa fa-power-off']")
	@CacheLookup
	WebElement logoutbtn;
	
	public String accountHead()
	{
		return AccHead.getText();
	}
	
	public String userHead()
	{
		return UserHead.getText();
	}
	
	public void userDrop()
	{
		UserHead.click();
	}
	
	public void logoutBtn()
	{
		logoutbtn.click();
	}
	
	
	
}
