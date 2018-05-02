$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Invalid_LogIn.feature");
formatter.feature({
  "line": 1,
  "name": "InValid Login Action",
  "description": "",
  "id": "invalid-login-action",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User Enter Invalid email id",
  "description": "",
  "id": "invalid-login-action;user-enter-invalid-email-id",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User hits the valid url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enter invalid email id",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Message displayed as invalid email id",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_InvalidEmail.user_hits_the_valid_url()"
});
formatter.result({
  "duration": 31274546799,
  "status": "passed"
});
formatter.match({
  "location": "Test_InvalidEmail.user_enter_invalid_email_id()"
});
formatter.result({
  "duration": 24524886895,
  "status": "passed"
});
formatter.match({
  "location": "Test_InvalidEmail.message_displayed_as_invalid_email_id()"
});
formatter.result({
  "duration": 1411340412,
  "status": "passed"
});
formatter.uri("LogOut.feature");
formatter.feature({
  "line": 1,
  "name": "Application LogOut",
  "description": "",
  "id": "application-logout",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User LogOut of Application",
  "description": "",
  "id": "application-logout;user-logout-of-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is logged into application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User click on LogOut button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User is logged out of application",
  "keyword": "Then "
});
formatter.match({
  "location": "LogOut.user_is_logged_into_application()"
});
formatter.result({
  "duration": 35232549267,
  "status": "passed"
});
formatter.match({
  "location": "LogOut.user_click_on_LogOut_button()"
});
formatter.result({
  "duration": 2293855957,
  "status": "passed"
});
formatter.match({
  "location": "LogOut.user_is_logged_out_of_application()"
});
formatter.result({
  "duration": 676312015,
  "status": "passed"
});
formatter.uri("Sorting_price.feature");
formatter.feature({
  "line": 1,
  "name": "Sorting dress by price",
  "description": "",
  "id": "sorting-dress-by-price",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Sorting dresses by price",
  "description": "",
  "id": "sorting-dress-by-price;sorting-dresses-by-price",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User performs successful login",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Navigates to summer dresses page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User clicks on sort by price button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "dress should be sorted in ascending order of price",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_PriceSorting.user_is_logged_into_application()"
});
formatter.result({
  "duration": 39711302506,
  "status": "passed"
});
formatter.match({
  "location": "Test_PriceSorting.user_Navigates_to_summer_dresses_page()"
});
formatter.result({
  "duration": 9432818143,
  "status": "passed"
});
formatter.match({
  "location": "Test_PriceSorting.user_clicks_on_sort_by_price_button()"
});
formatter.result({
  "duration": 183208700,
  "status": "passed"
});
formatter.match({
  "location": "Test_PriceSorting.dress_should_be_sorted_in_ascending_order_of_price()"
});
formatter.result({
  "duration": 698876905,
  "status": "passed"
});
formatter.uri("Valid_LogIn.feature");
formatter.feature({
  "line": 2,
  "name": "Valid Login Action",
  "description": "",
  "id": "valid-login-action",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@loginTest"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Successful account creation with valid email",
  "description": "",
  "id": "valid-login-action;successful-account-creation-with-valid-email",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User create a new account with valid email",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Navigate to enter email text box",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User clicks on create account button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User fills in Account registration form",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Account gets created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_ValidLogin.user_create_a_new_account_with_valid_email()"
});
formatter.result({
  "duration": 14920724022,
  "status": "passed"
});
formatter.match({
  "location": "Test_ValidLogin.user_Navigate_to_enter_email_text_box()"
});
formatter.result({
  "duration": 15858279714,
  "status": "passed"
});
formatter.match({
  "location": "Test_ValidLogin.user_clicks_on_create_account_button()"
});
formatter.result({
  "duration": 135293746,
  "status": "passed"
});
formatter.match({
  "location": "Test_ValidLogin.user_fills_in_Account_registration_form()"
});
formatter.result({
  "duration": 4945990807,
  "status": "passed"
});
formatter.match({
  "location": "Test_ValidLogin.account_gets_created_successfully()"
});
formatter.result({
  "duration": 2871307970,
  "status": "passed"
});
});