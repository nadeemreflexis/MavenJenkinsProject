package com.maven.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class GetTextTest 
{
	@Test
	public void getTextTest()
	{
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://tumblr.com");
		String tumblrText=driver.findElement(By.id("signup_forms_submit")).getText();
		System.out.println(tumblrText);
		driver.quit();
	}

}
