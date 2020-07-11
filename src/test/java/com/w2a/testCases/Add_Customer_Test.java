package com.w2a.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;
import com.w2a.utilities.ExcelReader;
import com.w2a.utilities.TestUtil;
public class Add_Customer_Test extends TestBase {


	
@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
public void AddCustomer(String firstName , String lastName , String postcode) {
	driver.findElement(By.xpath(objectRepo.getProperty("Bankmgrlgnbtn"))).click();
	//Thread.sleep(3000);
	driver.findElement(By.xpath(objectRepo.getProperty("Addcustomerbtn"))).click();
	//Thread.sleep(2000);
	
	driver.findElement(By.xpath(objectRepo.getProperty("fName"))).sendKeys(firstName);
	driver.findElement(By.xpath(objectRepo.getProperty("lName"))).sendKeys(lastName);
	driver.findElement(By.xpath(objectRepo.getProperty("pcode"))).sendKeys(postcode);
	driver.findElement(By.xpath(objectRepo.getProperty("Addcustsubmitbtn"))).submit();
	
}

}
