package com.medimention.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.medimention.pageObject.Account_Page;
import com.medimention.pageObject.Create_Acc_Page;
import com.medimention.pageObject.Entry_Page;
import com.medimention.pageObject.Home_Page;

public class TC_Registration extends Base_Class
{
	@Test(groups= {"sanity"})
	public void account_Register()
	{
		Create_Acc_Page objcap= new Create_Acc_Page(driver);
		Entry_Page objep= new Entry_Page(driver);
		Home_Page objhp= new Home_Page(driver);
		Faker fake= new Faker();
		Account_Page objap=new Account_Page(driver);
		
		String pwd= fake.internet().password();
		String bussName= fake.name().fullName();
		String username= randomString()+randomNumber();
		String bussEmail= fake.internet().emailAddress();
		
		objep.homBtn();
		objhp.registerBtn();
		objcap.selectGroup();
		objcap.bloodBank();
//		objcap.Bname(p.getProperty("BusinessName"));
		objcap.Bname(bussName);
		objcap.BUsername(username);
//		objcap.BEmail(randomString()+"@aol.com");
		objcap.BEmail(bussEmail);
		objcap.BPassword(pwd);
		objcap.BConfPass(pwd);
		objcap.regAgree();
		objcap.registerBtn();
		
		System.out.println(pwd+"\t"+bussName+"\t"+username+"\t"+bussEmail);
		
		Assert.assertTrue(objap.accountHead().contains(bussName));
		Assert.assertTrue(objap.userHead().contains(username));
		
		objap.userDrop();
		objap.logoutBtn();
		objhp.homeHeading();
		
	}
}
