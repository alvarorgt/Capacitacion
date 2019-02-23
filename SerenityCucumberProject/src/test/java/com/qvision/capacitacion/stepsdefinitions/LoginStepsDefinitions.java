package com.qvision.capacitacion.stepsdefinitions;


import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import com.qvision.capacitacion.steps.LoginStep;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepsDefinitions {
	
	@Steps
	LoginStep stepLogin;

	@Given("^That i am in the login page$")
	public void thatIAmInTheLoginPage() {
	    stepLogin.openurl();
	}

	@When("^I type the data$")
	public void iTypeTheData(DataTable arg1) {
	    List<Map<String, String>> listData = arg1.asMaps(String.class, String.class);
	    String username = listData.get(0).get("user");
	    String password = listData.get(0).get("pass");
	    stepLogin.login(username, password);
	}

	@Then("^I enter the application$")
	public void iEnterTheApplication() {
	    assertTrue(stepLogin.validate());
	}
}
