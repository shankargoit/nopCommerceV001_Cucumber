package stepsDefenitions;

import java.util.Properties;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;

public class BaseClass {

	public static WebDriver driver;
	public static LoginPage lp;
	public static AddCustomerPage addCus;
	public static SearchCustomerPage searchCus;
	public static Logger logger;
	public static Properties prop;
	
	public static String randomstring()
	{
		String generateString1=RandomStringUtils.randomAlphabetic(5);
		return (generateString1);
	}
}
