import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class KeyWords {
	
	public void screenShot(WebDriver driver) {
		try {
			TakesScreenshot scrShot = ((TakesScreenshot) driver);
			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
			File DestFile = new File("Evidencia\\" + System.currentTimeMillis() + ".png");
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("ERROR EN SS!!!");
		}
	}
	
	public void listaD (String id, String dato, WebDriver driver) {
		Select lista = new Select (driver.findElement(By.xpath(id)));
		lista.selectByVisibleText(dato);
		screenShot(driver);
	}

}
