

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initial {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.elempleo.com/co");
		try {
			
			WebElement btnCookie = driver.findElement(By.xpath("//*[@id=\"politics_cookieCO\"]/div/div[2]/a[2]"));
			btnCookie.click();
			WebElement txtSearch = driver.findElement(By.xpath("/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/span[1]/input"));
			txtSearch.sendKeys("cont");
			TakesScreenshot scrShot = ((TakesScreenshot) driver);
			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
			File DestFile = new File("Evidencia\\" + System.currentTimeMillis() + ".png");
			FileUtils.copyFile(SrcFile, DestFile);
			WebElement BtnSugges = driver
					.findElement(By.xpath("/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/span[1]/div/div/div[1]"));
			BtnSugges.click();
			TakesScreenshot scrShott = ((TakesScreenshot) driver);
			File SrcFilet = scrShott.getScreenshotAs(OutputType.FILE);
			File DestFilet = new File("Evidencia\\" + System.currentTimeMillis() + ".png");
			FileUtils.copyFile(SrcFilet, DestFilet);
						
			WebElement BtnSearch = driver
					.findElement(By.xpath("/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/span[2]/input"));
			BtnSearch.click();
			WebElement BtnBogota = driver
					.findElement(By.xpath("/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/span[2]/div/div/div[2]"));
			BtnBogota.click();
			WebElement lblerror = driver.findElement(By.xpath("/html/body/div[8]/div[2]/h1"));
			if (lblerror.isDisplayed()) {
				System.out.println("Success!");
			}
			String txttitle = driver.findElement(By.xpath("/html/body/div[8]/div[4]/div[1]/div[3]/div[2]")).getText();
			System.out.println(txttitle);
			
		} catch (NoSuchElementException e) {

		}
		driver.close();
	}

}
