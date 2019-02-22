import java.io.File;
import java.io.FileReader;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeyWords {
	
	WebElement txt;
	int box;
	WebElement btn;
	File data = new File("Buy.txt");
	FileReader fr;

	public void screenShot(WebDriver driver) {
		try {
			TakesScreenshot scrShot = ((TakesScreenshot) driver);
			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
			File DestFile = new File("Evidencia\\" + System.currentTimeMillis() + ".png");
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (Exception e) {
			System.out.println("ERROR EN SS!");
		}
	}

	public void crash(WebDriver driver, String id) {
		try {
			WebElement lblerror = driver.findElement(By.xpath(id));
			if (lblerror.isDisplayed()) {
				System.out.println("ERROR!");
				screenShot(driver);
			}
		} catch (Exception e) {
			System.out.println("ERROR in crash!");
		}
	}

	public void clicks(WebDriver driver, String id) {
		btn = driver.findElement(By.xpath(id));
		btn.click();
		screenShot(driver);
	}
	
	public void ingresarDatos(WebDriver driver,String id, String dato) {

		txt = driver.findElement(By.xpath(id));
		txt.sendKeys(dato);
		screenShot(driver);

	}

	public int tomarDatos(WebDriver driver,String id ) {

		box = Integer.parseInt(driver.findElement(By.xpath(id)).getAttribute("value"));
		System.out.println(box);
		screenShot(driver);
		return box;

	}
	
	public void limpiarBox (WebDriver driver,String id ) {
		
		txt = driver.findElement(By.xpath(id));
		txt.clear();
	}
	
	
}

