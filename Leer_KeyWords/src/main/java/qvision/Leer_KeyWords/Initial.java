package qvision.Leer_KeyWords;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		File data = new File("Users.txt");
		FileReader fr;
		KeyWords Key = new  KeyWords ();
		//driver.get("http://sahitest.com/demo/training/login.htm");
		try {
			fr = new FileReader(data);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			while((linea=br.readLine())!=null){
			try {
			String[] datos = linea.split(",");
			driver.get("http://sahitest.com/demo/training/login.htm");
			Key.Write(driver, "user",datos[0] );
			Key.Write(driver, "password",datos[1] );
			Key.crash(driver,"//*[@id=\"errorMessage\"]");
			Key.Click(driver, "/html/body/center/div/form/table/tbody/tr[3]/td[2]/input");
			//Key.crash(driver,"//*[@id=\"errorMessage\"]");
			//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
						
		} catch (Exception e) {

		}
			
			}
		}
		 catch (IOException e1) {
			 e1.printStackTrace();
		 }
		driver.close();
	}
		 }