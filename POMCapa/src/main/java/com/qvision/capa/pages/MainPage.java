package com.qvision.capa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

	WebDriver driver;	
	
	public MainPage(WebDriver driver) {
		this.driver = driver;
	}

	WebElement txtJava;
	WebElement txtRuby;
	WebElement txtPhyton;
	
	
	public boolean validarIngreso() {
		boolean isValidate = false;
		try {
			WebElement lblTitle = driver.findElement(By.xpath("//*[@id='available']/h2"));
			if (lblTitle.isDisplayed()) {
				isValidate = true;
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return isValidate;
	}
	
	/*public void ingresarDatos(String dato1, String dato2, String dato3) {
		
		txtJava = driver.findElement(By.name("q"));
		
		
	}*/
}
