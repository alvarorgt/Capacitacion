package com.qvision.elempleo.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.elempleo.com/co")

public class PrincipalPage extends PageObject {
	
	@FindBy (xpath = "/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/span[1]/input")
	WebElement txtSearch;
	
	@FindBy (xpath = "/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/span[3]/button")
	WebElement btnSearch;
	
	@FindBy (xpath = "/html/body/div[8]/div[2]/h1")
	WebElement lblValidate;
	
	@FindBy (xpath = "//*[@id=\"politics_cookieCO\"]/div/div[2]/a[2]")
	WebElement btnCookies;
	
	public void search (String search) {
		btnCookies.click();
		txtSearch.sendKeys(search);
		btnSearch.click();		
	}
	
	public boolean validate() {
		boolean isSearch = false;
		try {
			if(lblValidate.isDisplayed()) {
				isSearch = true;
				
			}
		} catch (Exception e) {
			//	System.out.println(e.getMessage());
		}
		return isSearch;
	}

}
