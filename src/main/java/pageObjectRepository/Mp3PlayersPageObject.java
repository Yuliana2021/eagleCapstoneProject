package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class Mp3PlayersPageObject extends Base {
	
	public Mp3PlayersPageObject() {
		PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath = "//body/div[@id='product-category']/ul[1]/li[2]/a[1]")
	private WebElement mp3PlayersBut;
	
	public void clickOnMp3PlayersBut() {
		WebDriverUtility.clickOnElement(mp3PlayersBut);
	}
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
	private WebElement test11;

	public void clickOnTest11() {
		WebDriverUtility.clickOnElement(test11);
	}
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")
	private WebElement test12;

	public void clickOnTest12() {
		WebDriverUtility.clickOnElement(test12);
	}
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
	private WebElement test15;

	public void clickOnTest15() {
		WebDriverUtility.clickOnElement(test15);
	}
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")
	private WebElement test16;

	public void clickOnTest16() {
		WebDriverUtility.clickOnElement(test16);
	}
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]")
	private WebElement test17;

	public void clickOnTest17() {
		WebDriverUtility.clickOnElement(test17);
	}
		
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/a[1]")
	private WebElement test18;

	public void clickOnTest18() {
		WebDriverUtility.clickOnElement(test18);
	}
		
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[2]/ul[1]/li[2]/a[1]")
	private WebElement test19;

	public void clickOnTest19() {
		WebDriverUtility.clickOnElement(test19);
	}
		
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[2]/ul[1]/li[3]/a[1]")
	private WebElement test20;

	public void clickOnTest20() {
		WebDriverUtility.clickOnElement(test20);
	}
		
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[2]/ul[1]/li[4]/a[1]")
	private WebElement test21;

	public void clickOnTest21() {
		WebDriverUtility.clickOnElement(test21);
	}
		
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[2]/ul[1]/li[5]/a[1]")
	private WebElement test22;

	public void clickOnTest22() {
		WebDriverUtility.clickOnElement(test22);
	}
		
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[1]")
	private WebElement test23;
	
	public void clickOnTest23() {
		WebDriverUtility.clickOnElement(test23);
	}
	
		
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[3]/ul[1]/li[2]/a[1]")
	private WebElement test24;

	public void clickOnTest24() {
		WebDriverUtility.clickOnElement(test24);
	}
		
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[3]/ul[1]/li[3]/a[1]")
	private WebElement test4;

	public void clickOnTest4() {
		WebDriverUtility.clickOnElement(test4);
	}
		
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[3]/ul[1]/li[4]/a[1]")
	private WebElement test5;

	public void clickOnTest5() {
		WebDriverUtility.clickOnElement(test5);
	}
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[3]/ul[1]/li[5]/a[1]")
	private WebElement test6;

	public void clickOnTest6() {
		WebDriverUtility.clickOnElement(test6);
	}
		
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[4]/ul[1]/li[1]/a[1]")
	private WebElement test7;
	public void clickOnTest7() {
		WebDriverUtility.clickOnElement(test7);
	}
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[4]/ul[1]/li[2]/a[1]")
	private WebElement test8;

	public void clickOnTest8() {
		WebDriverUtility.clickOnElement(test8);
	}
		
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[4]/ul[1]/li[3]/a[1]")
	private WebElement test9;

	public void clickOnTest9() {
		WebDriverUtility.clickOnElement(test9);
	}
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/a[1]/img[1]")
	private WebElement imgiPodClassic;
	
	public void clickOnImgiPodClassic() {
		WebDriverUtility.clickOnElement(imgiPodClassic);
	}
	@FindBy(xpath = "//a[contains(text(),'iPod Classic')]")
	private WebElement itemiPodClassic;

	public void clickOnItemiPodClassic() {
		WebDriverUtility.clickOnElement(itemiPodClassic);
	}
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[2]/button[1]/span[1]")
	private WebElement addToCartiPodClassic;
	
	public void clickOnAddToCartiPodClassic() {
		WebDriverUtility.clickOnElement(addToCartiPodClassic);
	}
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[2]/button[2]/i[1]")
	private WebElement addToWishListiPodClassic;

	public void clickOnAddToWishListiPodClassic() {
		WebDriverUtility.clickOnElement(addToWishListiPodClassic);
	}
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[2]/button[3]")
	private WebElement compareiPodClassic;

	public void clickOnCompareiPodClassic() {
		WebDriverUtility.clickOnElement(compareiPodClassic);
	}
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/a[1]/img[1]")
	private WebElement imgiPodNano;

	public void clickOnImgiPodNano() {
		WebDriverUtility.clickOnElement(imgiPodNano);
	}
	@FindBy(xpath = "//a[contains(text(),'iPod Nano')]")
	private WebElement itemiPodNano;

	public void clickOnItemiPodNano() {
		WebDriverUtility.clickOnElement(itemiPodNano);
	}
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[1]/span[1]//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[2]")
	private WebElement addToCartiPodNano;

	public void clickOnAddToCartiPodNano() {
		WebDriverUtility.clickOnElement(addToCartiPodNano);
	}
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[2]")
	private WebElement addToWishListiPodNano;

	public void clickOnAddToWishListiPodNano() {
		WebDriverUtility.clickOnElement(addToWishListiPodNano);
	}
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[3]/i[1]")
	private WebElement compareiPodNano;

	public void clickOnCompareiPodNano() {
		WebDriverUtility.clickOnElement(compareiPodNano);
	}
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/a[1]/img[1]")
	private WebElement imgiPodShuffle;
	
	public void clickOnImgiPodShuffle() {
		WebDriverUtility.clickOnElement(imgiPodShuffle);
	}
	@FindBy(xpath = "//a[contains(text(),'iPod Shuffle')]")
	private WebElement itemiPodShuffle;
	
	public void clickOnItemiPodShuffle() {
		WebDriverUtility.clickOnElement(itemiPodShuffle);
	}	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[1]")
	private WebElement addToCartiPodShuffle;

	public void clickOnAddToCartiPodShuffle() {
		WebDriverUtility.clickOnElement(addToCartiPodShuffle);
	}	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[2]/i[1]")
	private WebElement addToWishListiPodShuffle;

	public void clickOnAddToWishListiPodShuffle() {
		WebDriverUtility.clickOnElement(addToWishListiPodShuffle);
	}	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[3]/i[1]")
	private WebElement compareiPodShuffle;

	public void clickOnCompareiPodShuffle() {
		WebDriverUtility.clickOnElement(compareiPodShuffle);
	}	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[4]/div[1]/div[1]/a[1]/img[1]")
	private WebElement imgiPodTouch;

	public void clickOnImgiPodTouch() {
		WebDriverUtility.clickOnElement(imgiPodTouch);
	}	
	@FindBy(xpath = "//a[contains(text(),'iPod Touch')]")
	private WebElement itemiPodTouch;

	public void clickOnItemiPodTouch() {
		WebDriverUtility.clickOnElement(itemiPodTouch);
	}
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[4]/div[1]/div[2]/div[2]/button[1]/span[1]")
	private WebElement addToCartiPodTouch;
	
	public void clickOnAddToCartiPodTouch() {
		WebDriverUtility.clickOnElement(addToCartiPodTouch);
	}
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[4]/div[1]/div[2]/div[2]/button[2]")
	private WebElement addToWishListiPodTouch;

	public void clickOnAddToWishListiPodTouch() {
		WebDriverUtility.clickOnElement(addToWishListiPodTouch);
	}
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[4]/div[1]/div[2]/div[2]/button[3]/i[1]")
	private WebElement compareiPodTouch;
	
	public void clickOnCompareiPodTouch() {
		WebDriverUtility.clickOnElement(compareiPodTouch);
	}
	
}
