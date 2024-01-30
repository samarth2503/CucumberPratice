Feature: Order Page
	In order to check my order details
	As a registered user
	I want to specify the features of order detiails page
	
	Background:
		Given a registered usr exists
		Given user is on Amazon login page
		When user enters username
		And user enters password
		And user clicks on login button
		Then user navigates to order page
		
	Scenario: Check Previous Order Details
		When user click on Order link
		Then user checks the previous order details
		
	Scenario: Check Open Order Details
		When user click on Open orders link
		Then user checks the open order details
		
	Scenario: Check Cancelled Order details
		When user clicks on Cancelled Orders link
		Then user checks the cancelled order details
	
