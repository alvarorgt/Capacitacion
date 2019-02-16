package com.qvision.capa.pages;

import java.io.File;
import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qvision.capa.keys.KeyWords;

public class MainPage {

	WebDriver driver;

	public MainPage(WebDriver driver) {
		this.driver = driver;
	}


	/*File data = new File("Users.txt");
	FileReader fr;
	KeyWords Key = new  KeyWords ();
*/
	public boolean validarIngreso() {
		boolean isValidate = false;
		try {
			WebElement lblTitle = driver.findElement(By.xpath("//*[@id='available']/h2"));
			if (lblTitle.isDisplayed()) {
				isValidate = true;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return isValidate;
	}
	
	

	

	/*public int comprarVarios(int dato1, int dato2, int dato3) {

		try {
			fr = new FileReader(data);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			return 0;
			while ((linea = br.readLine()) != null) {
				try {
					txtJava = driver.findElement(By.xpath("//*[@id=\"listing\"]/tbody/tr[2]/td[4]/input"));
					txtJava.sendKeys(String.valueOf(dato1));
					txtRuby = driver.findElement(By.xpath("//*[@id=\"listing\"]/tbody/tr[3]/td[4]/input"));
					txtRuby.sendKeys(String.valueOf(dato2));
					txtPhyton = driver.findElement(By.xpath("//*[@id=\"listing\"]/tbody/tr[4]/td[4]/input"));
					txtPhyton.sendKeys(String.valueOf(dato3));
					btnAdd = driver.findElement(By.xpath("//*[@id=\"available\"]/input[1]"));
					btnAdd.click();
					box = Integer.parseInt(driver.findElement(By.id("total")).getAttribute("value"));
					System.out.println(box);
					return box;
				} catch (Exception e) {
					return 0;
				}

			}
		} catch (IOException e1) {
			return 0;
		}
	}*/
}
