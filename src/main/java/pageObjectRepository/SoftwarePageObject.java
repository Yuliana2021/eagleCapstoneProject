package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class SoftwarePageObject extends Base {
	
	public SoftwarePageObject() {
		PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath = "//body/div[@id='product-category']/ul[1]/li[2]/a[1]")
	private WebElement softwareBut;
	
	public void clickOnSoftwareBut() {
		WebDriverUtility.clickOnElement(softwareBut);
	}
	@FindBy(xpath = "//a[contains(text(),'Continue')]")
	private WebElement continueButton;

	public void clickOncontinueButton() {
		WebDriverUtility.clickOnElement(continueButton);
	}
	

}
