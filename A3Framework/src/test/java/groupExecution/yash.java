package groupExecution;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class yash {
	
		@Test(groups = {"kfi","pan india"}) 
		public  void main() {
			ChromeDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://en.wikipedia.org/wiki/Yash_Gowda");
		}

}
