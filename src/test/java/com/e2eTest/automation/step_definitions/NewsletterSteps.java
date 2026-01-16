package com.e2eTest.automation.step_definitions;

import org.junit.jupiter.api.Assertions;

import com.e2eTest.automation.page_objects.NewsletterPage;
import com.e2eTest.automation.utils.ActionsUtils;
import com.e2eTest.automation.utils.ConfigFileReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewsletterSteps {

	NewsletterPage newsletterPage = new NewsletterPage();
	ConfigFileReader configFileReader = new ConfigFileReader();
	ActionsUtils actionsUtils = new ActionsUtils();	
	
	@When("Je saisais une adresse mail")
	public void jeSaisaisUneAdresseMail() {
	    actionsUtils.writeText(newsletterPage.getEmailField(), configFileReader.getProperty("home.email"));
	}
	@When("Je clique sur le button Subsribe")
	public void jeCliqueSurLeButtonSubsribe() {
	   actionsUtils.click(newsletterPage.getSubscribeBtn());
	}
	@Then("Un message de confirmation s'affiche {string}")
	public void unMessageDeConfirmationSAffiche(String expectedMessage) {
		 String actualMessage = newsletterPage.getMessageConfirm();

		    System.out.println("EXPECTED = [" + expectedMessage + "]");
		    System.out.println("ACTUAL   = [" + actualMessage + "]");

		    Assertions.assertEquals(expectedMessage, actualMessage);	}



}
