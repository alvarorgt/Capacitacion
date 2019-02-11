package com.qvision.capa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	WebElement txtUser;
	WebElement txtPass;
	WebElement BtnLogin;
	
	public void iniciarSesion (String user, String pass) {
		txtUser = driver.findElement(By.name("user"));
		txtUser.sendKeys(user);
		txtPass = driver.findElement(By.name("password"));
		txtPass.sendKeys(pass);
		BtnLogin = driver.findElement(By.xpath("/html/body/center/div/form/table/tbody/tr[3]/td[2]/input"));
		BtnLogin.click();		
	}

}
