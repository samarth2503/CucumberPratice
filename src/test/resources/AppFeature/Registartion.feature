Feature: User Registartion

Scenario: User Registrtaion with different data
	Given User is on registration page
	When User enters following user details
		| naveen | automation | nav@gmail.com | 9999 | Banaglore |
		| tom | peter | tom@gmail.com | 8888 | London |
		| lisa | dsouza | lisa@gmail.com | 7777 | Bihar |
	Then USer registration should be successful
	
Scenario: User Registrtaion with different data with columns
	Given User is on registration page
	When User enters following user details with columns
		| firstname | lastname | email | phoneno | city |
		| naveen | automation | nav@gmail.com | 9999 | Banaglore |
		| tom | peter | tom@gmail.com | 8888 | London |
		| lisa | dsouza | lisa@gmail.com | 7777 | Bihar |
	Then USer registration should be successful