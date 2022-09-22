package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
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
    public void selectFromDropDownSortByPosition() {
        productPage.selectFromDropDownSortByPosition();
    }

    @Step
    public void checkSuccessMessage(String productName){
        Assert.assertEquals((productName + " was added to your shopping cart.").toLowerCase(), cartPage.getSuccessMessage().toLowerCase());
    }
    @Step
    public void checkSubtotalPrice(){
        Assert.assertTrue(cartPage.checkIfSubtotalMatches());
    }
    @Step
    public void checkTotalPrice(){
        Assert.assertTrue(cartPage.checkIfTotalPriceMatches());
    }
}
