package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class CartPage extends PageObject {

    @FindBy(css = ".success-msg span")
    private WebElementFacade successMessageSpan;
    @FindBy(css = ".qty[name*='cart']")
    private WebElementFacade qtyField;
    @FindBy(css = "div.header-minicart span.label")
    private WebElementFacade cartButton;
    @FindBy(css = "a.cart-link")
    private WebElementFacade viewCart;
    @FindBy(css="td.a-center.product-cart-remove.last a")
    private WebElementFacade removeProductFromCartButton;
    @FindBy(id = "empty_cart_button")
    private WebElementFacade emptyCartBTN;
    @FindBy(css = "li button.button.btn-proceed-checkout.btn-checkout")
    private WebElementFacade proceedToCheckOutButton;
    @FindBy(id = "login:register")
    private WebElementFacade registerForCheckOut;
    @FindBy(id = "onepage-guest-register-button")
    private WebElementFacade BTNcontinueCheckOutRegister;
    @FindBy(css = ".cart-table.data-table tbody tr")
    private List<WebElementFacade> cartProducts;
    @FindBy(css="div h1")
    private WebElementFacade emptyCartMessage;
    @FindBy(css="#checkout-step-login h3")
    private WebElementFacade checkoutMessage;

    public String getSuccessMessageSpan() {
        return successMessageSpan.getText();
    }

    public String getQtyField() {
        return qtyField.getAttribute("value");
    }
    public void clickCartButton() {
        clickOn(cartButton);
    }
    public void setViewCart() {
        clickOn(viewCart);
    }
    public void removeFromCartButton(String nameProduct) {
        for (WebElementFacade element : cartProducts) {
            if (element.getText().contains(nameProduct)) {
                clickOn(element.findElement(By.cssSelector("td.a-center.product-cart-remove.last a")));
            }
        }
    }
    public void getEmptyCartButton() {
        clickOn(emptyCartBTN);
    }
    public String getEmptyCartMessage() {
        return emptyCartMessage.getText();
    }
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
