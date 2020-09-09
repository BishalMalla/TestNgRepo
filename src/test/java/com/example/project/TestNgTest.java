package com.example.project;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import org.openqa.selenium.By;

@Listeners(ListenerTest.class)
public class TestNgTest extends Base {
	
	/*@Test(priority=1)
	public void doLogin() {
		System.out.println("DO login test");
	}
	
	@Test(priority=2)
	public void doPasswordChange() {
		System.out.println("changing password");
	}
	
	@Test(priority=3)
	public void doLogout() {
		System.out.println("Logging out");
	}
	
	@Test(priority=4)
	public void valueMatch() {
		String expVal = "A";
		String actVal = "A";
		Assert.assertEquals(actVal, expVal);
	}
	
	@Test(priority=5)
	void negativeTestCase() {
		Assert.assertTrue(1>2,"The item is lesser than");
	}*/
	@BeforeMethod
	public void beforeTest() {
		 initialization();
	}
	@Test(priority=6)
	public void captureScreenShot1() throws Exception {
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath(".//*[@id='emailfield']")).sendKeys("bishal.malla@gmail.com");
		//Utility.captureScreenShot(driver);		
	}
	@AfterMethod
	public void afterTest() {
		driver.quit();
	}
	
}
