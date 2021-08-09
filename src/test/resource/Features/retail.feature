@CompleteReatailPage
Feature: Info Account

Background:
  Given User is on Retail Website3
	And User click on MyAccount2
	When User click on Login2
	And User enter username 'rebecca123@gmail.com' and password2 'reb1234'
	And User click on Login button1
	Then User should be logged in to MyAccount dashboard1
	
		
	@RegisterAffiliateUser
	Scenario: Register as an Affiliate user with Cheque Payment Method
	
	When User click on Register for an Affiliate Account link
	And User fill affiliate form with below information
	|company|website|taxID|paymentMethod|
	|Tek School|http://tek-school.com/retail/index.php?route=common/home|45883395|RebecaTerra|
	And User check on About us check box
	And User click on Continue button1
	Then User should see a success message

	@EditingAffiliateInfo
	Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
	
	When User click on Edit your affiliate informationlink 
	And User click on Bank Transfer radio button
	And User fill Bank information with below information
	|bankName|abaNumber|swiftCode|accountName|accountNumber|
	|Citi Bank|55777667|65495555555558|RET009|990909009|
	And User click on Continue button2
	Then User should see a success message1
	
	@EdditingAccountInfo
	Scenario: Edit your account Information 
	
	When User click on ‘Edit your account information’ link 
	And User modify below information 
	|firstname|lastName|email|telephone|
	|Rebecca|Terra|rebecca1234@gmail.com|8989000987|
	And User click on continue button3 
	Then User should see a message2 ‘Success: Your account has been successfully updated.’
	