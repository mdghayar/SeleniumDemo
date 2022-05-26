package stepDefs;

import java.io.File;
import java.io.IOException;

import org.apache.maven.surefire.shared.io.FileUtils;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.Scenario;

//import com.aventstack.extentreports.gherkin.model.Scenario;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglePageStepDef {
	WebDriver driver;
	
	@Given("User is on Google Page")
	public void user_is_on_google_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

	@When("User search Java tutorial")
	public void user_search_java_tutorial() {
	   WebElement search = driver.findElement(By.name("q"));
	   search.sendKeys("Java Tutorial");
	   search.submit();
	}

	@Then("Should dispaly Java Search Result Page")
	public void should_display_java_search_result_page() {
	   String strTitle = driver.getTitle();
	   Assert.assertEquals("Java Tutorial - Google Search", strTitle);
	}
	
	@When("User search Selenium tutorial")
	public void user_search_selenium_tutorial() {
	   WebElement search = driver.findElement(By.name("q"));
	   search.sendKeys("Selenium Tutorial");
	   search.submit();
	}

	@Then("Should dispaly Selenium Search Result Page")
	public void should_display_selenium_search_result_page() {
	   String strTitle = driver.getTitle();
	   Assert.assertEquals("Selenium Tutorial - Google Search", strTitle);
	}
	
	@After
	public void generateScreenshot(Scenario scenario) throws IOException {
		if(scenario.isFailed() ) { 
			TakesScreenshot screen = (TakesScreenshot)driver;
			File file = screen.getScreenshotAs(OutputType.FILE);
			byte[] imgByte = FileUtils.readFileToByteArray(file);
			scenario.attach(imgByte, "image/png", "image1");
			
		}
	}
	

}
