Feature: Verifing the adactin web page

Scenario Outline: Verify the login with valid credentials
Given User is on adactin page
When user enters "<username>" and "<password>"
And user clicks login button
Then user verify the success message

Examples:
|username|password|
|abooneosoft|Aboo@1234|

Scenario Outline: Verify the Search Hotel page
When user select "<location>" and "<hotels>" and "<room type>" and "<number of rooms>" and "<adults per room>" and "<children per room>"
And user click search button

Examples:
|location|hotels|room type|number of rooms|adults per room|children per room|
|Sydney|Hotel Creek|Standard|1-One|1-One|1-One|

Scenario: verify the Select Hotel page
When user select the hotel
And user click the continue button

Scenario Outline: verify the search hotel page
When user enter "<first name>" and "<last name>" and "<billing address>" and "<credit card no>" and "<credit card type>" and "<select month>" and "<select year>" and "<cvv number>"
And user click booknow button

Examples:
|first name|last name|billing address|credit card no|credit card type|select month|select year|cvv number|
|aboobacker|siddiq|kodungaiyur, chennai|1234567891234567|VISA|January|2023|123|

Scenario: verify the confirmation page
When user click search hotel

