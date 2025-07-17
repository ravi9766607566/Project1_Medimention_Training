package com.medimention.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Create_Acc_Page extends Base_page
{
	WebDriver driver;
	public Create_Acc_Page(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath = "//button[@data-id='UserRole']")
	@CacheLookup
	WebElement groupBtn;
	
	@FindBy(xpath = "//span[text()='Blood Bank']")
	@CacheLookup
	WebElement bbOpt;
	
	@FindBy(id = "DetailName")
	@CacheLookup
	WebElement bbName;
	
	@FindBy(id = "UserUsername")
	@CacheLookup
	WebElement bbUsername;
	
	@FindBy (name = "data[User][Email]")
	@CacheLookup
	WebElement bbUserEmail;
	
	@FindBy (id = "UserPassword")
	@CacheLookup
	WebElement bbUserPassword;
	
	@FindBy (id = "UserPassword1")
	@CacheLookup
	WebElement bbConfPassword;
	
	@FindBy (name = "terms")
	@CacheLookup
	WebElement regAggrement;
	
	@FindBy (xpath = "//span[text()='Reset']")
	@CacheLookup
	WebElement resetBtn;
	
	@FindBy (xpath = "//span[text()='Register']")
	@CacheLookup
	WebElement regisBtn;
	
	@FindBy (xpath = "//a[@class='back-to-login-link']")
	@CacheLookup
	WebElement bkloginBtn;
	
	public void selectGroup() 
	{
		groupBtn.click();
	}
	
	public void bloodBank() 
	{
		bbOpt.click();
	}
	
	public void Bname(String name) 
	{
		bbName.sendKeys(name);
	}
	
	public void BUsername(String username) 
	{
		bbUsername.sendKeys(username);
	}
	
	public void BEmail(String email) 
	{
		bbUserEmail.sendKeys(email);
	}
	
	public void BPassword(String password) 
	{
		bbUserPassword.sendKeys(password);
	}
	
	public void BConfPass(String password) 
	{
		bbConfPassword.sendKeys(password);
	}
	
	public void regAgree() 
	{
		regAggrement.click();;
	}
	
//	public void Reset() 
//	{
//		resetBtn.click();;
//	}
	
	public void registerBtn() 
	{
		regisBtn.click();;
	}
	
//	public void BKloginBtn() 
//	{
//		bkloginBtn.click();
//	}
	
}
