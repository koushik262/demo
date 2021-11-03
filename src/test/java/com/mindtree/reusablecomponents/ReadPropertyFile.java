package com.mindtree.reusablecomponents;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropertyFile {

	public static WebDriver driver;
	public Properties p;

	public WebDriver DriverInitialisation() throws IOException {
		// TODO Auto-generated method stub
		p = new Properties();
		FileInputStream fis = new FileInputStream("D:\\selinium\\cucumber\\pracFramework\\testdata\\configure.properties");
		p.load(fis);								//D:\selinium\cucumber\pracFramework\testdata\configure.properties
		String browserName = p.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", p.getProperty("chromedriver"));
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"D:\\selinium\\selenium-programs\\selenium.project\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"D:\\selinium\\selenium-programs\\selenium.project\\driver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		return driver;
	}

}
