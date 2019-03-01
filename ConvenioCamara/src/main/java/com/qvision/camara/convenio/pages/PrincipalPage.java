package com.qvision.camara.convenio.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://presprivqas1.ccb.org.co/simasc/#/login")

public class PrincipalPage extends PageObject {
	
	@FindBy (xpath = "//*[@id=\"loginWidget\"]/div/form/div[1]/input")
	WebElement txtUser;
	
	@FindBy (xpath = "//*[@id=\"loginWidget\"]/div/form/div[2]/input")
	WebElement txtPass;
	
	@FindBy (xpath = "//*[@id=\"loginButton\"]")
	WebElement btnLogin;
	
	@FindBy (xpath = "//*[@id=\"content\"]/headermodulo/div/h4")
	WebElement lblValidate;
	
	public void logIn (String user, String pass) {
		txtUser.sendKeys(user);
		txtPass.sendKeys(pass);
		btnLogin.click();
	}
	
	public boolean validate() {
		boolean isSearch = false;
		try {
			if (lblValidate.isDisplayed()) {
				isSearch = true;

			}
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		return isSearch;
	}
	
	
}
