package runner.com;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import base.com.BaseClass_MostlyUsed;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Dell\\eclipse-workspace\\Maven_Concept_Task\\Features\\login.feature", glue = "stepdefinition", plugin = "json:target/cucumber-report.json")
public class Cucumber_run extends BaseClass_MostlyUsed {
	public static WebDriver driver;
	@BeforeClass
	public static void setup() {
		
		webpage();
	}

	@AfterClass
	public static void teardown() {
		
		exit();
	}
}
