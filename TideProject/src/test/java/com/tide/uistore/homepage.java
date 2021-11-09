package com.tide.uistore;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {

public WebDriver driver;
	
	public homepage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(linkText = "//input[@name='q']")
	WebElement search;
	
	public WebElement getsearch()
	{
		return search;
	}
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	public WebElement getsubmit()
	{
		return submit;
	}
	
	
}
