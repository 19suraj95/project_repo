package com.w2a.utilities;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Hashtable;

import org.testng.annotations.DataProvider;

import com.w2a.base.TestBase;

public class TestUtil extends TestBase{
    
	
	@DataProvider(name="dp")
	public Object[][] getData() throws IOException {
		ExcelReader reader = new ExcelReader();
		Object data[][] = reader.getTestdata(config.getProperty("SheetName"));

		return data;

	}
	
	
	
	
	
	
	
	
	
}
