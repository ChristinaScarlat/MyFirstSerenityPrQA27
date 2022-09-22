package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class WishlistPage extends BasePage{

    //wishlist
    @FindBy(css="li.level0.nav-5.parent")
    private WebElementFacade newElementSelect;
    @FindBy(css="a.link-wishlist")
    private WebElementFacade newElementWishListBTN;
    @FindBy(css=".my-wishlist span")
    private WebElementFacade wishListMsg;

    @FindBy(css="li.level0.nav-1.first.parent")
    private WebElementFacade womenDress;
    @FindBy(css="li.level1.nav-1-4.last a")
    private WebElementFacade dresses;
    @FindBy(css="li.item.last:nth-child(3)")
    private WebElementFacade elementDress;
    @FindBy(css="a.link-wishlist")
    private WebElementFacade clickWishListBTNforElementDress;
    @FindBy(css=".page-title h1")
    private WebElementFacade wishListAddMsg;


    public void newElementSelectToWishlist(){
        clickOn(newElementSelect);
    }
    public void clickWishListBTN(){
        clickOn(newElementWishListBTN);
    }
    public String setWishListMsg(){
        return wishListMsg.getText();
    }

//    public void addElementToWishList() {
//        Actions action = new Actions(driver);
//        action.moveToElement(womenDress).perform();
//        dresses.click();
//        elementDress.click();
//        clickWishListBTNforElementDress.click();
//    }
    public String setAddToWishListMsg(){
        return wishListAddMsg.getText();
    }

}
