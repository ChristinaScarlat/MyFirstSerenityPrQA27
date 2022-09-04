package org.fasttrack.features;

import org.junit.Test;

public class CartTest extends BaseTest{

    @Test
    public void loginAndAddToCartTest(){
        loginSteps.doLogin("alexandra.christina@yahoo.com","1234567");
        searchSteps.navigateToProductName("SILVER DESERT NECKLACE");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessageSpan("SILVER DESERT NECKLACE");
        loginSteps.navigateToHomepage();
        cartSteps.addProductVaseToCart();
        cartSteps.checkSuccessMessageSpan("modern murray ceramic vase");
        searchSteps.navigateToProductName("SWING TIME EARRINGS");
        cartSteps.addProductToCart();
    }
    @Test
    public void addProductToCart(){
        cartSteps.addProductVaseToCart();
        cartSteps.checkSuccessMessageSpan("modern murray ceramic vase");
    }
    @Test
    public void selectPozFromDropDown(){
        cartSteps.selectFromDropDownSortByPosition();
    }
    @Test
    public void loginAndRemovePrDFromCart(){
        loginSteps.doLogin("alexandra.christina@yahoo.com","1234567");
        cartSteps.viewPrdInCart();
        cartSteps.removeFromCart();
    }
    @Test
    public void getCartEmpty(){
        loginSteps.doLogin("alexandra.christina@yahoo.com","1234567");
        cartSteps.viewPrdInCart();
        cartSteps.getCartEmpty();
        cartSteps.checkMessageForEmptyCart();
    }
    @Test
    public void loginAddProductAndCheckOutWithRegister(){
        searchSteps.navigateToProductName("SHAY PRINTED PILLOW");
        cartSteps.addProductToCart();
        cartSteps.proceedToCheckOut();
        cartSteps.checkCheckoutMessage();
        cartSteps.checkOutWithRegisterButton();
    }


}
