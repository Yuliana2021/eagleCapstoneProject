@CompleteTestHomePage
Feature: Home Page Feature

Background:
Given User is on Retail website4

@VerifyCurrency
Scenario: User verify currency values change

When User click on Currency 
And User choose Euro from dropdown 
Then Currency value should change to Euro


@CartTest
Scenario: User empty Shopping cart message displays 

When User click on shopping cart1 
Then “Your shopping cart is empty!” message should display
