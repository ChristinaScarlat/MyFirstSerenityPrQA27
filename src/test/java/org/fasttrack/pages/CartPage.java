package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class CartPage extends BasePage {

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

    @FindBy(css = ".cart-table.data-table tbody tr")
    private List<WebElementFacade> cartProducts;
    @FindBy(css="div h1")
    private WebElementFacade emptyCartMessage;


    //verify price
    @FindBy(css = ".success-msg")
    private WebElementFacade successMessage;

    @FindBy(css = ".product-cart-total")
    private List<WebElementFacade> subtotalProductsList;

    @FindBy(css = "tbody tr:first-child .a-right .price")
    private WebElementFacade subtotalCartPrice;

    @FindBy(css = "tbody tr:last-child .a-right .price")
    private WebElementFacade taxPrice;

    @FindBy(css = "tfoot .price")
    private WebElementFacade totalCartPrice;



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
        public String getSuccessMessage(){
        return successMessage.getText();
    }

    public int getProductsSubtotal(){
        int sum = 0;
        for(WebElementFacade elementFacade:subtotalProductsList){
            sum+= convertStringToInteger(elementFacade.getText());
        }
        return sum;
    }
    public boolean checkIfSubtotalMatches(){
        int expected = getProductsSubtotal();
        int actual = convertStringToInteger(subtotalCartPrice.getText());
        return expected == actual;
    }
    public boolean checkIfTotalPriceMatches(){
        int subtotal = getProductsSubtotal();
        int fee = convertStringToInteger(taxPrice.getText());
        int expectedTotal = subtotal + fee;
        int actualTotal = convertStringToInteger(totalCartPrice.getText());
        return expectedTotal == actualTotal;
    }

}
