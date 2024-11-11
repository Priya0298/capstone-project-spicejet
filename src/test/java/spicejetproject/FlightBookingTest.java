package spicejetproject;

import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FlightBookingTest extends TestBase {

    @Test 
    public void selectFlightAndProceedToBooking() {
        WebDriver driver = getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement originField = driver.findElement(By.xpath("//div[text()='From']"));
	    originField.sendKeys("DEL");

	    WebElement destinationField = driver.findElement(By.xpath("//div[text()='To']"));
	    destinationField.sendKeys("MAA");
    
	     WebElement departureDateField = driver.findElement(By.xpath("//div[text()='Departure Date']"));
	     js.executeScript("arguments[0].value='2024-06-05';", departureDateField);
	 
	    // Find and populate the passenger field
	    WebElement passengerField = driver.findElement(By.xpath("//div[text()='1 Adult']"));
	    js.executeScript("arguments[0].value='1';", passengerField);

	    // Find and populate the currency field
	    WebElement currencyField = driver.findElement(By.xpath("//div[text()='Currency']"));
	    js.executeScript("arguments[0].value='INR';", currencyField);
	  
	    // Wait for search results to be displayed
	    WebElement searchResults = driver.findElement(By.xpath("//div[text()='Search Flight']"));
	    js.executeScript("arguments[0].value='1';", searchResults);
	    
	    WebElement travellField = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div/div[2])[61]"));
	    js.executeScript("arguments[0].click();", travellField);
	    

	   
    }
}