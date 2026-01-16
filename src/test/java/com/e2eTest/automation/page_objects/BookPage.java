package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BookPage {
	
	@FindBy(how = How.XPATH, using = "//ul[@class='top-menu']//a[normalize-space()='Books']")
	private WebElement bookBarMenu;
	
	@FindBy(how = How.CSS, using = "div[class='product-item'] img[title='Afficher les détails pour Informatique et Internet']")
    private WebElement book;
	
	@FindBy(how = How.CSS, using = "#add-to-cart-button-13")
    private WebElement addToCartBtn;
	
	@FindBy(how = How.XPATH, using = "//font[contains(text(),'Le produit a été ajouté à votre')]")
    private WebElement cartMessage;
	
	@FindBy(how = How.CSS, using = "p[class='content'] a")
    private WebElement panierBtn;

	@FindBy(how = How.CSS, using = "a[class='product-name'] font[dir='auto'] font[dir='auto']")
    private WebElement bookName;

	@FindBy(how = How.CSS, using = "input[value='1']")
    private WebElement bookQuantity;
	
}
