package qvision.pruebamaven;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author userQV
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://sahitest.com/demo/training/login.htm");
		try {
			WebElement txtUsuario = driver.findElement(By.name("user"));
			txtUsuario.sendKeys("test");
			WebElement txtPassword = driver.findElement(By.name("password"));
			txtPassword.sendKeys("secret");
			WebElement BtnLogin = driver
					.findElement(By.xpath("/html/body/center/div/form/table/tbody/tr[3]/td[2]/input"));
			BtnLogin.click();
			WebElement lblerror = driver.findElement(By.xpath("//*[@id=\"errorMessage\"]"));
			if (lblerror.isDisplayed()) {
				System.out.println("ERROR!");
			}
		} catch (NoSuchElementException e) {

		}
		driver.close();
	}

}
