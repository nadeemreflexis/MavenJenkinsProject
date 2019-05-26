package com.maven.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest 
{
	@Test
	public void loginTest() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		Thread.sleep(2000);
		driver.quit();
	}

}
