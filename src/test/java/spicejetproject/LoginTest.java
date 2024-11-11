package spicejetproject;

import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test 
    public void loginwithDummycredentials() {
        WebDriver driver = getDriver();

        // Explicit wait instance
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Increased to 20 seconds

       

        try {
            // Wait for the "Login" button and click it
            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Login']")));
            System.out.println("Login button found: " + loginButton.isDisplayed());
            loginButton.click();

            // Wait for the "Email" field label and click it
            WebElement emailFieldLabel = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Email']")));
            System.out.println("Email field label found: " + emailFieldLabel.isDisplayed());
            emailFieldLabel.click();

            // Wait for the email and password input fields
            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));
            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
            System.out.println("Email field and password field found: " + emailField.isDisplayed() + ", " + passwordField.isDisplayed());
    
        
            // Enter credentials and click the login button
            emailField.sendKeys("joncena@987gmail.com");
            passwordField.sendKeys("YouKnowMe@456");
          
            WebElement secondLoginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div[2]/div[7]")));
            System.out.println("Second Log In button found: " + secondLoginButton.isDisplayed());

            // Use JavaScript to click the second login button
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            jsExecutor.executeScript("arguments[0].click();", secondLoginButton);
   
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
            Assert.fail("Test failed due to exception: " + e.getMessage());
        }
    }
}