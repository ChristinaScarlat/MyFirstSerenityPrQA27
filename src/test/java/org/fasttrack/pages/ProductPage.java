package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.interactions.Actions;

public class ProductPage extends PageObject {

    @FindBy(id = "qty")
    private WebElementFacade qtyField;
    @FindBy(css = ".btn-cart[onclick]")
    private WebElementFacade addToCartButton;
    @FindBy(css = "li.level0.nav-6 a.level0")
    private WebElementFacade fildVip;
    @FindBy(css = "li.item.last:nth-last-of-type(2) div.product-info h2.product-name a")
    private WebElementFacade productVase;
    @FindBy(id = "swatch20")
    private WebElementFacade productcolor;
    @FindBy(css="li.level0.nav-1.first.parent > a")
    private WebElementFacade womenCategory;
    @FindBy (css="li.level1.view-all > a")
    private WebElementFacade viewAllElements;
    @FindBy(css="li.level0.nav-5.parent a.level0.has-children")
    private WebElementFacade elementSelect;
    @FindBy(css=".sort-by select ")
    private WebElementFacade sortBySelect;

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


    public void setQtyField(int quantity) {
        qtyField.clear();
        qtyField.sendKeys(quantity + "");
    }
    public void clickAddToCartButton() {
        clickOn(addToCartButton);
    }
    public void selectProductVase() {
        clickOn(fildVip);
        clickOn(productVase);
        clickOn(productcolor);
    }
    public void selectFromDropDownSortByPosition(){
        clickOn(elementSelect);
        clickOn(sortBySelect);
    }

    public void newElementSelectToWishlist(){
        clickOn(newElementSelect);
    }
    public void clickWishListBTN(){
        clickOn(newElementWishListBTN);
    }
    public String setWishListMsg(){
        return wishListMsg.getText();
    }

//    public void hoverOverCategoryTest(){
//        Actions action = new Actions(driver);
//        action.moveToElement(womenCategory).perform();
//        viewAllElements.click();
//    }
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
