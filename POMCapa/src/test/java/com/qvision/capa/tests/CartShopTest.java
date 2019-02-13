package com.qvision.capa.tests;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qvision.capa.keys.KeyWords;



public class CartShopTest {
	
	WebDriver driver;
	KeyWords Key = new  KeyWords ();
	File data = new File("Buy.txt");
	FileReader fr;
	
	
	@Before
	public void cargaInicial() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://sahitest.com/demo/training/books.htm");
	}
	
	/*@Test
	public void testCartShop() {
		//MainPage pageMain = new MainPage(driver);
		Key.Click(driver,"//*[@id=\"available\"]/input[2]");
		Key.ingresarDatos(1,"//*[@id=\"listing\"]/tbody/tr[2]/td[4]/input",driver);
		Key.ingresarDatos(2,"//*[@id=\"listing\"]/tbody/tr[3]/td[4]/input",driver);
		Key.ingresarDatos(3,"//*[@id=\"listing\"]/tbody/tr[4]/td[4]/input",driver);
		Key.Click(driver, "//*[@id=\"available\"]/input[1]");
		int Total = Key.tomarDatos("//*[@id=\"total\"]",driver);
		Assert.assertEquals(175, Total);
	}*/
	
	@Test
	public void testCartShopU() {
		try {
			fr = new FileReader(data);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			while((linea=br.readLine())!=null){
			try {
			String[] datos = linea.split(",");
			Key.Click(driver,"//*[@id=\"available\"]/input[2]");
			Key.ingresarDatos(datos[0],"//*[@id=\"listing\"]/tbody/tr[2]/td[4]/input",driver);
			Key.ingresarDatos(datos[1],"//*[@id=\"listing\"]/tbody/tr[3]/td[4]/input",driver);
			Key.ingresarDatos(datos[2],"//*[@id=\"listing\"]/tbody/tr[4]/td[4]/input",driver);
			Key.Click(driver, "//*[@id=\"available\"]/input[1]");
			int Total = Key.tomarDatos("//*[@id=\"total\"]",driver);
			Assert.assertEquals(datos[4], Total);
						
		} catch (Exception e) {

		}
			
			}
		}
		 catch (IOException e1) {
			 e1.printStackTrace();
		 }
		
	}
	
	@After
	public void cerrar() {
		driver.close();
	}

}
