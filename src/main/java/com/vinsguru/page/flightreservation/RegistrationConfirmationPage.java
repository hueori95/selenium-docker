package com.vinsguru.page.flightreservation;

import com.vinsguru.page.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RegistrationConfirmationPage extends AbstractPage {

    private static final Logger log = LoggerFactory.getLogger(RegistrationConfirmationPage.class);

    @FindBy(id = "go-to-flights-search")
    private WebElement goToFlightSearchButton;

    @FindBy(css = "#registration-confirmation-section p b")
    private WebElement firstNameElement;

    public RegistrationConfirmationPage(WebDriver driver){
        super(driver);
    }

    @Override
    public boolean isAt() {
        this.wait.until(ExpectedConditions.visibilityOf(this.goToFlightSearchButton));
        return this.goToFlightSearchButton.isDisplayed();
    }

    public String getFirstName(){
        return this.firstNameElement.getText();
    }

    public void goToFlightSearch(){
        this.goToFlightSearchButton.click();
    }


}
