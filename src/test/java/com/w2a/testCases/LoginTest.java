package com.w2a.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class LoginTest extends TestBase{
    
	
	@Test
	public void LoginAsbankmgr() throws InterruptedException {
		
		
	   driver.findElement(By.xpath(objectRepo.getProperty("Bankmgrlgnbtn"))).click();
	   Thread.sleep(3000);
	   Assert.assertTrue(true);
	}

}

