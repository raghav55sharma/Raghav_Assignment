Feature: Sorting dress by price

Scenario: Sorting dresses by price
	Given User performs successful login
	When User Navigates to summer dresses page
	And User clicks on sort by price button
	Then dress should be sorted in ascending order of price