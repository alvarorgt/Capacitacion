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
		File data = new File("Users.txt");
		FileReader fr;
		
		//driver.get("http://sahitest.com/demo/training/login.htm");
		try {
			fr = new FileReader(data);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			while((linea=br.readLine())!=null){
			try {
			String[] datos = linea.split(",");
			driver.get("http://sahitest.com/demo/training/login.htm");
			WebElement txtUsuario = driver.findElement(By.name("user"));
			txtUsuario.sendKeys(datos[0]);
			WebElement txtPassword = driver.findElement(By.name("password"));
			txtPassword.sendKeys(datos[1]);
			WebElement BtnLogin = driver
					.findElement(By.xpath("/html/body/center/div/form/table/tbody/tr[3]/td[2]/input"));
			BtnLogin.click();
			WebElement lblerror = driver.findElement(By.xpath("//*[@id=\"errorMessage\"]"));
			TakesScreenshot scrShot =((TakesScreenshot)driver);
			//File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			//File DestFile=new File("C:\\Users\\ASUS\\Documents\\Automatizacion\\Capacitación\\leerarchivos");
			//FileUtils.copyFile(SrcFile, DestFile);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			if (lblerror.isDisplayed()) {
				System.out.println("ERROR!");
				File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
				File DestFile=new File("C:\\Users\\ASUS\\Documents\\Automatizacion\\Capacitación\\leerarchivos\\"+System.currentTimeMillis()+".png");
				FileUtils.copyFile(SrcFile, DestFile);
			}
			
			
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
	


