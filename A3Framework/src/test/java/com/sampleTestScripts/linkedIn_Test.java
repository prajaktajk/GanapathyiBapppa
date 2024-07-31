package com.sampleTestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class linkedIn_Test {
	
	@Test
	public void linkedInLaunch()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.linkedin.com/");
		driver.close();
	}

}
