package base;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
   protected WebDriver driver;
   

	@BeforeMethod
	@Parameters({"browser"})
	public void setUp(@Optional ("Firefox")String browser) {
		System.out.println("Browser: " + browser);
		  if (browser.equalsIgnoreCase("chrome")) {
				   WebDriverManager.chromedriver().setup();
				   driver = new ChromeDriver();
				  
			  }else if (browser.equalsIgnoreCase("firefox")) {
				   WebDriverManager.firefoxdriver().setup();
				  driver = new FirefoxDriver();
			  }
		driver.manage().window().maximize();
		   driver.get("https://www.spicejet.com/");
	}
   @AfterMethod 
   public void tearDown() {
	   if(driver !=null) {
		   driver.quit();
	   }
	   
   }
   public WebDriver getDriver() {
       return driver;
   }
}