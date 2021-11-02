package com.mindtree.pageobject;

import java.io.IOException;
import java.util.logging.Logger;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mindtree.reusablecomponents.ReadPropertyFile;
import com.mindtree.uistore.details;

public class ValidatingTitle extends ReadPropertyFile {
	public static Logger log = Logger.getLogger(ReadPropertyFile.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = DriverInitialisation();
		log.info("Driver is initialised");
		driver.get(p.getProperty("url"));

		log.info("navigation to url");

	}

	@Test
	public void validatingTitle() throws IOException {

		details data = new details(driver);

		Assert.assertEquals(data.getTitle().getText(), "USE COUPON - ELOCAL TO GET 5% OFF ONLY ON PREPAID ORDERS");
		log.info("validated succesfully");

	}

	@AfterTest
	public void turnoff() {

		driver.close();
	}
}
