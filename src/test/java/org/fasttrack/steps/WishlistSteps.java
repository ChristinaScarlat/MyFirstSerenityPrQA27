package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class WishlistSteps extends BaseSteps{

    @Step
    public void selectElementToAddToWishlist(){
        wishlistPage.newElementSelectToWishlist();
    }
    @Step
    public void addElementToWishlist(){
        wishlistPage.clickWishListBTN();

    }
    @Step
    public void checkWishlistMessage(){
        Assert.assertEquals(("LOGIN OR CREATE AN ACCOUNT"), wishlistPage.setAddToWishListMsg());
    }
    @Step
    public void getWishlistMsg(String productname){
        Assert.assertEquals(productname.toLowerCase() + " has been added to your wishlist. click here to continue shopping.",wishlistPage.setWishListMsg().toLowerCase());
    }
    @Step
    public void testOverHoverWomenCategory(){
        productPage.hoverOverCategorySerenityTest();
    }

}
