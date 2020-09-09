package com.example.project;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Base {
	public static WebDriver driver;
	
	public static void initialization() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\bimalla\\Documents\\geckodriver.exe");
		File pathBinary = new File("C:\\Users\\bimalla\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);   
		DesiredCapabilities desired = DesiredCapabilities.firefox();
		FirefoxOptions options = new FirefoxOptions();
		desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
	    driver = new FirefoxDriver(options); 
	}
	
	public static String captureScreenShot() {
		try {
			TakesScreenshot ts =(TakesScreenshot)driver;			
			String file = ts.getScreenshotAs(OutputType.BASE64);
			System.out.println("Screenshot Taken");
			System.out.println(file);
			return file;
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.out.println("Exeception while taking screen shot" + e.getMessage());
			return null;
		}
	} 
}
