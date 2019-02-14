package com.qvision.capa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qvision.capa.keys.KeyWords;

public class RegisterPage {

	WebDriver driver;
	KeyWords Key = new KeyWords();

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}

	WebElement txt;
	WebElement btn;

	public String llenarFormulario(String dato1, String dato2, String dato3, String dato4, String dato5) {

		Key.ingresarDatos(dato1, "//*[@id=\"uid\"]", driver);
		Key.ingresarDatos(dato2, "//*[@id=\"pid\"]", driver);
		Key.ingresarDatos(dato3, "//*[@id=\"pid2\"]", driver);
		Key.ingresarDatos(dato4, "//*[@id=\"taid\"]", driver);
		Key.ingresarDatos(dato5, "//*[@id=\"btaid\"]", driver);
			if (dato5 == "m" || dato5 == "M") {
				Key.clicks(driver, "/html/body/center/div/form/div/table/tbody/tr[4]/td[2]/input[1]");
			} else if (dato5 == "f" || dato5 == "F") {
				Key.clicks(driver, "/html/body/center/div/form/div/table/tbody/tr[4]/td[2]/input[2]");
			}
			else {
				System.out.println("Gender no especifico");
			}
		Key.listaD("/html/body/center/div/form/div/table/tbody/tr[7]/td[2]/select", "Tamil Nadu", driver);
		Key.clicks(driver,"/html/body/center/div/form/input[2]");
		Alert alert = driver.switchTo().alert();
        String print = alert.getText();
        System.out.println(print);
        Key.screenShot(driver);
        alert.accept();
        return print;
        
		
		
	}
}
