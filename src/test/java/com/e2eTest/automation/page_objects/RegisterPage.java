package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class RegisterPage extends BasePage{

	@FindBy(how = How.XPATH, using ="//a[normalize-space()='Register']" )
	private static WebElement registerBarMenu;
	
	@FindBy(how = How.CSS, using ="label[for='gender-female']" )
	private static WebElement femaleGenreField;
	
	@FindBy(how = How.CSS, using ="label[for='gender-male']" )
	private static WebElement maleGenreField;
	
	@FindBy(how = How.CSS, using ="#FirstName" )
	private static WebElement firstNameField;
	
	@FindBy(how = How.CSS, using ="#LastName" )
	private static WebElement lastNameField;
	
	@FindBy(how = How.CSS, using ="#Email" )
	private static WebElement emailField;
	
	@FindBy(how = How.CSS, using ="#Password" )
	private static WebElement passwordField;
	
	@FindBy(how = How.CSS, using ="#ConfirmPassword" )
	private static WebElement confirmPasswordField;
	
	@FindBy(how = How.CSS, using ="#register-button" )
	private static WebElement registerBtn;
	
	@FindBy(how = How.CSS, using =".result" )
	private static WebElement message;
	
	public RegisterPage() {
		super(Setup.getDriver());
	}
	
	public static WebElement getRegisterBarMenu() {
		return registerBarMenu;
	}
	
	public static WebElement getFemaleGenreField() {
		return femaleGenreField;
	}
	
	public static WebElement getMaleGenreField() {
		return maleGenreField;
	}
	public static WebElement getFirstNameField() {
		return firstNameField;
	}
	
	public static WebElement getLastNameField() {
		return lastNameField;
	}
	public static WebElement getEmailField() {
		return emailField;
	}
	
	public static WebElement getPasswordField() {
		return passwordField;
	}
	
	public static WebElement getConfirmPasswordField() {
		return confirmPasswordField;
	}
	
	public static WebElement getRegisterBtn() {
		return registerBtn;
	}
	
	public static WebElement getMessage() {
		return message;
	}
	
}
