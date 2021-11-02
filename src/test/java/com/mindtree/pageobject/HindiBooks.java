package com.mindtree.pageobject;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mindtree.reusablecomponents.ReadPropertyFile;
import com.mindtree.uistore.HindiBookDetails;

public class HindiBooks extends ReadPropertyFile {
	
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
	public void hindibooks() throws InterruptedException {
		
		HindiBookDetails hbd=new HindiBookDetails(driver);
		
		hbd.getHindiBook().sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		
		Thread.sleep(5000L);
		
		
		Set<String> ab=driver.getWindowHandles();
		Iterator<String> it=ab.iterator();
		String parentId=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		
		
		hbd.getfeatures().click();
		for(int i=0;i<5;i++) {
		hbd.getfeatures().sendKeys(Keys.DOWN);
	
		}
		hbd.getfeatures().sendKeys(Keys.ENTER);
		hbd.getBook().click();
		Thread.sleep(5000);
		
		
		
		/*hbd.getCart().click();
		Thread.sleep(5000);
		hbd.getGoCart().click();
		Thread.sleep(5000);*/
		
		
		driver.switchTo().window(parentId);
		
		
		
	}
	@AfterTest
	public void close() {
		
		driver.quit();
		
	}

}