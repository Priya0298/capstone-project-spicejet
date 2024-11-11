package spicejetproject;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest extends TestBase {
    @Test
    public void validateSignUpPage()  {
        WebDriver driver = getDriver();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        String originalWindow = driver.getWindowHandle();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        // Click the Signup button which opens a new window
        driver.findElement(By.xpath("//div[text()='Signup']")).click();
        
        // Wait for the new window to open and switch to it
        Set<String> allWindows = driver.getWindowHandles();
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"react-root\"]//div[2]/select"))).sendKeys("MR");
        // Fill out the sign-up form
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first_name"))).sendKeys("Jon");
        driver.findElement(By.id("last_name")).sendKeys("Cena");       
        driver.findElement(By.xpath("//*[@id=\"react-root\"]//div[1]/select")).sendKeys("india");
        driver.findElement(By.id("dobDate")).sendKeys("04/02/1997");  
       
        driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN); 
        driver.findElement(By.xpath("//*[@id='react-root']/div/div/div[2]/div[2]/div/div[1]/div[4]/div[1]/div/div[1]/input")).sendKeys("1234567890");
        driver.findElement(By.id("email_id")).sendKeys("joncena@987gmail.com");
        driver.findElement(By.id("new-password")).sendKeys("YouKnowMe@456");
        driver.findElement(By.id("c-password")).sendKeys("YouKnowMe@456");
        WebElement checkbox = driver.findElement(By.id("defaultCheck1"));
        js.executeScript("arguments[0].scrollIntoView(true);", checkbox);
    
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div[2]/div/div[1]/div[7]/div[1]/a/button"));
        js.executeScript("arguments[0].scrollIntoView(true);", submitButton);


        wait.until(ExpectedConditions.elementToBeClickable(submitButton));

        // Click the sign-up button using JavaScript to bypass obstructions
        js.executeScript("arguments[0].click();", submitButton);
      
       
        // Close the new window and switch back to the original window
        driver.close();
        driver.switchTo().window(originalWindow);
    }
}