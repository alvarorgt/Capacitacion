package com.qvision.capa.tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qvision.capa.pages.RegisterPage;

public class RegisterTest {
	
	WebDriver driver;
	
	@Before
	public void cargaInicial() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://sahitest.com/demo/training/register.htm");
	}
	
	@Test
	public void formularioLogin() {
		RegisterPage pageRegister = new RegisterPage (driver);
		String val = pageRegister.llenarFormulario("q", "e", "w", "r", "w", "f");
		assertEquals("Registered Successfully", val);		
	}
	
	@After
	public void cerrar() {
		driver.close();
	}

}
