package com.mindtree.uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HindiBookDetails {

	public WebDriver driver;
	
	By hindibook=By.linkText("HINDI BOOKS");
	By featured = By.id("product_grid_sort");
	By book=By.xpath("//*[@id=\"shopify-section-static-collection\"]/div[1]/div[3]/ul/li[1]/div/div[1]/h2/a");
	By cart=By.xpath("//*[@id='product_form_6536827633743']/div[1]/button");
	By goCart=By.xpath("/html/body/header/section/div/div/div[2]/footer/a");
	

		public HindiBookDetails(WebDriver driver) {
			
			 this.driver=driver;
		}
		
		
		
		public WebElement getHindiBook() {
			
			return driver.findElement(hindibook);
			
			
		}

	public WebElement getBook() {
			
			return driver.findElement(book);
			
			
		}
		public WebElement getfeatures() {
			
			return driver.findElement(featured);
			
			
		}
public WebElement getCart() {
			
			return driver.findElement(cart);
			
			
		}
public WebElement getGoCart() {
	
	return driver.findElement(goCart);
	
	
}
		

}