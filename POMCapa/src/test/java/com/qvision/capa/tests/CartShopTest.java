package com.qvision.capa.tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qvision.capa.keys.KeyWords;
import com.qvision.capa.pages.LoginPage;
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
		MainPage pageMain = new MainPage(driver);
		pageMain.ingresarDatos("1","2","3");
		Key.ScreenShot(driver);
	}
	@After
	public void cerrar() {
		driver.close();
	}

}
