//nivel 3 o capa

package com.opensource.base;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class SeleniumWrapper {
	
	//3er Capa / Nivel
	
	private WebDriver driver;
	
	/*
	 * Constructor SeleniumWrapper
	 */
	
	public SeleniumWrapper(WebDriver driver) {
		this.driver = driver;

	}

	/*
	 * Chome Driver Connection
	 */
	
	public WebDriver chomeDriverConnection() {
		 System.setProperty(GlobalVariables.CHROME_DRIVER,GlobalVariables.PATH_CHROME_DRIVER);
		 driver = new ChromeDriver();
	return driver;	
		
	}
// PASO 1 "Open Browser"
	
	/*Paso 1 
	 * Lauch Browser
	 * @autor
	 * @date
	 * @parametros
	 * @Descripcion
	 */
	
	 public void launchBrowser(String url) {
		 reporterLog("Launching..." + url);
		 driver.get(url);
		 driver.manage().window().maximize();
		 implicitlyWait(5);
	}
	
	/*
	 * Reportes Log
	 */
	
    public void reporterLog(String log) {
    	Reporter.log(log);
    	    	
    }
    /*
     * Implicitly wait
     */
    public void implicitlyWait(int seconds) {
    	driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
    
 //Paso 2 "Enter Username and Password"
    
    /*
     * Fint Element
     * Variable "Web Element" es un tipo de dato
     */
    
    public WebElement findElement(By locator) {
    	return driver.findElement(locator);
    }
    
    /*
     * Type method
     * variable "locator" es el objeto
     */
    
    public void type(By locator, String inputText, String description) {
    	System.out.println("Typing Text:"+ inputText+" " +description);
    	driver.findElement(locator).sendKeys(inputText);
    	   	
    }
    
    /*
     * Click Objet
     * Los ScreenShots son en cada "Click"
     */
    
    public void click(By locator, String description) {
    	System.out.println("Cliking..."+description);
    	driver.findElement(locator).click();
    }
    
    /*
     * Wait for Element Present
     * en lugar de "implicitly Wait"
     * Las excepciones son los "Try..Catch.."
     */
    
    public void waitForElementPresent(By locator, int timeout) {
    	try {
    		WebDriverWait wait = new WebDriverWait(driver, timeout);
    		  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    	}catch(TimeoutException e) {
    		
    	}
    }
  //Paso 7
    	
      /*
       * Get Text
       */
    public String getText(By locator) {
    	try {
    		return driver.findElement(locator).getText();
    	}catch(NoSuchElementException e) {
    		return null;
    	}
  }

    
    /*
     * Sertion (Hard)
     */
    
    public void assertEquals(String actualValue, String expectedValue) {
    	try {
    		Assert.assertEquals(actualValue, expectedValue);
    	}catch(AssertionError e) {
    	     Assert.fail("Not able to assert Actual value: "+actualValue+" Expected Value:"+expectedValue);
    		
    	}
    }
    
    /*
     * Close Browser
     */
    public void claseBroser() {
    	try {
    		reporterLog("Close Browser");
    		driver.close();
    		}catch(NosuchSessionException e) {
    			Assert.fail("Not able to close Browser");
    		}
    }

    
    
    
    
    
}

