package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class WishlistSteps extends BaseSteps{

    @Step
    public void selectElemetToAddToWishlist(){
        productPage.newElementSelectToWishlist();
    }
    @Step
    public void addElemetToWishlist(){
        productPage.clickWishListBTN();

    }
    @Step
    public void checkWishlistMessage(){
        Assert.assertEquals(("LOGIN OR CREATE AN ACCOUNT"), productPage.setAddToWishListMsg());
    }
    @Step
    public void getWishlistMsg(String productname){
        Assert.assertEquals(productname.toLowerCase() + " has been added to your wishlist. click here to continue shopping.",productPage.setWishListMsg().toLowerCase());
    }




}
