package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class NewsletterPage extends BasePage{
	
	/*
	 *Retrieve webElement
	 */
	
	@FindBy(how = How.CSS, using ="#newsletter-email" )
	private  WebElement emailField;
	
	@FindBy(how = How.CSS, using ="#newsletter-subscribe-button" )
	private  WebElement subscribeBtn;
	
	
	@FindBy(how = How.CSS, using ="#newsletter-result-block" )
	private  WebElement messageConfirm;
		
	public NewsletterPage() {
		super(Setup.getDriver());
	}

	public WebElement getEmailField() {
		return emailField;
	}
	
	public WebElement getSubscribeBtn() {
		return subscribeBtn;
	}
	
	public WebElement getMessageConfirm() {
		return messageConfirm;
               
	}
}
