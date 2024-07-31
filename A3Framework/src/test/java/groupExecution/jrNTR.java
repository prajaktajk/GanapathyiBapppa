package groupExecution;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class jrNTR {
	@Test(groups = { "tfi","pan india"})
	public  void main() {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/N._T._Rama_Rao_Jr.");
	}
	@Test
	public  void main1() {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Anushka_Shetty");
		Reporter.log("sweet");
	}


}
