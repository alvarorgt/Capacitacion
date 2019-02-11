package com.qvision.capa.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qvision.capa.keys.KeyWords;
import com.qvision.capa.pages.MainPage;



public class CartShopTest {
	
	WebDriver driver;
	KeyWords Key = new  KeyWords ();
	
	
	@Before
	public void cargaInicial() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://sahitest.com/demo/training/books.htm");
	}
	
	@Test
	public void testCartShop() {
		//MainPage pageMain = new MainPage(driver);
		Key.limpiarBox("//*[@id=\"listing\"]/tbody/tr[2]/td[4]/input", driver);
		Key.limpiarBox("//*[@id=\"listing\"]/tbody/tr[3]/td[4]/input", driver);
		Key.limpiarBox("//*[@id=\"listing\"]/tbody/tr[4]/td[4]/input", driver);
		Key.ingresarDatos(1,"//*[@id=\"listing\"]/tbody/tr[2]/td[4]/input",driver);
		Key.ingresarDatos(2,"//*[@id=\"listing\"]/tbody/tr[3]/td[4]/input",driver);
		Key.ingresarDatos(3,"//*[@id=\"listing\"]/tbody/tr[4]/td[4]/input",driver);
		Key.Click(driver, "//*[@id=\"available\"]/input[1]");
		int Total = Key.tomarDatos("//*[@id=\"total\"]",driver);
		Assert.assertEquals(1750, Total);
	}
	@After
	public void cerrar() {
		driver.close();
	}

}
