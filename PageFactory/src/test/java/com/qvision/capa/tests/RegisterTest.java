package com.qvision.capa.tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.qvision.capa.pages.LoginPage;
import com.qvision.capa.pages.RegisterPage;

public class RegisterTest {


		WebDriver driver;
		LoginPage pageLogin;
		
		@Before
		public void initDriver() {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			pageLogin = PageFactory.initElements(driver, LoginPage.class);
			driver.get("http://sahitest.com/demo/training/register.htm");
		}
		
		@Test
		public void registerTest() {
			RegisterPage pageRegister = PageFactory.initElements(driver, RegisterPage.class);
			String val = pageRegister.llenarFormulario("q", "e", "w", "r", "w", "Male","Kerala", driver);
			assertEquals("Registered Successfully", val);
		}
		
		@After
		public void cerrar() {
			driver.close();
		}

	}
