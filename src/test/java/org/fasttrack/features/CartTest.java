package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest{

    @Test
    public void loginAndAddToCartTest(){
        loginSteps.doLogin(Constants.USER_EMAIl,Constants.USER_PASS);
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
        loginSteps.doLogin(Constants.USER_EMAIl,Constants.USER_PASS);
        cartSteps.viewPrdInCart();
        cartSteps.removeFromCart();
    }
    @Test
    public void getCartEmpty(){
        loginSteps.doLogin(Constants.USER_EMAIl,Constants.USER_PASS);
        cartSteps.viewPrdInCart();
        cartSteps.getCartEmpty();
        cartSteps.checkMessageForEmptyCart();
    }
    @Test
    public void checkTotalAndSubtotalTest(){
        searchSteps.navigateToProductName("SILVER DESERT NECKLACE");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("SILVER DESERT NECKLACE");

        searchSteps.navigateToProductName("SILVER DESERT NECKLACE");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessage("SILVER DESERT NECKLACE");

        cartSteps.checkSubtotalPrice();
        cartSteps.checkTotalPrice();
    }

}
