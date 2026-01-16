package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.LogoutPage;
import com.e2eTest.automation.utils.ActionsUtils;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutSteps {
	
	LogoutPage logoutPage = new LogoutPage();
	ActionsUtils actionsUtils = new ActionsUtils();
	Validations validations = new Validations();

	@When("Je clique sur le bouton Log out")
	public void jeCliqueSurLeBoutonLogOut() {
		actionsUtils.click(LogoutPage.getLogoutBtn());
	}
	
	@Then("Je suis deconnectée {string}")
	public void jeSuisDeconnectée(String confirmation) {
		validations.assertEquals(LogoutPage.getLoginBarMenu(), confirmation);
	}
}
