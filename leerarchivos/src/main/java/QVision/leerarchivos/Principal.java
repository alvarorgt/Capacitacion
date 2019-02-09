package QVision.leerarchivos;

import java.io.BufferedReader;
import java.io.File;
import org.apache.commons.io.FileUtils;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		KeyWords Key = new KeyWords();
		
		//driver.get("http://sahitest.com/demo/training/login.htm");
		try {
			driver.get("http://sahitest.com/demo/training/login.htm");
			Key.Write(driver,"user","kk");
			Key.Write(driver, "password","34");
			Key.Click(driver,"/html/body/center/div/form/table/tbody/tr[3]/td[2]/input");
			WebElement lblerror = driver.findElement(By.xpath("//*[@id=\"errorMessage\"]"));
			//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			if (lblerror.isDisplayed()) {
				System.out.println("ERROR!");
				//File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
				//File DestFile=new File("C:\\Users\\ASUS\\Documents\\Automatizacion\\Capacitación\\leerarchivos");
				//FileUtils.copyFile(SrcFile, DestFile);
			}
			
			
		} catch (Exception e) {

		}
		driver.close();
			
			}
		}/*
		 catch (IOException e1) {
			 e1.printStackTrace();
		 }
		driver.close();
	}
		 }
	*/


