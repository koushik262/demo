package com.mindtree.pageobject;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mindtree.reusablecomponents.ReadPropertyFile;
import com.mindtree.uistore.trackorder;

public class TrackyourOrder extends ReadPropertyFile{
	
public static Logger log=Logger.getLogger(ReadPropertyFile.class.getName());
	
	
	@BeforeTest
	public void initialize() throws IOException {
		driver=DriverInitialisation();
		log.info("Driver is initialised");
		driver.get(p.getProperty("url"));

		System.out.println(p.getProperty("url"));
		log.info("navigation to url");		
		
	}
	@Test
	public void trackorder() throws InterruptedException {
		
		trackorder to=new trackorder(driver);
		
		to.getTrackyourOrder().click();
		Thread.sleep(5000L);
		
		to.getRadio().click();
		
		to.getAWBid().sendKeys("1654");
		
		Thread.sleep(5000L);
		to.getSubmit().click();
		
		
	}
	@AfterTest
	public void close() {
		
		driver.close();
		
	}
}
