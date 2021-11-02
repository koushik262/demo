package com.mindtree.pageobject;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mindtree.reusablecomponents.ReadPropertyFile;
import com.mindtree.uistore.details;

public class HomePage extends ReadPropertyFile{
	
	
	@BeforeTest
	public void initialise() throws IOException {
		
		driver=DriverInitialisation();
	}
	
	@Test(dataProvider="getData")
	public void logintest(String email,String password) throws InterruptedException {
		
		driver.get(p.getProperty("url"));
		
		details d = new details(driver);
		
		d.getLogin().click();
		
		Thread.sleep(5000L);
		
		
		d.getEmail().sendKeys(email);
		Thread.sleep(5000L);
		d.getpassword().sendKeys(password);	
		Thread.sleep(5000L);
		d.getSubmit().click();
		
	}
	@DataProvider
	public Object[][] getData() {
		
		
		Object[][] ob=new Object[1][2];
		
		ob[0][0]="koushik";
		ob[0][1]="15452";
	
		return ob;
		
	}
	@AfterTest
	public void turnoff() {
		
		driver.close();
	}

}
