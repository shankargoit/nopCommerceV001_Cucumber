Feature: Login

Scenario: Successful login with valid credentials

	Given user launch chrome browser
	When user open URL "https://admin-demo.nopcommerce.com/login"
	And user enters EmailId as "admin@yourstore.com" and password as "admin"
	And click on login
	Then page title should be "Dashboard / nopCommerce administration"
	When user click on logout link
	Then page title should be "Your store. Login"
	And close browser
	
@regression
Scenario Outline: Login DataDriven validation

	Given user launch chrome browser
	When user open URL "https://admin-demo.nopcommerce.com/login"
	And user enters EmailId as "<email>" and password as "<password>"
	And click on login
	Then page title should be "Dashboard / nopCommerce administration"
	When user click on logout link
	Then page title should be "Your store. Login"
	And close browser
	
	Examples:
	
		|email| password|
		|admin@yourstore.com|admin|
		|admin@123|admin123|
		|admin@sapp|admin|
		|admin@yourstore.com|admin|
