@All
Feature: Uber Booking Feature

@Smoke
Scenario: Booking Cab Sedan
Given USer wants to select  a car type "sedan" from uber app
When user select car "sedan" and pick up point "Bangalore" and drop location "Pune"
Then Driver starts the journey
And Driver ends the jounery
Then User pays 1000 USD 

@Regression
Scenario: Booking Cab SUV
Given USer wants to select  a car type "suv" from uber app
When user select car "SUV" and pick up point "Mysore" and drop location "Bangalore"
Then Driver starts the journey
And Driver ends the jounery
Then User pays 1000 USD

@Prod
Scenario: Booking Cab Mini
Given USer wants to select  a car type "mini" from uber app
When user select car "Mini" and pick up point "Pune" and drop location "Mumbai"
Then Driver starts the journey
And Driver ends the jounery
Then User pays 1000 USD