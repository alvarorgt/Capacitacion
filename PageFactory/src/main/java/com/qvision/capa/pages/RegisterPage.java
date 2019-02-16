package com.qvision.capa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


 


public class RegisterPage {
	
	@FindBy (xpath = "//*[@id=\"uid\"]")
	 WebElement txtuser;
	
	@FindBy (xpath = "//*[@id=\"pid\"]")
	 WebElement txtpass;
	
	@FindBy (xpath = "//*[@id=\"pid2\"]")
	 WebElement txtrepass;
	
	@FindBy (xpath = "//*[@id=\"taid\"]")
	 WebElement txtaddresss;
	
	@FindBy (xpath = "//*[@id=\"btaid\"]")
	 WebElement txtbillAddress;
	
	@FindBy (xpath = "/html/body/center/div/form/div/table/tbody/tr[4]/td[2]/input[1]")
	 WebElement btngenderm;
	
	@FindBy (xpath = "/html/body/center/div/form/div/table/tbody/tr[4]/td[2]/input[2]")
	 WebElement btngenderf;
	
	@FindBy (xpath = "/html/body/center/div/form/div/table/tbody/tr[7]/td[2]/select")
	 WebElement liststate;
	
	@FindBy (xpath = "/html/body/center/div/form/input[2]")
	 WebElement btnregistrar;
	
	//KeyWords Key = new KeyWords();
	

	public String llenarFormulario(String userName, String passWord, String repeatPass, String address, String billingAddress, String gender, String state, WebDriver driver) {
		
		txtuser.sendKeys(userName);
		txtpass.sendKeys(passWord);
		txtrepass.sendKeys(repeatPass);
		txtaddresss.sendKeys(address);
		txtbillAddress.sendKeys(billingAddress);
			if (gender.toLowerCase().equals("male") ) {
				btngenderm.click();
			} else if (gender.toLowerCase().equals("female")){
				btngenderf.click();
			}
			else {
				System.out.println("Gender no especifico");
			}
			Select lista = new Select (liststate);
			lista.selectByVisibleText(state);
		btnregistrar.click();
		Alert alert = driver.switchTo().alert();
        String print = alert.getText();
        System.out.println(print);
        alert.accept();
        return print;       
		
		
	}
}

