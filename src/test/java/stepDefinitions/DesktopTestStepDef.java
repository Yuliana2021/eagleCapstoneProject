package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.DesktopsPageObject;
import utilites.WebDriverUtility;

public class DesktopTestStepDef extends Base {

	DesktopsPageObject desktopTest = new DesktopsPageObject();
	
//Background
	@Given("^User is on Retail website3$")
	public void user_is_on_Retail_website() {
		openBrowser();
		WebDriverUtility.screenShot();
		logger.info("Retail Website is opened");
		}

	@When("^User click on Desktops tab$")
	public void user_click_on_Desktops_tab() {
		desktopTest.clickOnDesktopTab();
		WebDriverUtility.screenShot();
		logger.info("User clicked on desktop tab");
	}

	@When("^User click on Show all desktops$")
	public void user_click_on_Show_all_desktops() {
		desktopTest.clickOnshowAllDesktops();
		WebDriverUtility.screenShot();
		logger.info("User clicked on Show all desktops");
	}
//Scenario -------1
	
	@Then("^User should see all items are present in Desktop page$")
	public void user_should_see_all_items_are_present_in_Desktop_page() {
		desktopTest.AllItemsIsDisplayed();
		WebDriverUtility.screenShot();
		logger.info("All items are displayed");
	}

	@When("^User click  ADD TO CART option on HP LP3065 item$")
	public void user_click_ADD_TO_CART_option_on_HP_LP_item() {
		desktopTest.clickOnAddToCarOptiontHPLP30655();
		WebDriverUtility.screenShot();
		logger.info("User clicked ADD TO CART option on HPLP3065 ");
	}

	@And("^User select quantity 1$")
	public void user_select_quantity() {
		desktopTest.EnterQtyHPLP3065(getBrowser());
		desktopTest.EnterQtyHPLP3065("1");
		WebDriverUtility.screenShot();
		logger.info("User selected quantity 1");
	}

	@And("^User click add to Cart buttonHP$")
	public void user_click_add_to_Cart_button() {
		desktopTest.clickOnAddToCartButHPLP3065();
		WebDriverUtility.screenShot();
		logger.info("User clicked add to Cart button");
	}

	@Then("^User should see a message ‘Success: you have added HP LP 3065 to your Shopping cart!’$")
	public void user_should_see_a_message_Success_you_have_added_HP_LP_to_your_Shopping_cart() {
		desktopTest.successMessage();
//		String expected = "Success: You have added HP LP 3065 to your shopping cart!";
//		String actual = "Success: You have added HP LP 3065 to your shopping cart!";
//		Assert.assertEquals(expected, actual);
		WebDriverUtility.screenShot();
//		System.out.println(actual.substring(0, 7));
//		System.out.println(expected.substring(0, 7));
		logger.info("User can see a succes message for adding HPLP3065");
	}
// Scenario - - - - - -2
	
	@When("^User click  ADD TO CART option on ‘Canon EOS 5D’ item$")
	public void user_click_ADD_TO_CART_option_on_Canon_EOS_5D_item() {
		desktopTest.clickOnAddToCartOptionCanon();
		WebDriverUtility.screenShot();
		logger.info("User clicked ADD TO CART option on Canon EOS5D");
	}

	@When("^User select color from dropdown ‘Red’$")
	public void user_select_color_from_dropdown_Red() {
		desktopTest.clickOnSelectCanonRed();
		WebDriverUtility.screenShot();
		logger.info("User select red color from dropdown");

	}

	@And("^And User select quantity 1$")
	public void and_user_select_quantity_1() {
		desktopTest.EnterQtyCanon(getBrowser());
		desktopTest.EnterQtyCanon("1");
		WebDriverUtility.screenShot();
		logger.info("user selected quantity 1");

	}

	@And("^User click add to Cart buttonCanon$")
	public void user_click_add_to_cart_buttonCanon() {
		desktopTest.clickOnAddToCartButCanon();
		WebDriverUtility.screenShot();
		logger.info("User clicked add to Cart buttonCanon");
	}

	@Then("^User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’$")
	public void user_should_see_a_message_Success_You_have_added_Canon_EOS_D_to_your_shopping_cart() {
		desktopTest.successMessage();
//		String expected = "Success: You have added Canon EOS 5D to your shopping cart!";
//		String actual = desktopTest.successMessage();
//		Assert.assertEquals(expected, actual);
		WebDriverUtility.screenShot();
//		System.out.println(actual.substring(0, 7));
//		System.out.println(expected.substring(0, 7));
		logger.info("should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!");
	}
// Scenario - - - - 3
	
	@When("^User click on Canon EOS 5D item$")
	public void on_Canon_EOS_5D_item() {
		desktopTest.clickOnCanonItem();
		WebDriverUtility.screenShot();
		logger.info("User clicked on Canon EOS 5D item");
	}

	@When("^User click on write a review link$")
	public void user_click_on_write_a_review_link() {
		desktopTest.clickOnReviewButton();
		WebDriverUtility.screenShot();
		logger.info("User clicked write a review link");
	}

	@When("^User fill the review information with below information$")
	public void user_fill_the_review_information_with_below_information(DataTable info) {
		List<Map<String, String>> dataValues = info.asMaps(String.class, String.class);
		desktopTest.addYourNameOnReviewsField(dataValues.get(0).get("yourname"));
		desktopTest.addYourTextReviewsField(dataValues.get(0).get("yourReview"));
		desktopTest.clickRatingValue(dataValues.get(0).get("Rating"));
		WebDriverUtility.screenShot();
		logger.info("User filled the review field");
	}

	@When("^User click on continue button4$")
	public void user_click_on_Continue_Button() {
		desktopTest.clickOncontinueButtonReview();
		WebDriverUtility.screenShot();
		logger.info("User clicked on continue button4");
	}

	@Then("^User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”$")
	public void user_should_see_a_message_with_Thank_you_for_your_review_It_has_been_submitted_to_the_webmaster_for_approval() {
		String expectedMessage = "Thank you for your review. It has been submitted to the webmaster for approval.";
		String actualMessage = desktopTest.successReviewMessage();
		Assert.assertEquals(expectedMessage, actualMessage);
		logger.info("User can a success message");
		
		
	}

}
