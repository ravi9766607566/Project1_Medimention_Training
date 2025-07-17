package com.medimention.testCases;

import org.openqa.selenium.StaleElementReferenceException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.medimention.pageObject.Account_Page;
import com.medimention.pageObject.Create_Acc_Page;
import com.medimention.pageObject.Entry_Page;
import com.medimention.pageObject.Home_Page;
import com.medimention.utilities.DataProviders;

public class TC_Registration_DDT extends Base_Class
{
	@Test(dataProvider = "RegisterData", dataProviderClass = DataProviders.class, expectedExceptions = {StaleElementReferenceException.class})
	public void account_Register(String B_Name, String username, String email, String password, String confpassword) throws InterruptedException
	{
		Create_Acc_Page objcap= new Create_Acc_Page(driver);
		Entry_Page objep= new Entry_Page(driver);
		Home_Page objhp= new Home_Page(driver);
//		Faker fake= new Faker();
		Account_Page objap=new Account_Page(driver);
		
//		String pwd= fake.internet().password();
//		String bussName= fake.name().fullName();
//		String username= randomString()+randomNumber();
//		String bussEmail= fake.internet().emailAddress();
		
		objep.homBtn();
		objhp.registerBtn();
		objcap.selectGroup();
		objcap.bloodBank();
		objcap.Bname(B_Name);
		objcap.BUsername(username);
//		objcap.BEmail(randomString()+"@aol.com");
		objcap.BEmail(email);
		objcap.BPassword(password);
		objcap.BConfPass(confpassword);
		objcap.regAgree();
		objcap.registerBtn();
		
		System.out.println(B_Name+"\t"+username+"\t"+password+"\t"+email);
		
		boolean bn=objap.accountHead().contains(B_Name);
		boolean hn=objap.userHead().contains(username);
		
//		Assert.assertTrue(objap.accountHead().contains(B_Name));
//		Assert.assertTrue(objap.userHead().contains(username));
		
		Thread.sleep(2000);
		objap.userDrop();
		objap.logoutBtn();
		objhp.homeHeading();
	
	}

}
