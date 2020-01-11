package testRunner;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.cucumber.java.Before;
import stepsDefenitions.BaseClass;

public class TestRunnerHooksClass extends BaseClass {
	
	@Before
	public void setup() throws IOException
	{
		//Logger
		logger=Logger.getLogger("nopComemrce"); //Added logger
		PropertyConfigurator.configure("Log4j.properties");//Added logger
		
		//Reading properties
		prop=new Properties();
		FileInputStream configPropfile=new FileInputStream("config.properties");
		prop.load(configPropfile);
		
		String br=prop.getProperty("browser");
		
		if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",prop.getProperty("chromepath"));
		//driver=new ChromeDriver();
		}
		else if (br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",prop.getProperty("firefoxpath"));
			driver = new FirefoxDriver();
		}
		else if (br.equals("ie")) {
			System.setProperty("webdriver.ie.driver",prop.getProperty("iepath"));
			driver = new InternetExplorerDriver();
		}
		
		logger.info("******** Launching browser*********");
	}

}
