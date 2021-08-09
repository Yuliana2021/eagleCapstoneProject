package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class RetailPageObject extends Base {
	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}
	
		
//AccountLogin -- -- --- -- - Background

	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	private WebElement myAccount;
	public void clickOnMyAccount() {
		WebDriverUtility.clickOnElement(myAccount);
	}

	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;
	public void clickOnLogin() {
		WebDriverUtility.clickOnElement(login);
	}

	@FindBy(id = "input-email")
	private WebElement emailField;
	public void enterEmail(String email) {
		WebDriverUtility.enterValue(emailField, email);
	}

	@FindBy(id = "input-password")
	private WebElement passwordField;
	public void enterPassword(String password) {
		WebDriverUtility.enterValue(passwordField, password);
	}

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton;
	public void clickOnLoginButton() {
		WebDriverUtility.clickOnElement(loginButton);
	}	
	
	
// @RegisterAffiliateUser - - - Scenario 1
	
	
	@FindBy(xpath = "//a[contains(text(),'Register for an affiliate account')]")
	private WebElement registerAffiLink;
	public void clickOnAffiLink() {
		WebDriverUtility.clickOnElement(registerAffiLink);

	}

	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement companyName;
	public void enterCompanyName(String companyNameText) {
		WebDriverUtility.enterValue(companyName, companyNameText);
	}

	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement inputWebsite;
	public void enterWebsite(String inputWebsiteText) {
		WebDriverUtility.enterValue(inputWebsite, inputWebsiteText);
	}

	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement inputTax;
	public void enterTaxID(String taxIDText) {
		WebDriverUtility.enterValue(inputTax, taxIDText);
	}

	@FindBy(id = "input-cheque")
	private WebElement chequeAccountName;

	public void enterChequeName(String EmailAccountPayment) {
		WebDriverUtility.enterValue(chequeAccountName, EmailAccountPayment);
	}

	@FindBy(xpath = "//input[@name='agree']")
	private WebElement readAndAgreeButton;
	public void clickOnReadAndAgreeButton() {
		WebDriverUtility.clickOnElement(readAndAgreeButton);
	}

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;
	public void clickOnContinueButton() {
		WebDriverUtility.clickOnElement(continueButton);
	}

	@FindBy(xpath = "//body/div[@id='account-account']/div[1]")
	private WebElement successMessage;
	public String affiMessage() {
		String message = successMessage.getText();
		return message;
	}

//Edit Affiliate- - - - - - ------Scenario 2

	@FindBy(xpath = "//a[contains(text(),'Edit your affiliate information')]")
	private WebElement editAffiLink;
	public void clickOnEditAffiLink() {
		WebDriverUtility.clickOnElement(editAffiLink);
	}

	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankTransfer;
	public void clickOnBankTransferButton() {
		WebDriverUtility.clickOnElement(bankTransfer);
	}

	@FindBy(xpath = "//input[@id='input-bank-name']")
	private WebElement bankName;
	public void enterBankName(String bankNameText) {
		WebDriverUtility.enterValue(bankAccountName, bankNameText);
	}

	@FindBy(xpath = "//input[@id='input-bank-branch-number']")
	private WebElement ABANumber;
	public void enterABANumber(String ABAText) {
		WebDriverUtility.enterValue(ABANumber, ABAText);
	}

	@FindBy(xpath = "//input[@id='input-bank-swift-code']")
	private WebElement swiftCode;
	public void enterSwiftCode(String SwiftCodeText) {
		WebDriverUtility.enterValue(swiftCode, SwiftCodeText);
	}

	@FindBy(xpath = "//input[@id='input-bank-account-name']")
	private WebElement bankAccountName;
	public void enterAccountName(String AccountNameText) {
		WebDriverUtility.enterValue(bankAccountName, AccountNameText);
	}

	@FindBy(xpath = "//input[@id='input-bank-account-number']")
	private WebElement bankAccountNumber;
	public void enterAccountNumber(String AccountNumberText) {
		WebDriverUtility.enterValue(bankAccountNumber, AccountNumberText);
	}

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton2;
	public void clickOnContBut2() {
		WebDriverUtility.clickOnElement(continueButton2);
	}

	@FindBy(xpath = "//body/div[@id='account-account']/div[1]")
	private WebElement successMessageBank;
	public String succesMessageBank() {
		String message = successMessageBank.getText();
		return message;
	}
//	Edit your account Information --- scenario 3
	
	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement editAccountInfo;
	public void clickOnEditAccountInfo() {
		WebDriverUtility.clickOnElement(editAccountInfo);
	}
	
	

	@FindBy(id = "input-firstname")
	private WebElement firstName;
	public void enterFirstName(String fName) {
    WebDriverUtility.clearText(firstName);
		WebDriverUtility.enterValue(firstName, fName);
	}

	@FindBy(id = "input-lastname")
	private WebElement lastName;
	public void enterLastName(String lName) {
		WebDriverUtility.clearText(lastName);
		WebDriverUtility.enterValue(lastName, lName);
	}

	@FindBy(id = "input-email")
	private WebElement email;
	public void enterRegistrationEmail(String emailvalue) {
		WebDriverUtility.clearText(email);
		WebDriverUtility.enterValue(email, emailvalue);
	}

	@FindBy(id = "input-telephone")
	private WebElement telephone;
	public void enterTelephone(String telephoneValue) {
		WebDriverUtility.clearText(telephone);
		WebDriverUtility.enterValue(telephone, telephoneValue);
	}
	
	@FindBy(xpath = "//body/div[@id='account-edit']/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")
	private WebElement continueButton3;
	public void clickOnContBut3() {
		WebDriverUtility.clickOnElement(continueButton3);
	}
	
	@FindBy(xpath = "//body/div[@id='account-account']/div[1]")
	private WebElement succesMessageAccount;
	public String succesMessageAccount() {
		String message = succesMessageAccount.getText();
		return message;

	}
		
}
