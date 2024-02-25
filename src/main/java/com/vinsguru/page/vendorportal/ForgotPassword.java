package com.vinsguru.page.vendorportal;

import com.vinsguru.page.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ForgotPassword extends AbstractPage {

    @FindBy(id = "exampleInputEmail")
    private WebElement exampleInputEmail;

    @FindBy(xpath = "//a[@class='btn btn-primary btn-user btn-block']")
    private WebElement btnSendEmail;

    public ForgotPassword(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isAt() {
        this.wait.until(ExpectedConditions.visibilityOf(this.exampleInputEmail));
        return this.exampleInputEmail.isDisplayed();
    }

    public void forgotPassword(String password){
        this.exampleInputEmail.sendKeys(password);
        this.btnSendEmail.click();
    }

}
