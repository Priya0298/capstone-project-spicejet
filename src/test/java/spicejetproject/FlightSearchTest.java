package spicejetproject;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlightSearchTest extends TestBase {

	
	@Test
	public void searchOneWayFlight() {
	    WebDriver driver = getDriver();
	    
	   // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	 
	    // Find and click on the one way button
		WebElement oneWayButton = driver.findElement(By.xpath("(//*[@id=\"main-container\"]/div/div[1]//div[1]/div)[13]"));
		js.executeScript("arguments[0].click();", oneWayButton);
	   
	    // Find and populate the origin and destination fields
	    WebElement originField = driver.findElement(By.xpath("//div[text()='From']"));
	    originField.sendKeys("DEL");

	    WebElement destinationField = driver.findElement(By.xpath("//div[text()='To']"));
	    destinationField.sendKeys("MAA");

	    
	     WebElement departureDateField = driver.findElement(By.xpath("//div[text()='Departure Date']"));
	     js.executeScript("arguments[0].value='2024-06-05';", departureDateField);
	 
        // WebElement returnDateField = driver.findElement(By.xpath(" //div[text()='Return Date']"));
         //js.executeScript("arguments[0].value='2024-06-08';", returnDateField);

	    // Find and populate the passenger field
	    WebElement passengerField = driver.findElement(By.xpath("//div[text()='1 Adult']"));
	    js.executeScript("arguments[0].value='1';", passengerField);

	    // Find and populate the currency field
	    WebElement currencyField = driver.findElement(By.xpath("//div[text()='Currency']"));
	    js.executeScript("arguments[0].value='INR';", currencyField);
	    
	    WebElement selectOptionField = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div/div[1])[46]"));
	    js.executeScript("arguments[0].click();", selectOptionField);
	    
	    WebElement chooseOptionField = driver.findElement(By.cssSelector("div[data-focusable=\"true\"]:nth-of-type(1) div[dir=\"auto\"]"));
	    js.executeScript("arguments[0].click(),value='Family & Friends';", chooseOptionField);
	   
	    
	    // Wait for search results to be displayed
	    WebElement searchResults = driver.findElement(By.xpath("//div[text()='Search Flight']"));
	    js.executeScript("arguments[0].value='1';", searchResults);

	    // Assert that search results are displayed
	    Assert.assertTrue(searchResults.isDisplayed(), "Search results not displayed");
	}
	
	@Test
	public void searchRoundTripFlight() {
		 WebDriver driver = getDriver();
		 
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    JavascriptExecutor js = (JavascriptExecutor) driver;	  
		    
		    // Find and click on the one way button
		    WebElement roundTripButton = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div[2]/div)[4]"));
		    js.executeScript("arguments[0].click();", roundTripButton);

		    // Find and populate the origin and destination fields
		    WebElement originField = driver.findElement(By.xpath("//div[text()='From']"));
		    originField.sendKeys("MAA");

		    WebElement destinationField = driver.findElement(By.xpath("//div[text()='To']"));
		    destinationField.sendKeys("DMM");
    
		     WebElement departureDateField = driver.findElement(By.xpath("//div[text()='Departure Date']"));
		     js.executeScript("arguments[0].value='2024-06-10';", departureDateField);
		 
	         WebElement returnDateField = driver.findElement(By.xpath(" //div[text()='Return Date']"));
	         js.executeScript("arguments[0].value='2024-06-15';", returnDateField);

		    // Find and populate the passenger field
		    WebElement passengerField = driver.findElement(By.xpath("//div[text()='1 Adult']"));
		    js.executeScript("arguments[0].value='2';", passengerField);

		    // Find and populate the currency field
		    WebElement currencyField = driver.findElement(By.xpath("//div[text()='Currency']"));
		    js.executeScript("arguments[0].value='USD';", currencyField);
		    
		    WebElement selectOptionField = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div/div[1])[46]"));
		    js.executeScript("arguments[0].click();", selectOptionField);
		    
		    WebElement chooseOptionField = driver.findElement(By.cssSelector("div[data-focusable=\"true\"]:nth-of-type(1) div[dir=\"auto\"]"));
		    js.executeScript("arguments[0].click(),value='Family & Friends';", chooseOptionField);
		   
		    
		    // Wait for search results to be displayed
		    WebElement searchResults = driver.findElement(By.xpath("//div[text()='Search Flight']"));
		    js.executeScript("arguments[0].value='1';", searchResults);

		    // Assert that search results are displayed
		    Assert.assertTrue(searchResults.isDisplayed(), "Search results not displayed");
		

	
	
	}
	}
