package com.qvision.capa.tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.qvision.capa.pages.LoginPage;



public class LoginTest {

	WebDriver driver;
	LoginPage pageLogin;
	
	@Before
	public void initDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		pageLogin = PageFactory.initElements(driver, LoginPage.class);
		driver.get("http://sahitest.com/demo/training/login.htm");
	}
	
	@Test
	public void test() {
		pageLogin.loginApp("test", "secret");
		assertTrue("Error de ingreso!", pageLogin.validateLogin());
		
	}
	
	@After
	public void cerrar() {
		driver.close();
	}

}
