package com.qvision.capacitacion.steps;

import com.qvision.capacitacion.pages.LoginPage;

import net.thucydides.core.annotations.Step;

public class LoginStep {
	
	LoginPage pageLogin;
	
	@Step
	public void openurl() {
		pageLogin.open();
	}
	
	@Step
	public void login(String username, String password) {
		pageLogin.loginApp(username,password);
	}
	
	@Step	
	public boolean validate() {
		return pageLogin.validateLogin();
	}

}
