package com.qvision.elempleo.stepsdefinitions;

import static org.junit.Assert.assertTrue;

import com.qvision.elemepleo.steps.InitialStep;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SearchStepsDefinitions {
	
	@Steps
	InitialStep stepInitial;
	
	@Given("^I want to find jobs with a keyword$")
	public void iWantToFindJobsWithAKeyword() {
	    stepInitial.openurl();
	}

	@When("^I search for jobs containing 'contador'$")
	public void iSearchForJobsContainingContador() {
	    stepInitial.search("contador");
	}

	@Then("^I should only see items related to 'contador'$")
	public void iShouldOnlySeeItemsRelatedToContador() {
	    assertTrue(stepInitial.validate());
	}

}
