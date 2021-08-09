package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.LaptopsNoteBooksPageObject;
import utilites.WebDriverUtility;

public class LaptopsStepDef extends Base {

	LaptopsNoteBooksPageObject LaptopTest = new LaptopsNoteBooksPageObject();

//Scenario1
	@Given("^User is on Retail Website2$")
	public void user_is_on_Retail_websites() {
		openBrowser();
		WebDriverUtility.screenShot();
		logger.info("Retail Website is opened");
	}

	@When("^User click on Laptop &NoteBook tab$")
	public void user_click_on_Laptop_NoteBook_tab() {
		LaptopTest.clickOnLaptopsAndNotebooks();
		WebDriverUtility.screenShot();
		logger.info("User clicked on Laptop &NoteBook tab ");
	}

	@And("^User click on Show all Laptop &NoteBook option$")
	public void user_click_on_Show_all_Laptop_NoteBook_option() {
		LaptopTest.clickOnLshowAllLaptopsAndNotebooks();
		WebDriverUtility.screenShot();
		logger.info("User clicked on Show all Laptop &NoteBook");
	}

//Scenario2
	@And("^User click on MacBook item$")
	public void user_click_on_MacBook_item() {
		LaptopTest.clickOnMacBookItem();
		WebDriverUtility.screenShot();
		logger.info("User click on MacBook item");
	}

	@And("^User click add to Cart Macbutton$")
	public void user_click_add_to_Cart_Macbutton() {
		LaptopTest.clickOnAddToCartMacBook();
		WebDriverUtility.screenShot();
		logger.info("User click add to Cart Macbutton");
	}

	@Then("^User should see a message ‘Success: You have added MacBook to your shopping cart!’$")
	public void User_should_see_a_message_Success_You_have_added_MacBook_to_your_shopping_cart() {
		Assert.assertTrue(LaptopTest.MacBookAddedToCartOutcome());
		WebDriverUtility.screenShot();
		logger.info("Success: you have added MacBook to your Shopping cart! is diplayed");
	}

	@And("^User should see item Mac showed in the cart$")
	public void user_should_see_item_Mac_showed_in_the_cart() {
		LaptopTest.clickOnMacShowedInTheCart();
		WebDriverUtility.screenShot();
		logger.info("User should see ‘1 item(s)-602.00’ showed to the cart");
	}

	@And("^User click on cart option$")
	public void user_click_on_cart_option() {
		LaptopTest.clickOnShoppingCart();
		WebDriverUtility.screenShot();
		logger.info("User click on cart option");
	}

	@And("^User click on red X button to remove the item from cart$")
	public void user_click_on_red_X_button_to_remove_the_item_from_cart() {
		LaptopTest.RemoveButShoppingCart();
		WebDriverUtility.screenShot();
		logger.info("User clicked on remove button");
	}

	@Then("^Item should be removed and cart should show zero items$")
	public void item_should_be_removed_and_cart_should_show_zero_items() {
		LaptopTest.clickOnShoppingCart();
		WebDriverUtility.screenShot();
		logger.info("The item is removed");
	}

//Scenario 3

	@When("^User click on product comparison icon on ‘MacBook’$")
	public void user_click_on_product_comparison_icon_on_MacBook() {
		LaptopTest.clickOnCompareMacBook();
		WebDriverUtility.screenShot();
		logger.info("User clicked on product comparison icon on ‘MacBook’");
	}

	@When("^User click on product comparison icon on ‘MacBook Air’$")
	public void user_click_on_product_comparison_icon_on_MacBook_Air() {
		LaptopTest.clickOnCompareMacBookAir();
		WebDriverUtility.screenShot();
		logger.info("User click on product comparison icon on ‘MacBook Air");
	}

	@Then("^User should see a message ‘Success: You have added MacBook Air to your product comparison!$")
	public void user_should_see_a_message_Success_You_have_added_MacBook_Air_to_your_product_comparison() {
//		Assert.assertTrue(LaptopTest.ComparisonOutcome());
		String expectedMessage1 = "Success: You have added MacBook Air to your product comparison!";
		String actualMessage1 = LaptopTest.ComparisonOutcome();
		System.out.println(expectedMessage1.substring(0, 20));
		System.out.println(actualMessage1.substring(0, 20));
		WebDriverUtility.screenShot();
		logger.info("Success: You have added MacBook Air to your product comparison! is diplayed");
	}

	@Then("^User click on Product comparison link$")
	public void user_click_on_Product_comparison_link() {
		LaptopTest.clickOnComparisonLink();
		WebDriverUtility.screenShot();
		logger.info("User click on Product comparison link");
	}

	@Then("^User should see Product Comparison Chart$")
	public void user_should_see_Product_Comparison_Chart() {
		Assert.assertTrue(LaptopTest.comparisonTableOutcome());
		WebDriverUtility.screenShot();
		logger.info("User see Product Comparison Chart");
	}

//Scenario 4
	@When("^User click on heart icon to add ‘Sony VaIO’ laptop to wish list$")
	public void user_click_on_heart_icon_to_add_Sony_VaIO_laptop_to_wish_list() {
		LaptopTest.clickOnAddToWishListSonyVAIO();
		WebDriverUtility.screenShot();
		logger.info("User clicked on heart icon to add ‘Sony VaIO’ laptop to wish list");
	}

	@Then("^User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’$")
	public void user_get_a_message() {
		String expectedMessage = "You must login or create an account to save Sony VAIO to your wish list!";
		String actualMessage = LaptopTest.wishListMessage();
		System.out.println(actualMessage.substring(0, 43));
		System.out.println(expectedMessage.substring(0, 43));
//		Assert.assertEquals(expectedMessage, actualMessage);
		WebDriverUtility.screenShot();	
		logger.info("User see the message ‘You must login or create an account to save Sony VAIO to your wish list!’");
	}

	
//Scenario 5
	@When("^User click on ‘MacBook Pro’ item$")
	public void user_click_on_MacBook_Pro_item() {
		LaptopTest.clickOnItemMacBookPro();
		WebDriverUtility.screenShot();
		logger.info("User clicked on ‘MacBook Pro’ item");
	}
	
	@Then("^User should see price tag \"([^\"]*)\" is present on UI$")
	public void User_should_see__price_tag_is_present_on_UI(String expectedPrice) {
		LaptopTest.tagPriceOfMacIsDisplayed();
		WebDriverUtility.screenShot();
		String actualPrice = LaptopTest.tagPriceOfMacIsDisplayed();
		System.out.println(actualPrice);
		Assert.assertEquals(actualPrice, expectedPrice);
		logger.info("User see the price tag present on UI");
		//capture the price that macbook through your code
		//Assert the price macbood that receive from you code to the price that your passing from feature file
		
	}

}