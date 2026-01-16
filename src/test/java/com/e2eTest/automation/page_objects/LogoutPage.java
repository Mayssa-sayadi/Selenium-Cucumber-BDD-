package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class LogoutPage extends BasePage{

	/*
	 *Retrieve webElement
	 */
	@FindBy(how = How.CSS, using =".ico-logout" )
	private static WebElement logoutBtn;
	
	@FindBy(how = How.CSS, using =".ico-login" )
	private static WebElement loginBarMenu;
	
	public static WebElement getLogoutBtn() {
		return logoutBtn;
	}
	public static WebElement getLoginBarMenu() {
		return loginBarMenu;
	}
	
	public LogoutPage() {
		super(Setup.getDriver());
	}

	
}
