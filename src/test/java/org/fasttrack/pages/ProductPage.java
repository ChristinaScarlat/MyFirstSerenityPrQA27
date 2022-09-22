package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends BasePage {

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
    @FindBy(css="#nav li.level0.nav-1.first.parent a")
    private WebElementFacade womenCategory;
    @FindBy (css="li.level1.view-all > a")
    private WebElementFacade viewAllElements;
    @FindBy(css="li.level0.nav-5.parent a.level0.has-children")
    private WebElementFacade elementSelect;
    @FindBy(css=".sort-by select ")
    private WebElementFacade sortBySelect;



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
    public void hoverOverCategorySerenityTest(){
        womenCategory.select();
        viewAllElements.select();


//        Actions action = new Actions(driver);
//        action.moveToElement(womenCategory).perform();
//        viewAllElements.click();
    }

}
