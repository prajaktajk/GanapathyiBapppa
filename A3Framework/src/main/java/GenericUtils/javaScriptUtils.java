package GenericUtils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class javaScriptUtils {
	WebDriver driver;
	JavascriptExecutor js;

	public javaScriptUtils(WebDriver driver) {
		this.driver = driver;
		js= (JavascriptExecutor)driver;
	}
	
	

}
