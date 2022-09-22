package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class CheckoutTest extends BaseTest{

    @Test
    public void validCheckoutTest(){
        loginSteps.doLogin(Constants.USER_EMAIl, Constants.USER_PASS);
        searchSteps.navigateToProductName("SILVER DESERT NECKLACE");
        cartSteps.addProductToCart();
        checkoutSteps.proceedToCheckOut();

    }
    @Test
    public void loginAddProductAndCheckOutWithRegister(){
        searchSteps.navigateToProductName("SHAY PRINTED PILLOW");
        cartSteps.addProductToCart();
        checkoutSteps.proceedToCheckOut();
        checkoutSteps.checkCheckoutMessage();
        checkoutSteps.checkOutWithRegisterButton();
    }
}
