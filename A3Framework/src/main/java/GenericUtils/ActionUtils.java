package GenericUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ActionUtils {
	
	Actions actions;
	public  ActionUtils(WebDriver driver){
		actions=new Actions(driver);
		}
		
		public void clickOnElement(WebElement ele) {
			actions.click(ele).perform();
		}
		
		public void passDataForElement(WebElement ele,String data) {
			actions.sendKeys(ele,data).perform();
	    
		}
		
		public void MouseoverorElement(WebElement ele) {
			actions.moveToElement(ele).perform();
	    
		}
		
		public void doubleClickorElement(WebElement ele) {
			actions.doubleClick(ele).perform();
	    
		}
		
		public void rightClickorElement(WebElement ele) {
			actions.contextClick(ele).perform();
	    
		}
		
		public void dragAndDropElement(WebElement src,WebElement dest) {
			actions.dragAndDrop(src,dest).perform();
	    
		}
		
		
		public void dragAndDropElementByOffset(WebElement ele,int Xoffset,int Yoffset) {
			actions.dragAndDropBy(ele,Xoffset,Yoffset).perform();
	    
		}
		
		public void scrollBasedOnAxis(int Xoffset,int Yoffset) {
			actions.scrollByAmount(Xoffset, Yoffset).perform();
	    
		}
		
		public void scrollUntilElementIsVisible(WebElement ele) {
			actions.scrollToElement(ele).perform();
	    
		}
		
		
		public void ScrollUntilElementVisible(WebElement ele,int Xoffset,int Yoffse) {
			ScrollOrigin origin=ScrollOrigin.fromElement(ele);
			actions.scrollFromOrigin(origin, Xoffset,Yoffse).perform();
	    
		}
		
		
		
		
		

}
