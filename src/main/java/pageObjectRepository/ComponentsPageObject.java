package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class ComponentsPageObject extends Base{

	public ComponentsPageObject() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//body/div[@id='product-category']/ul[1]/li[2]/a[1]")
	private WebElement componentsBut;
	
	public void clickOnComponentsBut() {
		WebDriverUtility.clickOnElement(componentsBut);
	}	

	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
	private WebElement linkMiceAndTrackballs;
	
	public void clickOnLinkMiceAndTrackballs() {
		WebDriverUtility.clickOnElement(linkMiceAndTrackballs);
	}	
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
	private WebElement linkMonitors;
	
	public void clickOnLinkMonitors() {
		WebDriverUtility.clickOnElement(linkMonitors);
	}		
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")
	private WebElement linkPrinters;
	
	public void clickOnLinkPrinters() {
		WebDriverUtility.clickOnElement(linkPrinters);
	}		
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")
	private WebElement linkScanners;

	public void clickOnLinkScanners() {
		WebDriverUtility.clickOnElement(linkScanners);
	}		
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]")
	private WebElement linkWebCameras;

	public void clickOnLinkWebCameras() {
		WebDriverUtility.clickOnElement(linkWebCameras);
	}	
	
	
	
	

}
