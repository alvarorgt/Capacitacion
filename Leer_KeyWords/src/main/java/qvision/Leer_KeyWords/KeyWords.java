package qvision.Leer_KeyWords;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeyWords {

public void Write(WebDriver driver, String ID, String Dato) {
		
		WebElement txtUsuario = driver.findElement(By.name(ID));
		txtUsuario.sendKeys(Dato);
		ScreenShot(driver);
}
	public void ScreenShot(WebDriver driver) {
			try {
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File("C:\\Users\\userQV.QV-1606\\Documents\\Capacitacion\\Leer_KeyWords\\Evidencia\\"+System.currentTimeMillis()+".png");
		FileUtils.copyFile(SrcFile, DestFile);
			}
			catch (Exception e) {
				System.out.println("ERROR EN SS!");
			}
	}
	
	public void Click(WebDriver driver, String ID) {
		WebElement BtnLogin = driver
				.findElement(By.xpath(ID));
		BtnLogin.click();
		ScreenShot(driver);
	}
	public void crash (WebDriver driver, String ID) {
		try {
		WebElement lblerror = driver.findElement(By.xpath(ID));
		if (lblerror.isDisplayed()) {
			System.out.println("ERROR!");
			ScreenShot(driver);
		}
		}
		catch (Exception e) {
			System.out.println("ERROR in crash!");
		}
		}
	}
