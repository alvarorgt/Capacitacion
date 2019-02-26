


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initial {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.elempleo.com/co");
		KeyWords key = new KeyWords ();
		FileWriter fichero = null;
        PrintWriter pw = null;
		try {
			//Se crea el archivo plano
			fichero = new FileWriter("Files\\Jobs.txt");
	        pw = new PrintWriter(fichero);
			
	        //boton de aceptar cookies
			WebElement btnCookie = driver.findElement(By.xpath("//*[@id=\"politics_cookieCO\"]/div/div[2]/a[2]"));
			btnCookie.click();
			//ingresar la palabra
			WebElement txtSearch = driver.findElement(By.xpath("/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/span[1]/input"));
			txtSearch.sendKeys("cont");
			key.screenShot(driver);//screenchot
			//Boton de elegir la primera sugerencia
			WebElement BtnSugges = driver
					.findElement(By.xpath("/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/span[1]/div/div/div[1]"));
			BtnSugges.click();
			key.screenShot(driver);	
			//Elegir ciudad
			WebElement BtnSearch = driver
					.findElement(By.xpath("/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/span[2]/input"));
			BtnSearch.click();
			//Elegir bogotá
			WebElement BtnBogota = driver
					.findElement(By.xpath("/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/span[2]/div/div/div[2]"));
			BtnBogota.click();
			//Validar ingreso
			WebElement lblerror = driver.findElement(By.xpath("/html/body/div[8]/div[2]/h1"));
			if (lblerror.isDisplayed()) {
				System.out.println("Success!");
			}
			//Filtro de salario
			WebElement check = driver.findElement(By.xpath("/html/body/div[8]/div[4]/div[2]/div[1]/div/div[1]/div/div[1]/label"));
			check.click();
			key.listaD("//*[@id=\"WorkAreaFilter1\"]", "Administrativa y Financiera", driver);
			WebElement btnOther = driver.findElement(By.xpath("/html/body/div[8]/div[4]/div[2]/div[1]/div/div[3]/div/div[1]/label"));
			btnOther.click();		
			
			//Numero de ofertas encontradas
			String txtNumber = driver.findElement(By.xpath("/html/body/div[8]/div[3]/div[1]/h2/span[1]/strong[2]")).getText();
			System.out.println(txtNumber);
			int numEntero = Integer.parseInt(txtNumber);
			//iterar sobre las ofertas //Imprime en archivo plano
			for (int i=1; i <= numEntero; i++)
			{
			String txtTitle = driver.findElement(By.xpath("/html/body/div[8]/div[4]/div[1]/div[3]/div[\"+i+\"]/div[1]/ul")).getText();// /html/body/div[8]/div[4]/div[1]/div[3]/div[1]/div[1]/ul
			System.out.println(txtTitle+ "\n" + "**********************************");
			pw.println(txtTitle + "\n" + "*****************************************");
			}
			
			
		} catch (NoSuchElementException e) {
			System.out.println(e);
		}
		finally {
	           try {
	           // Nuevamente aprovechamos el finally para 
	           // asegurarnos que se cierra el fichero.
	           if (null != fichero)
	              fichero.close();
	           } catch (Exception e2) {
	              e2.printStackTrace();
	           }
		driver.close();
	}

}
}
