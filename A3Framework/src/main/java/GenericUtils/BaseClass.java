package GenericUtils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import ElementRepositary.BasePage;
import ElementRepositary.LoginPage;

public class BaseClass implements IAutoConstants ,ITestListener{
	
	public static WebDriver driver;
	public FileLibrary flib;
	public BasePage bp;
	 public LoginPage lp;
	
	@BeforeSuite
	public void Beforesuit() {
		Reporter.log("Beforesuit",true);
		
		
	}
	
	@AfterSuite
	public void Aftersuit() {
		Reporter.log("Afteresuit",true);
		
		
	}
	
	@BeforeTest
	public void BeforeTest() {  
		
		Reporter.log("BeforeTest",true);
	} 
	
	@AfterTest
	public void AfterTest() {
		Reporter.log("AfterTest",true);
		
		
	}
	
	@Parameters("bname")
	@BeforeClass
	public void launchingBrowser(@Optional("chrome") String browsername) { 
		Reporter.log("BeforeClass",true);
		if (browsername.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			
		}
		else if (browsername.equalsIgnoreCase("edge")) {
			driver=new ChromeDriver();
		}
		driver=new ChromeDriver();
		bp=new  BasePage(driver);
		lp=new LoginPage(driver);
		flib=new FileLibrary();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implictTimeOut));
		
		
		
		
	} 
	@AfterClass
	public void tearDownBrowser() {
		Reporter.log("AfterClass",true);
		
		
	}
	
	@BeforeMethod
	public void naviaagateAndLoginTodws() { 
		Reporter.log("BeforeMethod",true);
		driver.get("https://demowebshop.tricentis.com/");
		lp.getLoginLink().click();
		lp.getEmailtextbox().sendKeys(flib.fetchDataFromProperties(PropertFilePath, "email"));
		lp.getPasswordtextbox().sendKeys(flib.fetchDataFromProperties(PropertFilePath, "password"));
		lp.getLoginbutton().click();
	} 
	@AfterMethod
	public void AfterMethod() {
		Reporter.log("AfterMethod",true);
		
	}
	
	
	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("[Testcase__"+result.getName() +"__is started]");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("[Testcase__"+result.getName() +"__is passed]");
			}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("[Testcase__"+result.getName() +"__is failed]");
		LocalDateTime ldt=LocalDateTime.now();
		String time = ldt.toString().replace(":","-" );
		
		TakesScreenshot ts= (TakesScreenshot)driver;
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    File dest=new File(screenShotPath+"screenShot.png");
	    try {
			FileHandler.copy(src, dest);
		} 
	    catch (Exception e) {
			
		}
	    
	}
		

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("[Testcase__"+result.getName() +"__is skippeded]");
		
	}

	

}
