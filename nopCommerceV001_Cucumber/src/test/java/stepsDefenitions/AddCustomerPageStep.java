package stepsDefenitions;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;

public class AddCustomerPageStep extends BaseClass{
	
	
	
	  @Then("user can view Dashboard") public void user_can_view_Dashboard() throws
	  InterruptedException { 
	  Thread.sleep(3000); 
	  
	  addCus=new AddCustomerPage(driver);
	  Assert.assertEquals("Dashboard / nopCommerce administration",addCus.getPageTitle()); 
	  }
	 

	@When("user click on customers Menu")
	public void user_click_on_customers_Menu() throws InterruptedException {
		addCus=new AddCustomerPage(driver);
		addCus.clickOnCustomerMenu();
	   
	}

	@When("click on customer Menu Items")
	public void click_on_customer_Menu_Items() throws InterruptedException {
		Thread.sleep(3000);
		addCus.clickOnCustomerMenuItems();
	   
	}

	@When("click on add new button")
	public void click_on_add_new_button() throws InterruptedException {
		addCus.clickOnAddNew();
		Thread.sleep(3000);
	    
	}

	@Then("user can view add new customer page {string}")
	public void user_can_view_add_new_customer_page(String pageTitle) {
		
		Assert.assertEquals(pageTitle,addCus.getPageTitle());
	    
	}

	@When("user enter customer info")
	public void user_enter_customer_info() throws InterruptedException {
		String email=randomstring()+"@gmail.com";
		addCus.setEmail(email);
		
		addCus.setPass("Sapp@123");
		
		addCus.setFirstName("shankar");
		addCus.setLastName("GoitITT");
		
		addCus.setGender("male");
		
		addCus.setDob("07-01-1991");
		
		addCus.setCompanyName("TKD");
		
		addCus.setCustomerRoles("Registered");
		Thread.sleep(3000);
		
		addCus.setManagerOfVendor("Vendor 1");
		addCus.setAdminContent("This is the admin Comment");
	   
	}

	@When("click on save button")
	public void click_on_save_button() throws InterruptedException {
	   
		addCus.clickOnSave();
		Thread.sleep(3000);
	}

	@Then("user can view confirmation message {string}")
	public void user_can_view_confirmation_message(String msg) {
		
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new customer has been added successfully"));
	   
		
	}
	
	
	
	
	//Search Customer based on Email ID
	
	
	  @When("Enter customer EMail") 
	  public void enter_customer_EMail() {
		  
		  searchCus=new SearchCustomerPage(driver);
		  searchCus.setEmail("victoria_victoria@nopCommerce.com");
		  
	  
	  }
	  
	  @When("Click on search button") 
	  public void click_on_search_button() throws InterruptedException {
	  
		  searchCus.clickSearch();
		  Thread.sleep(3000);
	  }
	  
	  @Then("User should found Email in the Search table") 
	  public void user_should_found_Email_in_the_Search_table() {
		  
		  boolean status=searchCus.searchCustomerByEmail("victoria_victoria@nopCommerce.com");
		  Assert.assertEquals(true,status); 
	  
	  }
	 
	  
	  //Search Customer based on FirstName and LastName
	  
	  @When("Enter customer FirstName")
		public void enter_customer_FirstName() {
			
			
			searchCus=new SearchCustomerPage(driver);
			searchCus.setFirstName("Victoria");
		}

		@When("Enter customer LastName")
		public void enter_customer_LastName() {
			searchCus.setLastName("Terces");
		}

		@Then("User should found Name in the Search table")
		public void user_should_found_Name_in_the_Search_table() {
			boolean status=searchCus.searchCustomerByName("Victoria Terces");
			Assert.assertEquals(true, status);
		}


}
