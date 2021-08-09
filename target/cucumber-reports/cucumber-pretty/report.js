$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("laptop.feature");
formatter.feature({
  "line": 2,
  "name": "Laptops and Notepads features",
  "description": "",
  "id": "laptops-and-notepads-features",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@CompleteTestLaptops"
    }
  ]
});
formatter.before({
  "duration": 2078691800,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on Retail Website2",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User click on Laptop \u0026NoteBook tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User click on Show all Laptop \u0026NoteBook option",
  "keyword": "And "
});
formatter.match({
  "location": "LaptopsStepDef.user_is_on_Retail_websites()"
});
formatter.result({
  "duration": 3821194000,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsStepDef.user_click_on_Laptop_NoteBook_tab()"
});
formatter.result({
  "duration": 364412300,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsStepDef.user_click_on_Show_all_Laptop_NoteBook_option()"
});
formatter.result({
  "duration": 1862366100,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Add and Remove a Mac book from Cart",
  "description": "",
  "id": "laptops-and-notepads-features;add-and-remove-a-mac-book-from-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@LaptopsAddRemoveTest"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User click on MacBook item",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User click add to Cart Macbutton",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User should see a message ‘Success: You have added MacBook to your shopping cart!’",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User should see item Mac showed in the cart",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User click on cart option",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User click on red X button to remove the item from cart",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Item should be removed and cart should show zero items",
  "keyword": "Then "
});
formatter.match({
  "location": "LaptopsStepDef.user_click_on_MacBook_item()"
});
formatter.result({
  "duration": 2320625500,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsStepDef.user_click_add_to_Cart_Macbutton()"
});
formatter.result({
  "duration": 293285800,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsStepDef.User_should_see_a_message_Success_You_have_added_MacBook_to_your_shopping_cart()"
});
formatter.result({
  "duration": 249864000,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsStepDef.user_should_see_item_Mac_showed_in_the_cart()"
});
formatter.result({
  "duration": 4312512400,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsStepDef.user_click_on_cart_option()"
});
formatter.result({
  "duration": 228397700,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsStepDef.user_click_on_red_X_button_to_remove_the_item_from_cart()"
});
formatter.result({
  "duration": 216467300,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsStepDef.item_should_be_removed_and_cart_should_show_zero_items()"
});
formatter.result({
  "duration": 219395500,
  "status": "passed"
});
formatter.after({
  "duration": 4730944000,
  "status": "passed"
});
formatter.before({
  "duration": 1353878900,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on Retail Website2",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User click on Laptop \u0026NoteBook tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User click on Show all Laptop \u0026NoteBook option",
  "keyword": "And "
});
formatter.match({
  "location": "LaptopsStepDef.user_is_on_Retail_websites()"
});
formatter.result({
  "duration": 1961559400,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsStepDef.user_click_on_Laptop_NoteBook_tab()"
});
formatter.result({
  "duration": 359845100,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsStepDef.user_click_on_Show_all_Laptop_NoteBook_option()"
});
formatter.result({
  "duration": 592629900,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Product Comparison",
  "description": "",
  "id": "laptops-and-notepads-features;product-comparison",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@LaptopsComparisonTest"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "User click on product comparison icon on ‘MacBook’",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User click on product comparison icon on ‘MacBook Air’",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User should see a message ‘Success: You have added MacBook Air to your product comparison!",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "User click on Product comparison link",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User should see Product Comparison Chart",
  "keyword": "Then "
});
formatter.match({
  "location": "LaptopsStepDef.user_click_on_product_comparison_icon_on_MacBook()"
});
formatter.result({
  "duration": 345272500,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsStepDef.user_click_on_product_comparison_icon_on_MacBook_Air()"
});
formatter.result({
  "duration": 337410100,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsStepDef.user_should_see_a_message_Success_You_have_added_MacBook_Air_to_your_product_comparison()"
});
formatter.result({
  "duration": 228055500,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsStepDef.user_click_on_Product_comparison_link()"
});
formatter.result({
  "duration": 487327600,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsStepDef.user_should_see_Product_Comparison_Chart()"
});
formatter.result({
  "duration": 182830800,
  "status": "passed"
});
formatter.after({
  "duration": 641142600,
  "status": "passed"
});
formatter.before({
  "duration": 1290301200,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on Retail Website2",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User click on Laptop \u0026NoteBook tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User click on Show all Laptop \u0026NoteBook option",
  "keyword": "And "
});
formatter.match({
  "location": "LaptopsStepDef.user_is_on_Retail_websites()"
});
formatter.result({
  "duration": 1790387300,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsStepDef.user_click_on_Laptop_NoteBook_tab()"
});
formatter.result({
  "duration": 372596500,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsStepDef.user_click_on_Show_all_Laptop_NoteBook_option()"
});
formatter.result({
  "duration": 1057922400,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Adding an item to Wish list",
  "description": "",
  "id": "laptops-and-notepads-features;adding-an-item-to-wish-list",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@LaptopsWishList"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "User click on heart icon to add ‘Sony VaIO’ laptop to wish list",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’",
  "keyword": "Then "
});
formatter.match({
  "location": "LaptopsStepDef.user_click_on_heart_icon_to_add_Sony_VaIO_laptop_to_wish_list()"
});
formatter.result({
  "duration": 279757800,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsStepDef.user_get_a_message()"
});
formatter.result({
  "duration": 263834800,
  "status": "passed"
});
formatter.after({
  "duration": 652698500,
  "status": "passed"
});
formatter.before({
  "duration": 1316825200,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on Retail Website2",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User click on Laptop \u0026NoteBook tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User click on Show all Laptop \u0026NoteBook option",
  "keyword": "And "
});
formatter.match({
  "location": "LaptopsStepDef.user_is_on_Retail_websites()"
});
formatter.result({
  "duration": 1666072900,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsStepDef.user_click_on_Laptop_NoteBook_tab()"
});
formatter.result({
  "duration": 355854000,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsStepDef.user_click_on_Show_all_Laptop_NoteBook_option()"
});
formatter.result({
  "duration": 521474500,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "Validate the price of MacBook Pro is 2000",
  "description": "",
  "id": "laptops-and-notepads-features;validate-the-price-of-macbook-pro-is-2000",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 36,
      "name": "@LaptopsPriceTest"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "User click on ‘MacBook Pro’ item",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "User should see price tag \"$2,000.00\" is present on UI",
  "keyword": "Then "
});
formatter.match({
  "location": "LaptopsStepDef.user_click_on_MacBook_Pro_item()"
});
formatter.result({
  "duration": 1240671700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$2,000.00",
      "offset": 27
    }
  ],
  "location": "LaptopsStepDef.User_should_see__price_tag_is_present_on_UI(String)"
});
formatter.result({
  "duration": 237983100,
  "status": "passed"
});
formatter.after({
  "duration": 4723943900,
  "status": "passed"
});
});