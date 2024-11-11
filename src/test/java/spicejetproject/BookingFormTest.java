package spicejetproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BookingFormTest extends TestBase {

	@Test 
	public void fillBookingFromAndSubmit() throws InterruptedException {
		
		WebDriver driver = getDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 JavascriptExecutor js = (JavascriptExecutor) driver;

		 
		WebElement travellField = driver.findElement(By.xpath("(//*[@id='main-container']//span)[1]"));
	   js.executeScript("arguments[0].click();", travellField);
		    
		WebElement titleField = driver.findElement(By.xpath("(//*[@id='main-container']//div/span)[1]"));
		js.executeScript("arguments[0].value='MR';", titleField);
		WebElement passengerFirstNameField = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//input)[1]"));
		js.executeScript("arguments[0].value='John';", passengerFirstNameField);
		WebElement passengerLastNameField = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//input)[2]"));
		js.executeScript("arguments[0].value='Cena';", passengerLastNameField);
		WebElement passengerEmailField = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div)[6]"));
		js.executeScript("arguments[0].value='johncena@987gmai.com';", passengerEmailField);
		WebElement countrycodeField = driver.findElement(By.xpath("//*[@id=\"main-container\"]//div[7]/div[1]"));
		js.executeScript("arguments[0].value='+91';", countrycodeField);
		WebElement passengerMobilenNumberField = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div[2]/div)[11]"));
		 js.executeScript("arguments[0].value='8220153146';", passengerMobilenNumberField);
		WebElement editTravellerField = driver.findElement(By.xpath("//*[@id=\"main-container\"]//a/div"));
		 js.executeScript("arguments[0].click();", editTravellerField);
		WebElement primTravellField = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//span)[1]"));
		 js.executeScript("arguments[0].click();", primTravellField);
		WebElement doneField = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div[2])[26]"));
		js.executeScript("arguments[0].click();", doneField);
		WebElement submitButton = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div)[94]"));
		js.executeScript("arguments[0].click();",submitButton);
		WebElement paymentField = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div/div[3])[17]"));
		js.executeScript("arguments[0].click();", paymentField);
		
		
	}


	}