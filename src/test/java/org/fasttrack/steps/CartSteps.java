package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.jruby.ir.operands.SValue;
import org.junit.Assert;

public class CartSteps extends BaseSteps{

    @Step
    public void addProductToCart() {
        productPage.clickAddToCartButton();
    }
    @Step
    public void addProductVaseToCart(){
        productPage.selectProductVase();
        productPage.clickAddToCartButton();
    }
    @Step
    public void viewPrdInCart(){
        cartPage.clickCartButton();
        cartPage.setViewCart();
    }
    @Step
    public void removeFromCart(){
        cartPage.removeFromCartButton("MODERN MURRAY CERAMIC VASE");
    }
    @Step
    public void checkSuccessMessageSpan(String productName){
        Assert.assertEquals((productName.toLowerCase() + " was added to your shopping cart."), cartPage.getSuccessMessageSpan().toLowerCase());
    }
    @Step
    public void getCartEmpty(){
        cartPage.getEmptyCartButton();
    }
    @Step public void checkMessageForEmptyCart(){
        Assert.assertEquals("SHOPPING CART IS EMPTY"
                ,cartPage.getEmptyCartMessage());
    }
    @Step
    public void proceedToCheckOut() {
        cartPage.clickProceedToCheckOutButton();
    }
    @Step public void checkCheckoutMessage(){
        Assert.assertEquals("CHECKOUT AS A GUEST OR REGISTER"
                ,cartPage.getCheckoutMessage());
    }
    @Step
    public void checkOutWithRegisterButton(){
        cartPage.checkOutwithRegister();
        cartPage.continueBTNCheckOutRegister();

    }
    @Step
    public void selectFromDropDownSortByPosition() {
        productPage.selectFromDropDownSortByPosition();
    }


}
