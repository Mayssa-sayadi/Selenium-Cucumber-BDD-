package com.e2eTest.automation.step_definitions;

import org.openqa.selenium.WebElement;

import com.e2eTest.automation.page_objects.BookPage;
import com.e2eTest.automation.utils.ActionsUtils;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SelectFromListUtils;
import com.e2eTest.automation.utils.Setup;
import com.e2eTest.automation.utils.Validations;
import com.e2eTest.automation.utils.WaitUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookSteps {

	BookPage bookPage = new BookPage();
	ConfigFileReader configFileReader = new ConfigFileReader();
	ActionsUtils actionsUtils = new ActionsUtils();
	Validations validations = new Validations();
	WaitUtils waitUtils = new WaitUtils(Setup.getDriver()) ;
	SelectFromListUtils selectFromListUtils = new SelectFromListUtils();

	@When("Je clique sur la section Books")
	public void jeCliqueSurLaSectionBooks() {
	  actionsUtils.click(bookPage.getBookBarMenu());
	}
	@When("Je sélectionne le livre {string}")
	public void jeSélectionneLeLivre(String bookName) {
	validations.assertEquals(bookPage.getBook(), bookName);
 	actionsUtils.click(bookPage.getBook());
	}
	@When("Je clique sur Add to cart")
	public void jeCliqueSurAddToCart() {
		actionsUtils.click(bookPage.getAddToCartBtn());
	}
	@Then("Le message {string} doit être affiché")
	public void leMessageDoitÊtreAffiché(String messageCart) throws InterruptedException {
		WebElement message = waitUtils.waitForElementToBeVisible(bookPage.getCartMessage(), 10);
		validations.assertEquals(message, messageCart );
	}
	/*---------------------------------------------------------*/
	
	@When("Je saisis {string} dans la barre de recherche")
	public void jeSaisisDansLaBarreDeRecherche(String book) {
	   actionsUtils.writeText(bookPage.getSearchField(), book);
	}
	@When("Je clique sur le bouton Rechercher")
	public void jeCliqueSurLeBoutonRechercher() {
	   actionsUtils.click(bookPage.getSearchBtn());
	}
	
	/*---------------------------------------------------------------------------------*/
	@When("je click sur le boutton shopping cart")
	public void jeClickSurLeBouttonShoppingCart() {
		actionsUtils.click(bookPage.getPanierBtn());
	}
	@When("je me dirige vers la page du shopping cart")
	public void jeMeDirigeVersLaPageDuShoppingCart() throws InterruptedException {
	    validations.assertEquals(bookPage.getBookName(), configFileReader.getProperty("book.name"));
	}
	@When("Je coche sur la case accept terms of use")
	public void jeCocheSurLaCaseAcceptTermsOfUse() {
		actionsUtils.click(bookPage.getTermOfServiceCheckbox());
	}
	@When("Je clique sur le boutton checkout")
	public void jeCliqueSurLeBouttonCheckout() {
		actionsUtils.click(bookPage.getCheckoutBtn());

	}
	@When("Je saisis une Nouvelle addresse de facturation")
	public void JeSaisisUneNouvelleAddresseDeFacturation() throws InterruptedException {
		Thread.sleep(2000);
		selectFromListUtils.selectDropDownListByVisibleText(waitUtils.waitForElementToBeVisible(bookPage.getAddressFacturation(), 20) , "New Address");
		
		actionsUtils.clearField(bookPage.getFirstName());
		actionsUtils.writeText(bookPage.getFirstName(), "Zied");
		actionsUtils.clearField(bookPage.getLastName());
		actionsUtils.writeText(bookPage.getLastName(), "HANNECHI");
		actionsUtils.clearField(bookPage.getEmail());
		actionsUtils.writeText(bookPage.getEmail(), "ziedhannachi0@gmail.com");
		selectFromListUtils.selectDropDownListByVisibleText(bookPage.getCountry(), "Tunisia");
		actionsUtils.clearField(bookPage.getCity());
		actionsUtils.writeText(bookPage.getCity(), "Sousse");
		actionsUtils.clearField(bookPage.getAddress1());
		actionsUtils.writeText(bookPage.getAddress1(), "Avenue");
		actionsUtils.clearField(bookPage.getZip());
		actionsUtils.writeText(bookPage.getZip(), "5035");
		actionsUtils.clearField(bookPage.getPhoneNumber());
		actionsUtils.writeText(bookPage.getPhoneNumber(), "20002000");
		actionsUtils.click(bookPage.getContinueBtn());
	}
	@When("Je click sur le boutton continue pour addresse de facturation")
	public void jeClickSurLeBouttonContinuePourAddresseDeFacturation() {
	   actionsUtils.click(bookPage.getContinueBtn());
	}
	@When("Je choisis une addresse de residence existante")
	public void jeChoisisUneAddresseDeResidenceExistante() {
	    selectFromListUtils.selectDropDownListByIndex(waitUtils.waitForElementToBeVisible(bookPage.getShippingAddresse(),20), 0);
	}
	@When("Je click sur le boutton continue pour addresse de residence")
	public void jeClickSurLeBouttonContinuePourAddresseDeResidence() {
		actionsUtils.click(bookPage.getShippingBtn());
	}
	@When("Je choisis la methode de livraison Ground")
	public void jeChoisisLaMethodeDeLivraisonGround() {
		actionsUtils.click(waitUtils.waitForElementToBeVisible(bookPage.getShippingOptionsMethod(),10));
	}
	@When("Je click sur le boutton continue pour la methode de livraison")
	public void jeClickSurLeBouttonContinuePourLaMethodeDeLivraison() {
		   actionsUtils.click(bookPage.getNextBtn());
	}
	@When("Je choisis une methode de paiement Cash on delivery")
	public void jeChoisisUneMethodeDePaiementCashOnDelivery() {
	   actionsUtils.click(waitUtils.waitForElementToBeVisible(bookPage.getPayementOptionsMethod(),10));
	}
	@When("Je click sur le boutton continue pour methode de paiement")
	public void jeClickSurLeBouttonContinuePourMethodeDePaiement() {
	    actionsUtils.click(bookPage.getContinuePayementMethods());
	}
	@Then("Je vois un message du mon choix de methode de paiement")
	public void jeVoisUnMessageDuMonChoixDeMethodeDePaiement() {
	    waitUtils.waitForElementToBeVisible(bookPage.getPaymentInformationsMessage(), 20);
	}
	@Then("Je click sur le boutton continue le message du mon choix")
	public void jeClickSurLeBouttonContinueLeMessageDuMonChoix() {
		actionsUtils.click(bookPage.getContinuePayementInformations());
	}
	@Then("Le récapitulatif de la commande doit être affiché")
	public void leRécapitulatifDeLaCommandeDoitÊtreAffiché() {
	    waitUtils.waitForElementToBeVisible(bookPage.getConfirmOrderList(), 20);

	}
	@Then("Je click sur le boutton confirm")
	public void jeClickSurLeBouttonConfirm() {
	    actionsUtils.click(waitUtils.waitForElementToBeVisible(bookPage.getConfirmBtn(), 10) );
	}
	@Then("Le message de confirmation de commande doit être affiché {string}")
	public void leMessageDeConfirmationDeCommandeDoitÊtreAffiché(String confirmMessage) {
	   validations.assertEquals(waitUtils.waitForElementToBeVisible(bookPage.getFinalConfirmMessage(),10), confirmMessage);
	   
	}








	}








