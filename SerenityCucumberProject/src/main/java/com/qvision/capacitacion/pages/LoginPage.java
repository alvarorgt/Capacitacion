package com.qvision.capacitacion.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://sahitest.com/demo/training/login.htm")
public class LoginPage extends PageObject {

	@FindBy (name = "user")
	WebElementFacade txtUsuario;
	
	@FindBy (name = "password")
	WebElement txtPassword;
	
	@FindBy (xpath = "/html/body/center/div/form/table/tbody/tr[3]/td[2]/input")
	WebElement btnLogin;
	
	@FindBy (id = "errorMessage")
	WebElement lblMessage;
	
	public void loginApp(String username, String password) {
		txtUsuario.sendKeys(username);
		txtPassword.sendKeys(password);
		btnLogin.click();	
	}
	
	public boolean validateLogin() {
		boolean isLogin = true;
		try {
			if(lblMessage.isDisplayed()) {
				isLogin = false;
				
			}
		} catch (Exception e) {
			//	System.out.println(e.getMessage());
		}
		return isLogin;
	}
	
}
