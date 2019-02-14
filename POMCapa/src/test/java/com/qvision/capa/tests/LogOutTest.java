package com.qvision.capa.tests;

import static org.junit.Assert.assertTrue;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qvision.capa.keys.KeyWords;
import com.qvision.capa.pages.LoginPage;


public class LogOutTest {

WebDriver driver;
KeyWords Key = new  KeyWords ();
	
	@Before
	public void cargaInicial() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://sahitest.com/demo/training/books.htm");
	}
	
	@Test
	public void testLogOut() {
		LoginPage pageLogin = new LoginPage(driver);
		Key.clicks(driver,"//*[@id=\"available\"]/input[3]");
		assertTrue("No Inició", pageLogin.validarIngreso());
	}

	@After
	public void cerrar() {
		driver.close();
	}
}
	
