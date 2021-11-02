package com.mindtree.uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class details {
	public WebDriver driver;
	By login=By.linkText("Login");
	By email=By.xpath("//*[@id='customer_email']");
	By password=By.xpath("//*[@id='customer_password']");
	By title = By.className("announcement-bar-text");
	By submit = By.xpath("//button[@type='submit']");
	

public details(WebDriver driver) {
	
	 this.driver=driver;
	 
}


public WebElement getLogin() {
	// TODO Auto-generated method stub
	return driver.findElement(login);
	
}
public WebElement getTitle() {
	// TODO Auto-generated method stub
	return driver.findElement(title);
	
}
public WebElement getSubmit() {
	// TODO Auto-generated method stub
	return driver.findElement(submit);
	
}

public WebElement getEmail() {
	// TODO Auto-generated method stub
	return driver.findElement(email);
	
}

public WebElement getpassword() {
	// TODO Auto-generated method stub
	return driver.findElement(password);
	
}


}
