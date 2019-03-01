import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Principal {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://presprivqas1.ccb.org.co/simasc/#/login");
		
		try {			
			WebElement txtUser = driver.findElement(By.xpath("//*[@id=\"loginWidget\"]/div/form/div[1]/input"));
			txtUser.sendKeys("52310301");
			WebElement txtPass = driver.findElement(By.xpath("//*[@id=\"loginWidget\"]/div/form/div[2]/input"));
			txtPass.sendKeys("Cartuja02");
			WebElement btnLogin = driver.findElement(By.xpath("//*[@id=\"loginButton\"]"));
			btnLogin.click();			
			}
		catch(NoSuchElementException e) {
			System.out.println(e);			
		}

	}

}