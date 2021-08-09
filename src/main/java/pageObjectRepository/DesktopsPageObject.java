package pageObjectRepository;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import core.Base;
import utilites.WebDriverUtility;

public class DesktopsPageObject extends Base {

	public DesktopsPageObject() {
		PageFactory.initElements(driver, this);
	}

//Scenario 1
	
	
	
	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
	private WebElement desktopTab;
	public void clickOnDesktopTab() {
		WebDriverUtility.clickOnElement(desktopTab);
	}
	
	
	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement showAllDesktops;
	public void clickOnshowAllDesktops() {
		WebDriverUtility.clickOnElement(showAllDesktops);
	}

	@FindBy(xpath = "//div[contains(text(),'Showing 1 to 12 of 12 (1 Pages)')]")
	private WebElement textAllItemsDisplayed;
	public boolean AllItemsIsDisplayed() {

		if (textAllItemsDisplayed.isDisplayed())
			return true;
		else
			return false;
	}

//Scenario 2 HPLP 3065

	@FindBy(xpath = "//a[text()='HP LP3065']")
	private WebElement addToCartOptionHPLP3065;
	public void clickOnAddToCarOptiontHPLP30655() {
		WebDriverUtility.clickOnElement(addToCartOptionHPLP3065);
	}

	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement qtyHPLP3065;
	public void EnterQtyHPLP3065(String qtyNumber) {

		WebDriverUtility.clearText(qtyHPLP3065);
		WebDriverUtility.enterValue(qtyHPLP3065, qtyNumber);

	}

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartButHPLP3065;
	public void clickOnAddToCartButHPLP3065() {
		WebDriverUtility.clickOnElement(addToCartButHPLP3065);
	}

						
	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement successMessage;
	
	public String successMessage() {
		String expected = "Success: You have added HP LP 3065 to your shopping cart!";
		String actual = "Success: You have added HP LP 3065 to your shopping cart!";
		System.out.println(actual.substring(0, 7));
		System.out.println(expected.substring(0, 7));
		return successMessage.getText();
	}
		
//
//			return tagPriceOfMacIsDisplayed.getText(); 
//		boolean HPLP3065AddedToCartOutcome = successMessageHPLP3065.isDisplayed();
		



//		Scenario 3 Canon 

	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[1]/i[1]")
	private WebElement addToCartOptionCanon;
	public void clickOnAddToCartOptionCanon() {
		WebDriverUtility.clickOnElement(addToCartOptionCanon);
	}

	@FindBy(xpath = "//select[@id='input-option226']")
	private WebElement selectCanonRed;
	public void clickOnSelectCanonRed() {
		WebDriverUtility.selectByVisibleText(selectCanonRed, "Red");
	}

	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement qtyCanon;
	public void EnterQtyCanon(String qtyNumber) {
		WebDriverUtility.clearText(qtyCanon);
		WebDriverUtility.enterValue(qtyCanon, qtyNumber);
	}

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartButCanon;
	public void clickOnAddToCartButCanon() {
		WebDriverUtility.clickOnElement(addToCartButCanon);
	}

//	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
//	private WebElement successMessageCanon;
//	public String successMessageCanon() {
//		return successMessageCanon.getText();
//		

	

//		Scenario 4	

	@FindBy(xpath = "//a[text()='Canon EOS 5D']")
	private WebElement CanonItem;
	public void clickOnCanonItem() {
		WebDriverUtility.clickOnElement(CanonItem);
	}

	@FindBy(xpath = "//a[contains(text(),'Reviews (0)')]")
	private WebElement reviewButton;
	public void clickOnReviewButton() {
		WebDriverUtility.clickOnElement(reviewButton);
	}

	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement reviewName;
	public void addYourNameOnReviewsField(String yourName) {
		WebDriverUtility.enterValue(reviewName, yourName);
	}

	@FindBy(xpath = "//textarea[@id='input-review']")
	private WebElement myTextReview;
	public void addYourTextReviewsField(String TextReview) {
		WebDriverUtility.enterValue(myTextReview, TextReview);
	}

	@FindBy(xpath = "//input[@value='5']")
	private WebElement rating5;
	public void clickRatingValue(String ratingValue) {
		WebDriverUtility.clickOnElement(rating5);

	}

	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement continueButtonReview;
	public void clickOncontinueButtonReview() {
		WebDriverUtility.clickOnElement(continueButtonReview);
	}

	@FindBy(xpath = "//div[contains(text(), ' Thank you for your review.')]")
	private WebElement successReviewMessage;
	public String successReviewMessage() {
		String message = successReviewMessage.getText();
		return message;
		
			
	}
}