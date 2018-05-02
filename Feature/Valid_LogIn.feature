Feature: Valid Login Action

Scenario: Successful account creation with valid email
	Given User create a new account with valid email
	When User Navigate to enter email text box
	And User clicks on create account button
	And User fills in Account registration form
	Then Account gets created successfully

