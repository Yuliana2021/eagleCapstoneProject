package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class LaptopsNoteBooksPageObject extends Base {

	public LaptopsNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}

//Scenario 1

	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")
	private WebElement LaptopsAndNotebooks;
	public void clickOnLaptopsAndNotebooks() {
		WebDriverUtility.clickOnElement(LaptopsAndNotebooks);
	}

	@FindBy(linkText = "Show All Laptops & Notebooks")
	private WebElement showAllLaptopsAndNotebooks;
	public void clickOnLshowAllLaptopsAndNotebooks() {
		WebDriverUtility.clickOnElement(showAllLaptopsAndNotebooks);
	}

//Scenario 2

	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/h4[1]/a[1]")
	private WebElement MacBookItem;
	public void clickOnMacBookItem() {
		WebDriverUtility.clickOnElement(MacBookItem);
	}

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartMacBook;
	public void clickOnAddToCartMacBook() {
		WebDriverUtility.clickOnElement(addToCartMacBook);
	}

	@FindBy(xpath = "//div[contains (text(), 'Success: You have added ')]")
	private WebElement successMessage;
	public boolean MacBookAddedToCartOutcome() {

		boolean MacBookAddedToCartOutcome = successMessage.isDisplayed();
		return MacBookAddedToCartOutcome;    // change!!!!!!!!!!!!!!!!!!!!!!!!!
	}

	@FindBy(xpath = "//header/div[1]/div[1]/div[3]/div[1]/button[1]")
	private WebElement MacShowedInTheCart;
	public void clickOnMacShowedInTheCart() {
		WebDriverUtility.wait(4000);
		WebDriverUtility.clickOnElement(MacShowedInTheCart);

	}


	@FindBy(xpath = "//span[@id='cart-total']") 
	private WebElement shoppingCart;
	public void clickOnShoppingCart() {
		WebDriverUtility.clickOnElement(shoppingCart);
	}

	@FindBy(xpath = "//i[@class='fa fa-times-circle']") 
	private WebElement RemoveButShoppingCart;
	public void RemoveButShoppingCart() {

		WebDriverUtility.clickOnElement(shoppingCart);

	}

//Scenario 3

	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[3]")
	private WebElement compareMacBook;
	public void clickOnCompareMacBook() {
		WebDriverUtility.clickOnElement(compareMacBook);
	}
					
	@FindBy(xpath = "//body/div[@id='product-category']/div[2]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[3]/i[1]")
	private WebElement compareMacBookAir;
	public void clickOnCompareMacBookAir() {
		WebDriverUtility.clickOnElement(compareMacBookAir);
	}

	//******************************************************************************
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]")
	private WebElement successMessageComparisson;
	public String ComparisonOutcome() {
		String ComparisonOutcome = successMessageComparisson.getText();
		return ComparisonOutcome;
			
	}

	@FindBy(xpath = "//a[contains (text(), 'product comparison')]")
	private WebElement comparisonLink;
	public void clickOnComparisonLink() {
		WebDriverUtility.clickOnElement(comparisonLink);    
	}

	@FindBy(xpath = "//body/div[@id='product-compare']/div[1]/div[1]/table[1]")
	private WebElement comparisonTable;
	public boolean comparisonTableOutcome() {

		boolean comparisonTableOutcome = comparisonTable.isDisplayed();
		return comparisonTableOutcome;
	}

//Scenario 4

	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[5]/div[1]/div[2]/div[2]/button[2]/i[1]")
	private WebElement addToWishListSonyVAIO;
	public void clickOnAddToWishListSonyVAIO() {
		WebDriverUtility.clickOnElement(addToWishListSonyVAIO);
	}

	@FindBy(xpath = "//body/div[@id='product-category']/div[1]")
	private WebElement wishListMessage;
	public String wishListMessage() {
		String message = wishListMessage.getText();
		return message;
		
	}

//Scenario 5

	@FindBy(xpath = "//a[contains(text(),'MacBook Pro')]")
	private WebElement itemMacBookPro;
	public void clickOnItemMacBookPro() {
		WebDriverUtility.clickOnElement(itemMacBookPro);
	}

	@FindBy(xpath = "//h2[contains(text(),'$2,000.00')]")
	private WebElement tagPriceOfMacIsDisplayed;
	public String tagPriceOfMacIsDisplayed() {
		return tagPriceOfMacIsDisplayed.getText();
	}

}
