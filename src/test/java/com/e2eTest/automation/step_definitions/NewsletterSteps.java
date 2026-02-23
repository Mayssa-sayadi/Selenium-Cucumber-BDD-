package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.NewsletterPage;
import com.e2eTest.automation.utils.ActionsUtils;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.Setup;
import com.e2eTest.automation.utils.Validations;
import com.e2eTest.automation.utils.WaitUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewsletterSteps {

	NewsletterPage newsletterPage = new NewsletterPage();
	ConfigFileReader configFileReader = new ConfigFileReader();
	ActionsUtils actionsUtils = new ActionsUtils();	
	WaitUtils waitUtils = new WaitUtils(Setup.getDriver()) ;
	Validations validations = new Validations();
	
	
	@When("Je saisais une adresse mail")
	public void jeSaisaisUneAdresseMail() {
	    actionsUtils.writeText(newsletterPage.getEmailField(), configFileReader.getProperty("home.email"));
	}
	@When("Je clique sur le button Subsribe")
	public void jeCliqueSurLeButtonSubsribe() {
	   actionsUtils.click(newsletterPage.getSubscribeBtn());
	}
	@Then("Un message de confirmation s'affiche {string}")
	public void unMessageDeConfirmationSAffiche(String expectedMessage) throws InterruptedException{
		validations.assertEquals(waitUtils.waitForElementToBeVisible(newsletterPage.getMessageConfirm(), 10) ,expectedMessage);
			
	}

}
