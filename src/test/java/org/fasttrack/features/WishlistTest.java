package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class WishlistTest extends  BaseTest{

    @Test
    public void addElementToWishlistAndLogin(){
        wishlistSteps.selectElementToAddToWishlist();
        wishlistSteps.addElementToWishlist();
        wishlistSteps.checkWishlistMessage();
        loginSteps.loginWishlist(Constants.USER_EMAIl, Constants.USER_PASS);

    }
    @Test
    public void checkIfElementWasAddedToTheWishlist(){
        loginSteps.doLogin(Constants.USER_EMAIl,Constants.USER_PASS);
        searchSteps.searchForKeyword("earrings");
        wishlistSteps.addElementToWishlist();
        wishlistSteps.getWishlistMsg("SWING TIME EARRINGS");
    }
    @Test
    public void overHoverWomenCategoryTest(){
        wishlistSteps.testOverHoverWomenCategory();
    }
}
