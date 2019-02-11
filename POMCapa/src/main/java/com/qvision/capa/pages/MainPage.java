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
	
	public void ingresarDatos(String dato1, String dato2, String dato3) {
		
		txtJava = driver.findElement(By.xpath("//*[@id=\"listing\"]/tbody/tr[2]/td[4]/input"));
		txtJava.sendKeys(dato1);
		txtRuby = driver.findElement(By.xpath("//*[@id=\"listing\"]/tbody/tr[3]/td[4]/input"));
		txtRuby.sendKeys(dato2);
		txtPhyton = driver.findElement(By.xpath("//*[@id=\"listing\"]/tbody/tr[4]/td[4]/input"));
		txtPhyton.sendKeys(dato3);		
	}
}
