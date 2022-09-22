package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CheckoutSteps extends BaseSteps{

    @Step
    public void proceedToCheckOut() {
        checkoutPage.clickProceedToCheckOutButton();
    }
    @Step public void checkCheckoutMessage(){
        Assert.assertEquals("CHECKOUT AS A GUEST OR REGISTER"
                ,checkoutPage.getCheckoutMessage());
    }
    @Step
    public void checkOutWithRegisterButton(){
        checkoutPage.checkOutwithRegister();
        checkoutPage.continueBTNCheckOutRegister();

    }
}
