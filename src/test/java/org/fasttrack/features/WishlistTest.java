package org.fasttrack.features;

import org.junit.Test;

public class WishlistTest extends  BaseTest{

    @Test
    public void addElementToWishlistAndLogin(){
        wishlistSteps.selectElemetToAddToWishlist();
        wishlistSteps.addElemetToWishlist();
        wishlistSteps.checkWishlistMessage();
        loginSteps.loginWishlist("alexandra.christina@yahoo.com","1234567");

    }
    @Test
    public void checkIfElementWasAddedToTheWishlist(){
        loginSteps.doLogin("alexandra.christina@yahoo.com","1234567");
        searchSteps.searchForKeyword("earrings");
        wishlistSteps.addElemetToWishlist();
        wishlistSteps.getWishlistMsg("SWING TIME EARRINGS");
    }


}
