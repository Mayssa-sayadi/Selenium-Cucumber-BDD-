package com.e2eTest.automation.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;
import com.e2eTest.automation.utils.WaitUtils;

public class LoginPage extends BasePage {

    private WaitUtils waitUtils;

    @FindBy(how = How.CSS, using = ".ico-login")
    private WebElement loginBarMenu;

    @FindBy(how = How.ID, using = "Email")
    private WebElement emailField;

    @FindBy(how = How.ID, using = "Password")
    private WebElement passwordField;

    @FindBy(how = How.XPATH, using = "//input[@value='Log in']")
    private WebElement loginBtn;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'@')]")
    private WebElement homePage;

    private By errorMessage =
            By.cssSelector("div[class='validation-summary-errors'] span");

    public LoginPage() {
        super(Setup.getDriver());
        waitUtils = new WaitUtils(Setup.getDriver());
    }

    public WebElement getLoginBarMenu() {
        return loginBarMenu;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getLoginBtn() {
        return loginBtn;
    }

    public WebElement getHomePage() {
        return homePage;
    }

    public String getErrorMessage() {
        return waitUtils
                .waitForElementPresence(errorMessage, 10)
                .getText()
                .trim();
    }
}
