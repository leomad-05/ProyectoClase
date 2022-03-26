package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumtest1 {

	public static void main(String[] args) {
		String exePath ="./DriverFolder/chromeDriver.exe"; //Especifica la ruta del chrome Driver
		System.setProperty("webdriver.chrome.driver", exePath); // Agregando la propiedad con la ruta del Chrome Driver
		WebDriver driver = new ChromeDriver(); //Objeto del web driver
		driver.get("https://google.com");
		
		
	}

}
