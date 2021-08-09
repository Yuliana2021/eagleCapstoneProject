package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.HomePageObject;
import utilites.WebDriverUtility;

public class HomePageStepDefinition extends Base {

	HomePageObject HomePageTest = new HomePageObject();

	@Given("^User is on Retail website4$")
	public void user_is_on_Retail_website() {
		openBrowser();
		WebDriverUtility.screenShot();
		logger.info("Retail Website is opened");
	}

	@And("^User click on Currency$")
	public void user_click_on_Currency() {
		HomePageTest.clickOnCurrency();
		WebDriverUtility.screenShot();
		logger.info("User clicked on currency");
	}

	@And("^User choose Euro from dropdown$")
	public void user_choose_Euro_from_dropdown() {
		HomePageTest.selectEuro();
		WebDriverUtility.screenShot();
		logger.info("User selected Euro currency");
	}

	@Then("^Currency value should change to Euro$")
	public void currency_value_should_change_to_Euro() {
		WebDriverUtility.screenShot();
		logger.info("Currency value is changed to Euro");
	}

//	Scenario 2
	@When("^User click on shopping cart1$")
	public void user_click_on_shopping_cart() {
		HomePageTest.clickOnShoppingCart();
		WebDriverUtility.screenShot();
		logger.info("User clicked on shopping cart1");
	}

	@Then("^“Your shopping cart is empty!” message should display$")
	public void your_shopping_cart_is_empty_message_should_display() {
		String expectedMessage = "Your shopping cart is empty!";
		String actualMessage = HomePageTest.shoppingCartMessage();
		Assert.assertEquals(expectedMessage, actualMessage);
		WebDriverUtility.screenShot();
		logger.info("User see 'Your shopping cart is empty!' message on display");

	}

}
