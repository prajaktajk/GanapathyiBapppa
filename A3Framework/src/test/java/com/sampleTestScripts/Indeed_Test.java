package com.sampleTestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Indeed_Test {
	
	@Test
	public void indeedLaunch()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.indeed.com/");
		driver.close();
	}


}
