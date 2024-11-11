package spicejetproject;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.TestBase;

public class BookignPageValidationTest extends TestBase {

	@Test 
	public void validateBookingPageFields() {
		
		WebDriver driver = getDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 JavascriptExecutor js = (JavascriptExecutor) driver;
        //FilghtStatus Cheking Field
		WebElement flightStatusField = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//a/div/div[2])[1]"));
		js.executeScript("arguments[0].click();", flightStatusField);
		WebElement depatureDateField = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div[1]/div/div[1]"));
		js.executeScript("arguments[0].value='Today';", depatureDateField);
		WebElement selectOrginField = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[2]/div[1]/div/div[2]/div[1]/div/div"));
		js.executeScript("arguments[0].click(),value='MAA';",  selectOrginField);
		WebElement selectDestinationField = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div[1]/div)[23]"));
		js.executeScript("arguments[0].click(),value='DEL';",  selectDestinationField);
		WebElement selectFlightnoField = driver.findElement(By.xpath("//*[@id=\"main-container\"]//div[2]/input"));
		js.executeScript("arguments[0].value='8947';",  selectFlightnoField);
		WebElement searchFlightField = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div/div[2])[13]"));
		js.executeScript("arguments[0].click();", searchFlightField);
	
		//Web Chenkin Field  Log in Email
		WebElement chenkInField = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div[2]/a)[2]"));
		js.executeScript("arguments[0].click();",  chenkInField);
		WebElement chenkInLoginField = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div/div)[16]"));
		js.executeScript("arguments[0].click();",  chenkInLoginField);
		WebElement accountField = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div[2]/div[3]"));
		js.executeScript("arguments[0].click(),value='Email';",  accountField);
		WebElement enterEmailField = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div/input)[1]"));
		js.executeScript("arguments[0].value='johncena@987gmai.com';",  accountField);
		WebElement passwordField = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div/input)[2]"));
		js.executeScript("arguments[0].value='YouKnowMe@456';",  passwordField);
		WebElement loginField = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div[2]/div[7]/div[2]"));
		js.executeScript("arguments[0].click();",  loginField);
		
		//Web Chenkin Field Log in MobileNumber
		WebElement accountField1 = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div[2])[4]"));
		js.executeScript("arguments[0].click(),value='Mobile Number';",  accountField1);
		WebElement enterMobilenoField = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div/input)[1]"));
		js.executeScript("arguments[0].value='822056241';",  accountField);
		WebElement countryCodeField = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div[2]/div)[6]"));
		js.executeScript("arguments[0].value='+91';",  countryCodeField);
		WebElement passwordField1 = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div/input)[2]"));
		js.executeScript("arguments[0].value='YouKnowMe@456';",  passwordField1);
		WebElement loginField1 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div[2]/div[7]/div[2]"));
		js.executeScript("arguments[0].click();",  loginField1);
	
		// Add Itinerary Field Check in UsingEmail
		WebElement addItineraryField = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div[1]/div/div)[17]"));
		js.executeScript("arguments[0].click();",  addItineraryField);
		WebElement ticketNumberField = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div/input)[1]"));
		js.executeScript("arguments[0].value='OKL018';", ticketNumberField);
		WebElement emailField = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div/input)[2]"));
		js.executeScript("arguments[0].value='joncena@987gmail.com';",  emailField);
		WebElement fetchBookingField = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div[2])[11]"));
		js.executeScript("arguments[0].click();",  fetchBookingField);
		
		// Add Itinerary Field Check in UsingName
		WebElement usingNameField = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div[2]/div)[6]"));
		js.executeScript("arguments[0].click();",  usingNameField);
		WebElement ticketNumberField1 = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div/input)[1]"));
		js.executeScript("arguments[0].value='OKL018';",  ticketNumberField1);
		WebElement lastNameField = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div/input)[2]"));
		js.executeScript("arguments[0].value='Cena';",  lastNameField);
		WebElement fetchBookingField1 = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div[2])[11]"));
		js.executeScript("arguments[0].click();",  fetchBookingField1);
		
		//Boardingpass Login in Email
		WebElement manageBookingField = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//a/div/div[2])[3]"));
		js.executeScript("arguments[0].click();",  manageBookingField );
		WebElement boardingpassLoginField = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div/div)[16]"));
		js.executeScript("arguments[0].click();",  boardingpassLoginField);
		WebElement accountField2 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div[2]/div[3]"));
		js.executeScript("arguments[0].click(),value='Email';",  accountField2);
		WebElement enterEmailField1 = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div/input)[1]"));
		js.executeScript("arguments[0].value='johncena@987gmai.com';",  accountField1);
		WebElement passwordField2 = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div/input)[2]"));
		js.executeScript("arguments[0].value='YouKnowMe@456';",  passwordField2);
		WebElement loginField2 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div[2]/div[7]/div[2]"));
		js.executeScript("arguments[0].click();",  loginField2);
		
		//BoardingPass Login in MobileNumber
		WebElement accountField3 = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div[2])[4]"));
		js.executeScript("arguments[0].click(),value='Mobile Number';",  accountField3);
		WebElement enterMobilenoField1 = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div/input)[1]"));
		js.executeScript("arguments[0].value='822056241';",  enterMobilenoField1);
		WebElement countryCodeField1 = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div[2]/div)[6]"));
		js.executeScript("arguments[0].value='+91';",  countryCodeField1);
		WebElement passwordField3 = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div/input)[2]"));
		js.executeScript("arguments[0].value='YouKnowMe@456';",  passwordField3);
		WebElement loginField3 = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div[2]/div[7]/div[2]"));
		js.executeScript("arguments[0].click();",  loginField3);
		
		//BoardingPass Check in  UsingEmail
		WebElement addItineraryField1 = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div[1]/div/div)[17]"));
		js.executeScript("arguments[0].click();",  addItineraryField1);
		WebElement ticketNumberField2 = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div/input)[1]"));
		js.executeScript("arguments[0].value='OKL018';", ticketNumberField1);
		WebElement emailField1 = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div/input)[2]"));
		js.executeScript("arguments[0].value='joncena@987gmail.com';",  emailField1);
		WebElement fetchBookingField2 = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div[2])[11]"));
		js.executeScript("arguments[0].click();",  fetchBookingField2);
	
		//BoardingPass Check in UsingMobilNumber
		WebElement usingNameField1 = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div[2]/div)[6]"));
		js.executeScript("arguments[0].click();",  usingNameField1);
		WebElement ticketNumberField3 = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div/input)[1]"));
		js.executeScript("arguments[0].value='OKL018';",  ticketNumberField1);
		WebElement lastNameField1 = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div/input)[2]"));
		js.executeScript("arguments[0].value='Cena';",  lastNameField1);
		WebElement fetchBookingField3 = driver.findElement(By.xpath("(//*[@id=\"main-container\"]//div[2])[11]"));
		js.executeScript("arguments[0].click();",  fetchBookingField3);
		
		Assert.assertTrue(chenkInField.isDisplayed());
        Assert.assertTrue(flightStatusField.isDisplayed());
        Assert.assertTrue(manageBookingField.isDisplayed());
	}
	
	
}