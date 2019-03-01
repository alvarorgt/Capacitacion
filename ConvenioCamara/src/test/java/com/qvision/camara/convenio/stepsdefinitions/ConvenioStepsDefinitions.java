package com.qvision.camara.convenio.stepsdefinitions;

import static org.junit.Assert.assertTrue;

import com.qvision.camara.convenio.steps.PrincipalStep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ConvenioStepsDefinitions {
	
	@Steps
	PrincipalStep stepPrincipal;
	
	@Given("^On principal page login with user with profile Aux\\.Administrativo$")
	public void onPrincipalPageLoginWithUserWithProfileAuxAdministrativo() {
		stepPrincipal.openurl();
	}

	@When("^I select the option of convenios$")
	public void iSelectTheOptionOfConvenios() {
		stepPrincipal.logIn("52310301","Cartuja02");
	}

	@Then("^I should execute all process for create a radication of agreement and get a number of radicate$")
	public void iShouldExecuteAllProcessForCreateARadicationOfAgreementAndGetANumberOfRadicate() {
		assertTrue(stepPrincipal.validate());
	}
	

}
