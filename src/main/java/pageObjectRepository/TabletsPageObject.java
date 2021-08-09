package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class TabletsPageObject extends Base {
	
	public TabletsPageObject() {
		PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath = "//body/div[@id='product-category']/ul[1]/li[2]/a[1]")
	private WebElement tabletsBut;
	
	public void clickOnTabletsBut() {
		WebDriverUtility.clickOnElement(tabletsBut);
	}

	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/img[1]")
	private WebElement imgSamsungGalaxyTab;
	
	public void clickOnImgSamsungGalaxyTab() {
		WebDriverUtility.clickOnElement(imgSamsungGalaxyTab);
	}

	@FindBy(xpath = "//a[contains(text(),'Samsung Galaxy Tab 10.1')]")
	private WebElement itemSamsungGalaxyTab;
	
	public void clickOnItemSamsungGalaxyTab() {
		WebDriverUtility.clickOnElement(itemSamsungGalaxyTab);
	}

	@FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
	private WebElement addToCartSamsungGalaxyTab;

	public void clickOnAddToCartSamsungGalaxyTab() {
		WebDriverUtility.clickOnElement(addToCartSamsungGalaxyTab);
	}
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/button[2]/i[1]")
	private WebElement addToWishListSamsungGalaxyTab;

	public void clickOnAddToWishListSamsungGalaxyTab() {
		WebDriverUtility.clickOnElement(addToWishListSamsungGalaxyTab);
	}
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/button[3]/i[1]")
	private WebElement compareSamsungGalaxyTab;
	
	public void clickOnCompareSamsungGalaxyTab() {
		WebDriverUtility.clickOnElement(compareSamsungGalaxyTab);
	}
}