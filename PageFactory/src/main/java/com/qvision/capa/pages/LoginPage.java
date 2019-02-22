package com.qvision.capa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
		
		@FindBy (name = "user")
		WebElement txtUsuario;
		
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
				System.out.println(e.getMessage());
			}
			return isLogin;
		}
		
		
	}


