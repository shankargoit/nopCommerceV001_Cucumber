package stepsDefenitions;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class LoginPageSteps extends BaseClass
{


		@Given("user launch chrome browser")
		public void user_launch_chrome_browser() throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		   driver=new ChromeDriver();
		   
		 //Logger
			logger=Logger.getLogger("nopComemrce"); //Added logger
			PropertyConfigurator.configure("Log4j.properties");//Added logger
		   
		  lp=new LoginPage(driver);
		  logger.info("----------------Launching the Browser");
		}

		@When("user open URL {string}")
		public void user_open_URL(String url) {
			driver.get(url);
			logger.info("----------------Opening the URL");
		}

		@When("user enters EmailId as {string} and password as {string}")
		public void user_enters_EmailId_as_and_password_as(String email, String password) {
		   lp.setUserName(email); 
		   logger.info("------------Providing the Username----------------");
		   
		   lp.setPassword(password);
		   logger.info("------------Providing the Password----------------");
		}

		@When("click on login")
		public void click_on_login() {
			logger.info("------------Clicking on Login Button----------------");
		    lp.clickLogin();
		   
		}

		@Then("page title should be {string}")
		public void page_title_should_be(String pageTitle) {
		    
			if(driver.getPageSource().contains("Login was unsuccessful"))
			{
				driver.close();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertEquals(pageTitle,driver.getTitle());
			}
			
		}

		@When("user click on logout link")
		public void user_click_on_logout_link() throws InterruptedException {
		    lp.clickLogOut();
		    //Thread.sleep(3000);
		    logger.info("------------clicking on logout button----------------");
		}

		@Then("close browser")
		public void close_browser() {
		    
			driver.close();
			
			logger.info("------------closing the browser----------------");
			
		}
	
}
