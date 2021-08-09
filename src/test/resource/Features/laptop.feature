@CompleteTestLaptops
Feature: Laptops and Notepads features

Background: 
	Given User is on Retail Website2
	When User click on Laptop &NoteBook tab 
	And User click on Show all Laptop &NoteBook option 
	
	
@LaptopsAddRemoveTest
Scenario: Add and Remove a Mac book from Cart 

	And User click on MacBook item 
	And User click add to Cart Macbutton 
	Then User should see a message ‘Success: You have added MacBook to your shopping cart!’
	And User should see item Mac showed in the cart 
	And User click on cart option 
	And User click on red X button to remove the item from cart
	Then Item should be removed and cart should show zero items

@LaptopsComparisonTest
Scenario: Product Comparison  

	And User click on product comparison icon on ‘MacBook’
	And User click on product comparison icon on ‘MacBook Air’
	Then User should see a message ‘Success: You have added MacBook Air to your product comparison!
	And User click on Product comparison link 
	Then User should see Product Comparison Chart

@LaptopsWishList
Scenario: Adding an item to Wish list   

	And User click on heart icon to add ‘Sony VaIO’ laptop to wish list 
	Then User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’

@LaptopsPriceTest
Scenario: Validate the price of MacBook Pro is 2000   

	And User click on ‘MacBook Pro’ item 
	Then User should see price tag "$2,000.00" is present on UI
	



