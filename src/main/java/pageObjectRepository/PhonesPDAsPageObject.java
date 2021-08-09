package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class PhonesPDAsPageObject extends Base {
	
	public PhonesPDAsPageObject() {
		PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath = "//body/div[@id='product-category']/ul[1]/li[2]/a[1]")
	private WebElement phonesPDAsBut;
	
	public void clickOnPhonesPDAsBut() {
		WebDriverUtility.clickOnElement(phonesPDAsBut);
	}
	

// phones
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/img[1]")
	private WebElement imgHTCTouchHD;

	public void clickOnImgHTCTouchHD() {
		WebDriverUtility.clickOnElement(imgHTCTouchHD);
	}
	
	@FindBy(xpath = "//a[contains(text(),'HTC Touch HD')]")
	private WebElement itemHTCTouchHD;
	
	public void clickOnItemHTCTouchHD() {
		WebDriverUtility.clickOnElement(itemHTCTouchHD);
	}
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/button[1]/span[1]")
	private WebElement addToCartHTCTouchHD;
	
	public void clickOnAddToCartHTCTouchHD() {
		WebDriverUtility.clickOnElement(addToCartHTCTouchHD);
	}
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/button[2]/i[1]")
	private WebElement addToWishListHTCTouchHD;
	
	public void clickOnAddToWishListHTCTouchHD() {
		WebDriverUtility.clickOnElement(addToWishListHTCTouchHD);
	}
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/button[3]")
	private WebElement compareHTCTouchHD;
	
	public void clickOnCompareHTCTouchHD() {
		WebDriverUtility.clickOnElement(compareHTCTouchHD);
	}	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/a[1]/img[1]")
	private WebElement imgiPhone;
	
	public void clickOnImgiPhone() {
		WebDriverUtility.clickOnElement(imgiPhone);
	}		
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/button[1]/span[1]")
	private WebElement addToCartiPhone;
	
	public void clickOnAddToCartiPhone() {
		WebDriverUtility.clickOnElement(addToCartiPhone);
	}			
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/button[2]")
	private WebElement addToWishListiPhone;

	public void clickOnAddToWishListiPhone() {
		WebDriverUtility.clickOnElement(addToWishListiPhone);
	}
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/button[3]/i[1]")
	private WebElement compareiPhone;

	public void clickOnCompareiPhone() {
		WebDriverUtility.clickOnElement(compareiPhone);
	}	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/a[1]/img[1]")
	private WebElement imgPalmTreoPro;
	
	public void clickOnImgPalmTreoPro() {
		WebDriverUtility.clickOnElement(imgPalmTreoPro);
	}		
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/button[1]/span[1]")
	private WebElement itemPalmTreoPro;
	
	public void clickOnItemPalmTreoPro() {
		WebDriverUtility.clickOnElement(itemPalmTreoPro);
	}			
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/button[1]/span[1]")
	private WebElement addToCartPalmTreoPro;
	
	public void clickOnAddToCartPalmTreoPro() {
		WebDriverUtility.clickOnElement(addToCartPalmTreoPro);
	}	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/button[2]")
	private WebElement addToWishListPalmTreoPro;
	
	public void clickOnAddToWishListPalmTreoPro() {
		WebDriverUtility.clickOnElement(addToWishListPalmTreoPro);
	}		
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/button[3]")
	private WebElement comparePalmTreoPro;
	
	public void clickOnComparePalmTreoPro() {
		WebDriverUtility.clickOnElement(comparePalmTreoPro);
	}	


}
