package com.qvision.elempleo.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBys;


//import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

@DefaultUrl("https://www.elempleo.com/co")

public class PrincipalPage extends PageObject {

	@FindBy(xpath = "/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/span[1]/input")
	WebElement txtSearch;

	@FindBy(xpath = "/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/span[1]/div/div/div[1]")
	WebElement btnSugges;

	@FindBy(xpath = "/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/span[2]/input")
	WebElement btnCity;

	@FindBy(xpath = "/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/span[2]/div/div/div[2]")
	WebElement txtCity;

	@FindBy(xpath = "/html/body/div[8]/div[2]/h1")
	WebElement lblValidate;

	@FindBy(xpath = "//*[@id=\"politics_cookieCO\"]/div/div[2]/a[2]")
	WebElement btnCookies;

	@FindBy(id = "salary1")
	WebElement btnsalario;

	@FindBys({ @FindBy(id = "WorkAreaFilter1"), @FindBy(xpath = "//*[@id=\"WorkAreaFilter1\"]/option[2]") })
	WebElement listAreadeTrabajo;

	@FindBy(xpath = "//*[@id=\"WorkAreaFilter1\"]/option[2]")
	WebElement txtAreadeTrabajo;

	@FindBy(xpath = "/html/body/div[8]/div[3]/div[1]/h2/span[1]/strong[2]")
	WebElement txtNumeroDeResultados;

	@FindBy(xpath = "/html/body/div[8]/div[4]/div[1]/div[3]/div[1]/div[1]/ul")
	WebElement txtFirst;

	FileWriter fichero = null;
	PrintWriter pw = null;
	
	int i = 1;

	public void search(String search) {
		btnCookies.click();
		txtSearch.sendKeys(search);
		btnSugges.click();
		btnCity.click();
		txtCity.click();
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

	public void filters() {
		listAreadeTrabajo.click();
		ExpectedConditions.elementToBeClickable(btnsalario);
		btnsalario.click();
	}

	public void readOfferts() throws IOException {
		try {
			fichero = new FileWriter("Files\\Jobs.txt");
			pw = new PrintWriter(fichero);
			int numEntero = Integer.parseInt(txtNumeroDeResultados.getText());
			System.out.println(numEntero);
			for (int i = 1; i <= numEntero; i++) {
				String txtTitle = "Hola";
				System.out.println(txtTitle + "\n" + "**********************************");
				pw.println(txtTitle + "\n" + "*****************************************");
			}
		} catch (NoSuchElementException e) {
			System.out.println(e);
		}finally {
	           try {
	           if (null != fichero)
	              fichero.close();
	           } catch (Exception e2) {
	              e2.printStackTrace();
	           }
	}
}
}
