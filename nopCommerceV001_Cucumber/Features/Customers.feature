Feature: Customers


Background: Below are the common steps for the each scenarios

    Given user launch chrome browser
	When user open URL "https://admin-demo.nopcommerce.com/login"
	And user enters EmailId as "admin@yourstore.com" and password as "admin"
	And click on login
	Then user can view Dashboard
	When user click on customers Menu
	And click on customer Menu Items


Scenario: Add new Customers

    And click on add new button
	Then user can view add new customer page "Add a new customer / nopCommerce administration"
	When user enter customer info
	And click on save button
	Then user can view confirmation message "The new customer has been added successfully"
	And close browser
	
Scenario: Search customer by EmailID
	
	And Enter customer EMail
	When Click on search button
	Then User should found Email in the Search table
	And close browser
	
Scenario: Search customer based on FirstNAme and LastName

	And Enter customer FirstName
	And Enter customer LastName
	When Click on search button
	Then User should found Name in the Search table
	And close browser
