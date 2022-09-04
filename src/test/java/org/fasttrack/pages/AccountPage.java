package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class AccountPage extends PageObject {
    @FindBy(css = ".welcome-msg strong")
    private WebElementFacade welcomeTextElement;

    public String getWelcomeText() {
        return welcomeTextElement.getText();
    }
}
