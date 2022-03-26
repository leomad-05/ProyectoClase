package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium1 {
	
  @Test
  public void selenium_test1() {
	  
		String exePath ="./DriverFolder/chromeDriver.exe"; //Especifica la ruta del chrome Driver
		System.setProperty("webdriver.chrome.driver", exePath); // Agregando la propiedad con la ruta del Chrome Driver
		WebDriver driver = new ChromeDriver(); //Objeto del web driver
		driver.get("https://google.com");	  
	  
  }
}
