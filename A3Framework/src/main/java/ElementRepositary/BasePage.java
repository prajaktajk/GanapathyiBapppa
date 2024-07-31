package ElementRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtils.BaseClass;

public class BasePage extends BaseClass {
	
	@FindBy(partialLinkText ="Register")
	private WebElement registerLink;
	
	@FindBy(partialLinkText  ="Log in")
	private WebElement loginLink;
	
	@FindBy(partialLinkText ="Shopping cart")
	private WebElement shoppingcartLink;
	
	
	@FindBy(partialLinkText ="Wishlist")
	private WebElement wishlistLink;
	
	@FindBy(partialLinkText  ="BOOKS")
	private WebElement booksLink;
	
	@FindBy(partialLinkText ="COMPUTERS")
	private WebElement computersLink;
	
	@FindBy(partialLinkText  ="ELECTRONICS")
	private WebElement electronicsLink;
	
	@FindBy(partialLinkText ="APPARELS & SHOES")
	private WebElement apparelsandshoesLink;
	
	
	@FindBy(partialLinkText ="DIGITAL DOWNLOADS")
	private WebElement digitaldownloadLink;
	
	@FindBy(partialLinkText  ="JEWELRY")
	private WebElement jewelryLink;
	
	@FindBy(partialLinkText ="GIFT CARDS")
	private WebElement giftcardsLink;
	
	
	@FindBy(id ="small-searchterms")
	private WebElement searchbox;
	
	@FindBy(xpath  ="//input[@value='Search']")
	private WebElement searchButton;
	
	
	
	
	
	 public WebElement getRegisterLink() {
		return registerLink;
	}


	 /**
		 * @this method is used to login
		 */


	public WebElement getLoginLink() {
		
		return loginLink;
	}





	public WebElement getShoppingcartLink() {
		return shoppingcartLink;
	}





	public WebElement getWishlistLink() {
		return wishlistLink;
	}





	public WebElement getBooksLink() {
		return booksLink;
	}





	public WebElement getComputersLink() {
		return computersLink;
	}





	public WebElement getElectronicsLink() {
		return electronicsLink;
	}





	public WebElement getApparelsandshoesLink() {
		return apparelsandshoesLink;
	}





	public WebElement getDigitaldownloadLink() {
		return digitaldownloadLink;
	}





	public WebElement getJewelryLink() {
		return jewelryLink;
	}





	public WebElement getGiftcardsLink() {
		return giftcardsLink;
	}





	public WebElement getSearchbox() {
		return searchbox;
	}





	public WebElement getSearchButton() {
		return searchButton;
	}





	public BasePage(WebDriver driver) 
	 {
		PageFactory.initElements(driver, this); 
	 }
	
}
