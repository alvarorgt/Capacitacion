package com.qvision.capa.keys;

import java.io.File;
import java.io.FileReader;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class KeyWords {

	WebElement txt;
	int box;
	WebElement btn;
	File data = new File("Buy.txt");
	FileReader fr;

	public void screenShot(WebDriver driver) {
		try {
			TakesScreenshot scrShot = ((TakesScreenshot) driver);
			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
			File DestFile = new File("Evidencia\\" + System.currentTimeMillis() + ".png");
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("ERROR EN SS!!!");
		}
	}

	public void crash(WebDriver driver, String ID) {
		try {
			WebElement lblerror = driver.findElement(By.xpath(ID));
			if (lblerror.isDisplayed()) {
				System.out.println("ERROR!");
				screenShot(driver);
			}
		} catch (Exception e) {
			System.out.println("ERROR in crash!");
		}
	}

	public void clicks(WebDriver driver, String id) {
		btn = driver.findElement(By.xpath(id));
		btn.click();
		screenShot(driver);
	}

	/*public void ingresarDatos(int dato, String ID, WebDriver driver) {

		txt = driver.findElement(By.xpath(ID));
		txt.sendKeys(String.valueOf(dato));
		ScreenShot(driver);

	}*/
	
	public void ingresarDatos(String dato, String id, WebDriver driver) {

		txt = driver.findElement(By.xpath(id));
		txt.sendKeys(dato);
		screenShot(driver);

	}

	public int tomarDatos(String id, WebDriver driver) {

		box = Integer.parseInt(driver.findElement(By.xpath(id)).getAttribute("value"));
		System.out.println(box);
		screenShot(driver);
		return box;

	}
	
	public void limpiarBox (String id, WebDriver driver) {
		
		txt = driver.findElement(By.xpath(id));
		txt.clear();
	}
	
	public void listaD (String id, String dato, WebDriver driver) {
		Select lista = new Select (driver.findElement(By.xpath(id)));
		lista.selectByVisibleText(dato);
		screenShot(driver);
	}
	
	
}
