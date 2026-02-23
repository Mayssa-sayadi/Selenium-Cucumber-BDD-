package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.RegisterPage;
import com.e2eTest.automation.utils.ActionsUtils;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.Setup;
import com.e2eTest.automation.utils.Validations;
import com.e2eTest.automation.utils.WaitUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {
	
	RegisterPage registerPage = new RegisterPage();
	ConfigFileReader configFileReader = new ConfigFileReader();
	ActionsUtils actionsUtils = new ActionsUtils();
	Validations validations = new Validations();
	WaitUtils waitUtils = new WaitUtils(Setup.getDriver());
	
	@When("Je saisis les valides données")
	public void jeSaisisLesValidesDonnées() {
		actionsUtils.click(RegisterPage.getRegisterBarMenu());
		actionsUtils.click(RegisterPage.getFemaleGenreField());
		actionsUtils.writeText(RegisterPage.getFirstNameField(), configFileReader.getProperty("register.firstName"));
		actionsUtils.writeText(RegisterPage.getLastNameField(), configFileReader.getProperty("register.lastName"));
		actionsUtils.writeText(RegisterPage.getEmailField(), configFileReader.getProperty("register.email"));
		actionsUtils.writeText(RegisterPage.getPasswordField(), configFileReader.getProperty("register.password"));
		actionsUtils.writeText(RegisterPage.getConfirmPasswordField(), configFileReader.getProperty("register.confirmPassword"));
		actionsUtils.click(RegisterPage.getRegisterBtn());
		
	}
	@Then("Un message de succès d’inscription s’affiche {string}")
	public void unMessageDeSuccèsDInscriptionSAffiche(String confirmation) {
		validations.assertEquals(waitUtils.waitForElementToBeVisible(RegisterPage.getMessage(), 20), confirmation);
	}
/*------------------------------------------------------------------------------------------------------------------------------*/
	

	@When("Je saisis les données avec un mail existant")
	public void jeSaisisLesDonnéesAvecUnMailExistant() {
		actionsUtils.click(RegisterPage.getRegisterBarMenu());
		actionsUtils.click(RegisterPage.getFemaleGenreField());
		actionsUtils.writeText(RegisterPage.getFirstNameField(), configFileReader.getProperty("register.firstName"));
		actionsUtils.writeText(RegisterPage.getLastNameField(), configFileReader.getProperty("register.lastName"));
		actionsUtils.writeText(RegisterPage.getEmailField(), configFileReader.getProperty("register.email"));
		actionsUtils.writeText(RegisterPage.getPasswordField(), configFileReader.getProperty("register.password"));
		actionsUtils.writeText(RegisterPage.getConfirmPasswordField(), configFileReader.getProperty("register.confirmPassword"));
		actionsUtils.click(RegisterPage.getRegisterBtn());
	}
	@Then("Un message d'alerte s’affiche {string}")
	public void unMessageDAlerteSAffiche(String emailAlert) {
		validations.assertEquals(waitUtils.waitForElementToBeVisible(RegisterPage.getMessageEmail(), 20), emailAlert);

	}




}
