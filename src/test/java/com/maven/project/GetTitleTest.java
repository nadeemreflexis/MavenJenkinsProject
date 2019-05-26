package com.maven.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GetTitleTest 
{
	@Test
	public void getTitleTest()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
