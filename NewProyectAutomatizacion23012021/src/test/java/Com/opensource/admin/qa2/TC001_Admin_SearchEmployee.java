package Com.opensource.admin.qa2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001_Admin_SearchEmployee {
 
  @BeforeTest
  public void beforeTest() {
  }

  
  
  
  
// Json
  
  
  
// Datos
  
  @Test
  public void TC001_Admin_SearchEmployee_TC() {
 
//Paso 1	  
	 Reporter.log("Open Browser \"OrangeHRM\" web page");
	 System.setProperty("webdriver.chrome.driver", "./src/test/resources/Drivers/Crome/chromedriver_win32/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();   
	 driver.get("https://opensource-demo.orangehrmlive.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
//Paso 2
	 Reporter.log("Enter Username and Password");
	 driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	 driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	 driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//Paso 3
	  Reporter.log("Validate that you have logged in successfully");
	  WebDriverWait wait = new WebDriverWait(driver, 30);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id = 'menu_admin_viewAdminModule']")));
	 
//Paso 4
	  Reporter.log("Click Admin - Go to the admin page");
	  driver.findElement(By.xpath("//input[@id='menu_admin_viewAdminModule']")).click();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//Paso 5
	  Reporter.log("Search username in field \"Username\"");
	  driver.findElement(By.xpath("//input[@id='searchSystemUser_userName']")).sendKeys("Admin");

//Paso 6
	  Reporter.log("Click Search");
	  driver.findElement(By.xpath("//input[@id=�searchBtn�]")).click();
	  
//Paso 7
	  Reporter.log("Verify username exist in table");
	  String actualUsername = driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
      Assert.assertEquals(actualUsername, "Admin");
	  
      
//Paso 8
	  Reporter.log("Log out");
	  driver.findElement(By.xpath("//a[@id = �welcome�]")).click();
	  driver.findElement(By.xpath("//a[contains(text(), 'Logout')] ")).click();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	                     
	  		
//Paso 9
	  Reporter.log("Close Browser");
	  driver.close();
  }
  
  	
  @AfterTest
  public void afterTest() {
  }

}
