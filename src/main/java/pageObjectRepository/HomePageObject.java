package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import utilites.WebDriverUtility;

public class HomePageObject extends Base {

	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}

// Scenario1
	
	@FindBy(xpath = "//i[@class= 'fa fa-caret-down']")
	private WebElement currency;
	public void clickOnCurrency() {
		WebDriverUtility.clickOnElement(currency);
	}

	@FindBy(xpath = "//button[contains(text(),'€ Euro')]")
	private WebElement euro;
	public void selectEuro() {
		WebDriverUtility.clickOnElement(euro);
	}

//Scenario 2

	@FindBy(xpath = "//span[@id='cart-total']") // home page cart
	private WebElement shoppingCart;
	public void clickOnShoppingCart() {
		WebDriverUtility.clickOnElement(shoppingCart);
	}

	@FindBy(xpath = "//p[contains(text(),'Your shopping cart is empty!')]")
	private WebElement shopCartMessage;
	public String shoppingCartMessage() {
		String shoppingCartMessage = shopCartMessage.getText();
		return shoppingCartMessage;
	

	}
}
