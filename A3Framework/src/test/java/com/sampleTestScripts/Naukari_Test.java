package com.sampleTestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Naukari_Test {
@Test
public void naukariLaunch()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/");
	driver.close();
}
}
