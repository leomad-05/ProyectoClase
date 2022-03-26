// nivel 2 o capas
// son puros llamados a la capa 3
package com.opensourse.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opensource.base.SeleniumWrapper;

public class Login extends SeleniumWrapper {
/*
 * Constructor
 * extends: va a heredar
 * super:(clase padre) va a traer el valor del driver en el constructor(pestaña SeleniumWrapper
 */
	public Login(WebDriver driver) {
		super(driver);
		
	}
	By txt_username = By.xpath("//input[@id='txtUsername']");
	By txt_password = By.xpath("//input[@id='txtPassword']");
	By btn_login = By.xpath("//input[@id='btnLogin']");
	//por estandar se escribe btn_
	
	/*
	 * Login Orange opensourse
	 */
	
	public void loginOrange(String username,String password) {
		reporterLog("Login into Orange open sourse");
		type(txt_username, username, "Username text field");
		type(txt_password, username, "Password text field");
		click(btn_login, "Button Login");
		implicitlyWait(5);
	}
}
