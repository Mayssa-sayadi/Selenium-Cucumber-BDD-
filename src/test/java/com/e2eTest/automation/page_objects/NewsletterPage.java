package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;
import com.e2eTest.automation.utils.WaitUtils;

public class NewsletterPage extends BasePage{

	private WaitUtils waitUtils;
	
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
        waitUtils = new WaitUtils(Setup.getDriver());
	}

	public WebElement getEmailField() {
		return emailField;
	}
	
	public WebElement getSubscribeBtn() {
		return subscribeBtn;
	}
	
	public String getMessageConfirm() {
		return waitUtils
                .waitForElementToBeVisible(messageConfirm, 10)
                .getText()
                .trim();
	}
}
