package com.medimention.pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Entry_Page extends Base_page
{
	WebDriver driver;
	public Entry_Page(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[text()='Home']")
	@CacheLookup
	WebElement btnHome;
	
	@FindBy(xpath="//[text()='About']")
	@CacheLookup
	WebElement btnAbout;
	
//	@FindBy(xpath="//[text()='Features']")
//	@CacheLookup
//	WebElement btnFeatures;
//	
//	@FindBy(xpath="//[text()='Bottom']")
//	@CacheLookup
//	WebElement btnBottom;
	
	//OR
	@FindBy(xpath="//ul[contains(@class,'menu-right')]//a") // All 4 menus in this element
	@CacheLookup
	List<WebElement> btnmenu;
	
//	public void hombtn()
//	{
//		btnHome.click();
//	}
	
	public void homBtn()
	{
		btnmenu.get(0).click();
	}
	
	public void AboBtn()
	{
		btnmenu.get(1).click();
	}
	
	public void feaBtn()
	{
		btnmenu.get(2).click();
	}
	
	public void botbtn()
	{
		btnmenu.get(3).click();
	}
	 
}
