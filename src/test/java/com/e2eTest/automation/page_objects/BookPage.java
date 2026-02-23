package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class BookPage extends BasePage  {

	@FindBy(how = How.XPATH, using = "//ul[@class='top-menu']//a[normalize-space()='Books']")
	private WebElement bookBarMenu;
	
	@FindBy(how = How.XPATH, using = "//h2[@class='product-title']//a[normalize-space()='Computing and Internet']")
    private WebElement book;
	
	@FindBy(how = How.XPATH, using = "//input[@id='add-to-cart-button-13']")
    private WebElement addToCartBtn;
	
	@FindBy(how = How.XPATH, using = "//p[@class='content']")
    private WebElement cartMessage;
	
	@FindBy(how = How.XPATH, using = "//a[@class='product-name']")
    private WebElement bookName;
	
	@FindBy(how = How.XPATH, using = "//input[@id='small-searchterms']")
    private WebElement searchField;
	
	@FindBy(how = How.XPATH, using = "//input[@value='Search']")
    private WebElement searchBtn;
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='shopping cart']")
    private WebElement panierBtn;
	
	@FindBy(how = How.CSS, using = "#termsofservice")
	private WebElement termOfServiceCheckbox;
	
	@FindBy(how = How.CSS, using = "#checkout")
	private WebElement checkoutBtn;
	
	@FindBy(how = How.XPATH, using = "//select[@id='billing-address-select']")
	private WebElement addressFacturation;
	
	@FindBy(how = How.CSS, using = "#BillingNewAddress_FirstName")
	private WebElement firstName;
	
	@FindBy(how = How.CSS, using = "#BillingNewAddress_LastName")
	private WebElement lastName;
	
	@FindBy(how = How.CSS, using = "#BillingNewAddress_Email")
	private WebElement email;
	
	@FindBy(how = How.CSS, using = "#BillingNewAddress_Address1")
	private WebElement address1;
	
	@FindBy(how = How.CSS, using = "#BillingNewAddress_City")
	private WebElement city;
	
	@FindBy(how = How.CSS, using = "#BillingNewAddress_CountryId")
	private WebElement country;
	
	@FindBy(how = How.CSS, using = "#BillingNewAddress_ZipPostalCode")
	private WebElement zip;
	
	@FindBy(how = How.CSS, using = "#BillingNewAddress_PhoneNumber")
	private WebElement phoneNumber;
	
	@FindBy(how = How.CSS, using = "input[onclick='Billing.save()']")
	private WebElement continueBtn;
	
	@FindBy(how = How.CSS, using = "#shipping-address-select")
	private WebElement shippingAddresse;
	
	@FindBy(how = How.CSS, using = "input[onclick='Shipping.save()']")
	private WebElement shippingBtn;
	
	@FindBy(how = How.CSS, using = "#shippingoption_1")
	private static WebElement shippingOptionsMethod;
	
	@FindBy(how = How.CSS, using = "input[class='button-1 shipping-method-next-step-button']")
	private WebElement nextBtn;
	
	@FindBy(how = How.CSS, using = "#paymentmethod_1")
	private static WebElement payementOptionsMethod;
	
	@FindBy(how = How.CSS, using = "input[class='button-1 payment-method-next-step-button']")
	private static WebElement continuePayementMethods;
	
	@FindBy(how = How.CSS, using = "tbody tr td p")
	private static WebElement paymentInformationsMessage;
	
	@FindBy(how = How.CSS, using = "input[class='button-1 payment-info-next-step-button']")
	private static WebElement continuePayementInformations;
	
	@FindBy(how = How.CSS, using = "#checkout-step-confirm-order")
	private static WebElement confirmOrderList;
	
	@FindBy(how = How.CSS, using = "input[value='Confirm']")
	private static WebElement confirmBtn;
	
	@FindBy(how = How.XPATH, using = "//strong[normalize-space()='Your order has been successfully processed!']")
	private static WebElement finalConfirmMessage;
	
	
	public BookPage() {
		super(Setup.getDriver());
	}

	public WebElement getBookBarMenu() {
        return bookBarMenu;
    }
	
	public WebElement getBook() {
        return book;
    }
	
	public WebElement getBookName() {
        return bookName;
    }
	
	public WebElement getAddToCartBtn() {
        return addToCartBtn;
    }
	
	public WebElement getCartMessage() {
		return cartMessage;
	}
	
	public WebElement getSearchField() {
        return searchField;
    }
	
	public WebElement getSearchBtn() {
        return searchBtn;
    }
	
	public WebElement getPanierBtn() {
        return panierBtn;
    }
	
	public WebElement getCheckoutBtn() {
        return checkoutBtn;
    }
	
	public WebElement getTermOfServiceCheckbox() {
        return termOfServiceCheckbox;
    }
	
	public WebElement getAddressFacturation() {
        return addressFacturation;
    }
	
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getAddress1() {
		return address1;
	}
	public WebElement getCountry() {
		return country;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getZip() {
		return zip;
	}
	public WebElement getPhoneNumber() {
		return phoneNumber;
	}
	
	public WebElement getContinueBtn() {
		return continueBtn;
	}
	public WebElement getShippingAddresse() {
		return shippingAddresse;
	}
	public WebElement getShippingBtn() {
		return shippingBtn;
	}
	public WebElement getShippingOptionsMethod() {
		return shippingOptionsMethod;
	}
	
	public WebElement getNextBtn() {
		return nextBtn;
	}
	public WebElement getPayementOptionsMethod() {
		return payementOptionsMethod;
	}
	
	public WebElement getContinuePayementMethods() {
		return continuePayementMethods;
	}
	
	public WebElement getPaymentInformationsMessage() {
		return paymentInformationsMessage;
	}
	
	public WebElement getContinuePayementInformations() {
		return continuePayementInformations;
	}
	
	public WebElement getConfirmOrderList() {
		return confirmOrderList;
	}
	public WebElement getConfirmBtn() {
		return confirmBtn;
	}
	
	public WebElement getFinalConfirmMessage() {
		return finalConfirmMessage;
	}
	
}
