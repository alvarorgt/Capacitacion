package com.qvision.camara.convenio.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://presprivqas1.ccb.org.co/simasc/#/login")

public class PrincipalPage extends PageObject {
	
	@FindBy (xpath = "//*[@id=\"loginWidget\"]/div/form/div[1]/input")
	WebElementFacade txtUser;
	
	@FindBy (xpath = "//*[@id=\"loginWidget\"]/div/form/div[2]/input")
	WebElement txtPass;
	
	@FindBy (xpath = "//*[@id=\"loginButton\"]")
	WebElement btnLogin;
	
	@FindBy (xpath = "//*[@id=\"content\"]/headermodulo/div/h4")
	WebElementFacade lblValidate;
	
	@FindBy (xpath = "//*[@id=\"app\"]/nav[2]/div/div/div/div/div[2]/ul/li[2]/a")
	WebElementFacade listProfile;
	
	@FindBy (xpath = "//*[@id=\"TRANSF009\"]")
	WebElementFacade lblValidatetwo;
	
	@FindBy (xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul[3]/li[4]/a")
	WebElementFacade btnConciliacion;
	
	@FindBy (xpath ="//*[@id=\"CONF107RadicarCasoConvenio\"]")
	WebElementFacade btnRadicarCaso;
	
	@FindBy (xpath = "//*[@id=\"carga\"]/div[2]")
	WebElement elementCarga;
	
	public void logIn (String user, String pass) {
		txtUser.sendKeys(user);
		txtPass.sendKeys(pass);
		btnLogin.click();
	}
	
	public boolean validate() {
		boolean isSearch = false;
		waitFor(lblValidate);
		try {
			if (lblValidate.isDisplayed()) {
				isSearch = true;
			}
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		return isSearch;
	}
	
	public void process () {
		waitFor(ExpectedConditions.invisibilityOf(elementCarga));
		listProfile.selectByVisibleText("Aux.Administrativo");
		waitFor(lblValidatetwo);
		btnConciliacion.click();
		waitFor(btnRadicarCaso).isClickable();
		btnRadicarCaso.click();
		
	}
	
	
}
