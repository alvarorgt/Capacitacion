package com.qvision.elempleo.stepsdefinitions;

import static org.junit.Assert.assertTrue;


import com.qvision.elempleo.steps.PrincipalStep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SearchStepsDefinitions {

	@Steps
	PrincipalStep stepPrincipal;
	
	@Given("^I want to find jobs with a keyword$")
	public void iWantToFindJobsWithAKeyword() {
	    stepPrincipal.openurl();
	}

	@When("^I search for jobs containing contador$")
	public void iSearchForJobsContainingContador() {
		stepPrincipal.search("cont");
	}
	

	@Then("^I should only see items related to contador$")
	public void iShouldOnlySeeItemsRelatedToContador() {
		assertTrue(stepPrincipal.validate());
	    }
	
}
