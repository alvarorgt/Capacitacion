package com.qvision.camara.convenio.steps;

import com.qvision.camara.convenio.pages.PrincipalPage;

import net.thucydides.core.annotations.Step;

public class PrincipalStep {
	
	PrincipalPage pagePrincipal;
	
	@Step
	public void openurl() {
		pagePrincipal.open();
	}
	
	@Step
	public void logIn(String user, String pass) {
		pagePrincipal.logIn(user,pass);
	}
	
	@Step
	public boolean validate() {
		return pagePrincipal.validate();		
	}
	
	@Step 
	public void process() {
		pagePrincipal.process();
	}

}
