package testRunner;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import stepsDefenitions.BaseClass;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//Features",glue = "stepsDefenitions",dryRun = false,monochrome = true,
plugin = {"pretty","html:test-output","json:JsonReport/cucumber.json","junit:junitReport/cucumber.xml"},
tags = {"@regression"})
public class TestRun {

	//TestRunnerHooksClass hook=new TestRunnerHooksClass();
	/*
	 * static { BaseClass.driver=new ChromeDriver(); }
	 */
	
	
}
