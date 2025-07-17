package com.medimention.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders 
{
	@DataProvider(name="RegisterData")
	public String[][] getData() throws IOException
	{
		String path= "D:\\Study Materials_Ravi\\UC Uncodmy Class_Ravi\\Automation Class\\Eclipse Projects\\Project1_Medimention_Training\\TestData\\RegData.xlsx";
		ExcelUtility xlu=new ExcelUtility(path);
		int rows= xlu.getRowCount("Sheet1");
		int cols= xlu.getCellCount("Sheet1", 1);
		
		String regisData[][]=new String[rows][cols];
		for(int r=1; r<=rows; r++)
		{
			for(int c=0; c<cols; c++)
			{
				regisData[r-1][c]=xlu.getCellData("Sheet1", r, c);
			}
		}
		return regisData;
	}

}
