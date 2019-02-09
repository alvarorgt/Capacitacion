package com.qvision.capa.tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qvision.capa.pages.LoginPage;
import com.qvision.capa.pages.MainPage;

public class LoginTest {

	WebDriver driver;
	
	@Before
	public void cargaInicial() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://sahitest.com/demo/training/login.htm");
	}
	
	@Test
	public void testLogin() {
		LoginPage pageLogin = new LoginPage(driver);
		MainPage pageMain = new MainPage(driver);
		pageLogin.iniciarSesion("test", "secret");
		assertTrue("No Inició", pageMain.validarIngreso());
	}

	@After
	public void cerrar() {
		driver.close();
	}
}
