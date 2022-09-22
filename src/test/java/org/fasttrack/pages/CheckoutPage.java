package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckoutPage extends BasePage{
    @FindBy(css=".checkout-types.bottom button")
    private WebElementFacade checkoutButton;
    @FindBy(css = "li button.button.btn-proceed-checkout.btn-checkout")
    private WebElementFacade proceedToCheckOutButton;
    @FindBy(id = "login:register")
    private WebElementFacade registerForCheckOut;
    @FindBy(id = "onepage-guest-register-button")
    private WebElementFacade BTNcontinueCheckOutRegister;
    @FindBy(css="#checkout-step-login h3")
    private WebElementFacade checkoutMessage;

    public void clickProceedToCheckOutButton() {
        clickOn(proceedToCheckOutButton);
    }
    public void checkOutwithRegister() {
        clickOn(registerForCheckOut);
    }
    public void continueBTNCheckOutRegister() {
        clickOn(BTNcontinueCheckOutRegister);
    }
    public String getCheckoutMessage(){
        return checkoutMessage.getText();
    }
}
