Feature: Amazon Search

Scenario: Serach a Product
Given I have a search field on Amazon page
When I search for a product with name "Apple Macbook Pro" and price 1000
Then Product with name "Apple Macbook Pro" should be displayed

#Scenario: Serach a Product Iphone
#Given I have a serach feild on Amazon Page
#When I serach for a product with name "Iphone" and price 1200
#Then Product with name "Iphone" should be displayed
#Then Order id is 12345 and username is "Naveen"