package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage 
{

	public WebDriver ldriver;
	
	public  AddCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		
	}
		
		By lnkCustomers_Menu=By.xpath("//a[@href='#']//span[contains(text(),'Customers')]");
		By lnkCustomers_MenuItems=By.xpath("//span[@class='menu-item-title'][contains(text(),'Customers')]");
		By btnAddNew=By.xpath("//a[@class='btn bg-blue']");
		
		By txtEmail=By.xpath("//input[@id='Email']");
		By txtPassword=By.xpath("//input[@id='Password']");
		
		By txtFirstName=By.id("FirstName");
		
		By txtLastName=By.id("LastName");
		
		By rdMaleGender=By.xpath("//input[@id='Gender_Male']");
		By rdFemaleGender=By.xpath("//input[@id='Gender_Female']");
		
		By txtCustomerRolse=By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']");
		
		By lstitemAdministrator=By.xpath("//li[contains(text(),'Administrators')]");
		
		By lstitemsRegistered=By.xpath("//li[contains(text(),'Registered')]");
		
		By lstitemsGuest=By.xpath("//li[contains(text(),'Guests')]");
		
		By lstitemsVendor=By.xpath("//li[contains(text(),'Vendors')]");
		
		By drpmgrOfVendor=By.xpath("//select[@id='VendorId']");
		
		By txtDOB=By.xpath("//input[@id='DateOfBirth']");
		
		By txtCompany=By.xpath("//input[@id='Company']");
		
		By txtAdminComment=By.xpath("//textarea[@id='AdminComment']");
		
		By btnSave=By.xpath("//button[@name='save']");
		
		//Actions Methods
		
		public String getPageTitle()
		{
			return ldriver.getTitle();
		}
		
		public void clickOnCustomerMenu()
		{
			ldriver.findElement(lnkCustomers_Menu).click();
		}
		
		public void clickOnCustomerMenuItems()
		{
			ldriver.findElement(lnkCustomers_MenuItems).click();
		}
		
		public void clickOnAddNew()
		{
			ldriver.findElement(btnAddNew).click();
		}
		
		public void setEmail(String email)
		{
			ldriver.findElement(txtEmail).sendKeys(email);
		}
		
		public void setPass(String pass)
		{
			ldriver.findElement(txtPassword).sendKeys(pass);
		}
		
		public void setCustomerRoles(String role) throws InterruptedException 
		{
			if(!role.equals("Vendors")) //If role is vendors should not delete Register as per req.
			{
			ldriver.findElement(By.xpath("//*[@id=\"SelectedCustomerRoleIds_taglist\"]/li/span[2]")).click();
			}
			
			ldriver.findElement(txtCustomerRolse).click();
						
			WebElement listitem;
			
			Thread.sleep(3000);
						
			if(role.equals("Administrators"))
			{
				listitem=ldriver.findElement(lstitemAdministrator); 
			}
			else if(role.equals("Guests"))
			{
				listitem=ldriver.findElement(lstitemsGuest);
			}
			else if(role.equals("Registered"))
			{
				listitem=ldriver.findElement(lstitemsRegistered);
			}
			else if(role.equals("Vendors"))
			{
				listitem=ldriver.findElement(lstitemsVendor);
			}
			else
			{
				listitem=ldriver.findElement(lstitemsGuest);
			}
						
			//listitem.click();
			//Thread.sleep(3000);
			
			JavascriptExecutor js = (JavascriptExecutor)ldriver;
			js.executeScript("arguments[0].click();", listitem);
			
	}

	public void setManagerOfVendor(String value)
	{
		Select drp=new Select(ldriver.findElement(drpmgrOfVendor));
		drp.selectByVisibleText(value);
	}
	
	public void setGender(String gender)
	{
		if(gender.equalsIgnoreCase("Male"))
		{
			ldriver.findElement(rdMaleGender).click();
		}
		else if(gender.equalsIgnoreCase("Female"))
		{
			ldriver.findElement(rdFemaleGender).click();
		}
		else
		{
			ldriver.findElement(rdMaleGender).click();//Default
		}
		
	}
	
	public void setFirstName(String fname)
	{
		ldriver.findElement(txtFirstName).sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		ldriver.findElement(txtLastName).sendKeys(lname);
	}
	
	public void setDob(String dob)
	{
		ldriver.findElement(txtDOB).sendKeys(dob);
	}
	
	public void setCompanyName(String comname)
	{
		ldriver.findElement(txtCompany).sendKeys(comname);
	}
	
	public void setAdminContent(String content)
	{
		ldriver.findElement(txtAdminComment).sendKeys(content);
	}
	
	public void clickOnSave()
	{
		ldriver.findElement(btnSave).click();
	}
		
		
		
}
