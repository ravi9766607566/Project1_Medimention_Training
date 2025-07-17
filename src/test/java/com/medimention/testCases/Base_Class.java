package com.medimention.testCases;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class Base_Class 
{
	WebDriver driver;
	public Properties p;
	
	@BeforeClass(groups= {"sanity"})
	@Parameters({"os","browser"})
	public void setUp(String os,String bro) throws IOException
	{
		FileReader file=new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		switch(bro)
		{
		case "chrome": driver = new ChromeDriver();break;
		case "edge": driver= new EdgeDriver(); break;
		default: System.out.println("Invalid Browser"); return;
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get(p.getProperty("appUrl"));
		driver.manage().window().maximize();
	}
	
	@AfterClass(groups= {"sanity"})
	public void tearDown()
	{
		driver.quit();
	}
	
	public String randomString()
	{
		String generateString= RandomStringUtils.randomAlphabetic(5);
		return generateString;
	}
	
	public String randomNumber()
	{
		String generateNumber= RandomStringUtils.randomNumeric(5);
		return generateNumber;
	}
	
}
