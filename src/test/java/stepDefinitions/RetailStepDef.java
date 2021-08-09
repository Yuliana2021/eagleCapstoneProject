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
import pageObjectRepository.RetailPageObject;
import utilites.WebDriverUtility;

public class RetailStepDef extends Base {

	RetailPageObject RetailTest = new RetailPageObject();

	@Given("^User is on Retail Website3$")
	public void User_is_on_Retail_Website2() {
		openBrowser();
		WebDriverUtility.screenShot();
		logger.info("Retail Website is opened");
	}

	@When("^User click on MyAccount2$")
	public void User1_click_on_MyAccount() {
		RetailTest.clickOnMyAccount();
		WebDriverUtility.screenShot();
		logger.info("User clicked on MyAccount");
	}

	@And("^User click on Login2$")
	public void User1_click_on_Login() {
		RetailTest.clickOnLogin();
		WebDriverUtility.screenShot();
		logger.info("User Clicked on Login");
	}

	@And("^User enter username '(.+)' and password2 '(.+)'$")
	public void User1_enter_userName_and_password(String userName, String password) {
		RetailTest.enterEmail(userName);
		logger.info("user entered email");
		RetailTest.enterPassword(password);
		WebDriverUtility.screenShot();
		logger.info("user entered password");
	}

	@And("^User click on Login button1$")
	public void User1_click_on_Login_button() {
		RetailTest.clickOnLoginButton();
		WebDriverUtility.screenShot();
		logger.info("user clicked on login button");
	}

	@Then("^User should be logged in to MyAccount dashboard1$")
	public void User1_should_be_logged_in_to_myAccount_Dashboard() {
		WebDriverUtility.screenShot();
		logger.info("user logged to myAccount Dashboard");
	}
	
//RegisterAffiliateUser

	@When("^User click on Register for an Affiliate Account link$")
	public void User1_click_on_Register_for_an_Affiliate_Account_link() {
		RetailTest.clickOnAffiLink();
		WebDriverUtility.screenShot();
		logger.info("user clicked on Register option");
	}

	@When("^User fill affiliate form with below information$")
	public void User1_fill_form_with_below_information(DataTable info) {
		List<Map<String, String>> affiData = info.asMaps(String.class, String.class);
		RetailTest.enterCompanyName(affiData.get(0).get("company"));
		RetailTest.enterWebsite(affiData.get(0).get("website"));
		RetailTest.enterTaxID(affiData.get(0).get("taxID"));
		RetailTest.enterChequeName(affiData.get(0).get("paymentMethod"));
		WebDriverUtility.screenShot();
		logger.info("User filled out affiliate form with below information");
	}

	@And("^User check on About us check box$")
	public void User_check_on_About_us_check_box() {
		RetailTest.clickOnReadAndAgreeButton();
		WebDriverUtility.screenShot();
		logger.info("user clicked on Register option");
	}

	@And("^User click on Continue button1$")
	public void User_click_on_continue_button1() {
		RetailTest.clickOnContinueButton();
		WebDriverUtility.screenShot();
		logger.info("user clicked on Continue button1");

	}

	@Then("^User should see a success message$")
	public void User_should_see_a_success_message() {
		String expectedMessage = "Success: Your account has been successfully updated.";
		String actualMessage = RetailTest.affiMessage();
		Assert.assertEquals(expectedMessage, actualMessage);
		WebDriverUtility.screenShot();
		logger.info("user see success message");
	}

//EdditAffiInfo
	@When("^User click on Edit your affiliate informationlink$")
	public void User_clickon_Edit_your_affiliate_informationlink() {
	RetailTest.clickOnEditAffiLink();
	WebDriverUtility.screenShot();
	logger.info("User clicked on Edit your affiliate informationlink");
	}	
	
	@And("^User click on Bank Transfer radio button$")
	public void User_click_on_Bank_Transfer_radio_button() {
	RetailTest.clickOnBankTransferButton();
	WebDriverUtility.screenShot();
	logger.info("User clicked on Bank Transfer radio button");
	}
	
	
	@And("^User fill Bank information with below information$")
	public void User_fill_bank_information_with_below_information(DataTable info) {
		RetailTest.clickOnBankTransferButton();
	List<Map<String, String>> dataValues = info.asMaps(String.class, String.class);
	RetailTest.enterBankName(dataValues.get(0).get("bankName"));
	RetailTest.enterABANumber(dataValues.get(0).get("abaNumber"));
	RetailTest.enterSwiftCode(dataValues.get(0).get("swiftCode"));
	RetailTest.enterBankName(dataValues.get(0).get("accountName"));
	RetailTest.enterAccountNumber(dataValues.get(0).get("accountNumber"));
	WebDriverUtility.screenShot();
	logger.info("User filled out Bank information with below information");
	}
	
	@And ("^User click on Continue button2$")
	public void User_click_on_Continue_button2() {
	RetailTest.clickOnContBut2();		
	WebDriverUtility.screenShot();
	logger.info("User clicked on Continue button2");
	}
	
	
	@Then ("^User should see a success message1$")
	public void user_should_see_a_success_message1() {
		String expectedMessage = "Success: Your account has been successfully updated.";
		String actualMessage = RetailTest.succesMessageBank();
		Assert.assertEquals(expectedMessage, actualMessage);
		WebDriverUtility.screenShot();
		logger.info("User see success message");
	}
		
	
	
//EdditingAccountInfo
	
	@When("^User click on ‘Edit your account information’ link$")
	public void user_accept_on_link() {
	RetailTest.clickOnEditAccountInfo();
	WebDriverUtility.screenShot();
	logger.info("User clicked on ‘Edit your account information’ link");
	}
	
	
	
	@And("^User modify below information$")
	public void User_modify_below_information (DataTable info) {
		List<Map<String, String>> dataValues = info.asMaps(String.class, String.class);
		RetailTest.enterFirstName(dataValues.get(0).get("firstname"));
		RetailTest.enterLastName(dataValues.get(0).get("lastName"));
		RetailTest.enterRegistrationEmail(dataValues.get(0).get("email"));
		RetailTest.enterTelephone(dataValues.get(0).get("telephone"));
		WebDriverUtility.screenShot();
		logger.info("User modified below information");

	}

	@And("^User click on continue button3$")
	public void user_click_on_continue_button3() {
		RetailTest.clickOnContBut3();
		WebDriverUtility.screenShot();
		logger.info("User clicked on continue button3");
	}
	@Then ("^User should see a message2 ‘Success: Your account has been successfully updated.’$")
	public void user_should_see_a_success_message2() {
		String expectedMessage = "Success: Your account has been successfully updated.";
		String actualMessage = RetailTest.succesMessageAccount();
		Assert.assertEquals(expectedMessage, actualMessage);
		WebDriverUtility.screenShot();
		logger.info("User see success message2");
	}	

}
