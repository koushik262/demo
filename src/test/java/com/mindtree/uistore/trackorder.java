package com.mindtree.uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class trackorder {
	
	public WebDriver driver;
	
	By track=By.cssSelector("#site-header-nav > nav > ul.navmenu.navmenu-depth-1 > li.navmenu-item.navmenu-id-track-your-order > a");
	By radio=By.xpath("//input[@value='awb']");
	By AWBid=By.xpath("//input[@name='track_id']");
	By submit=By.cssSelector("Button[id='next']");
	

public trackorder(WebDriver driver) {
	
	 this.driver=driver;
}


public WebElement getTrackyourOrder() {
	return driver.findElement(track);
	
	
}
public WebElement getRadio() {
	return driver.findElement(radio);
	
	
}
public WebElement getAWBid() {
	return driver.findElement(AWBid);
	
	
}
public WebElement getSubmit() {
	return driver.findElement(submit);
	
	
}

}
