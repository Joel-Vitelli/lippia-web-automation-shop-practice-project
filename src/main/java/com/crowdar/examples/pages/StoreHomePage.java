package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class StoreHomePage extends PageBaseStore {

    public StoreHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    private final String SIGN_IN_BUTTON_CSS_SELECTOR = "#header > div.nav > div > div > nav > div.header_user_info > a";
    private final String CREATE_ACCOUNT_BUTTON_CSS_SELECTOR = "#SubmitCreate";
    private final String SIGNIN_BUTTON_CSS_SELECTOR = "#SubmitLogin";
    private final String REGISTER_BUTTON_ID = "submitAccount";
    private final String SLIDER_HOME_ID = "slider_row";
    private final String H1_TITLE_CSS_SELECTOR = "#center_column > h1";
    private final String EMAIL_INPUT_CREATE_CSS_SELECTOR = "#email_create";
    private final String EMAIL_INPUT_LOGIN_CSS_SELECTOR = "#email";
    private final String FORM_CSS_SELECTOR = "#noSlide > h1";

    public void go(){
        navigateToCompleteURL();
    }

    public void verificarHome(){
        Assert.assertTrue(isElementPresentAndDisplayed(By.id(SLIDER_HOME_ID)), "El elemento no es visible");
    }

    public void clickButton(String button){
        switch (button){
            case "Sign in":
                loginButtonClick();
                break;
            case "Create an account":
                createAnAccountButton();
                break;
            case "Register":
                registerButton();
                break;
        }
    }

    public void loginButtonClick(){
        if (isElementPresent(By.cssSelector(SIGN_IN_BUTTON_CSS_SELECTOR)) && isElementPresent(By.cssSelector(SIGNIN_BUTTON_CSS_SELECTOR))){
            clickElement(By.cssSelector(SIGNIN_BUTTON_CSS_SELECTOR));
        }
        if (isElementVisible(By.cssSelector(SIGN_IN_BUTTON_CSS_SELECTOR))){
            click("store.signin_button");
        }
    }

    public void createAnAccountButton(){
        clickElement(By.cssSelector(CREATE_ACCOUNT_BUTTON_CSS_SELECTOR));
    }

    public void registerButton(){
        clickElement(By.id(REGISTER_BUTTON_ID));
    }

    public void redirectScreen(String pantalla){
        switch (pantalla){
            case "Login":
                verifyLoginScreen();
                break;
            case "My Account":
                verifyMyAccountScreen();
                break;
        }
    }

    public void verifyLoginScreen(){
        Assert.assertEquals(getWebElement(By.cssSelector(H1_TITLE_CSS_SELECTOR)).getText(),"AUTHENTICATION");
    }

    public void verifyMyAccountScreen(){
        Assert.assertEquals(getWebElement(By.cssSelector(H1_TITLE_CSS_SELECTOR)).getText(),"MY ACCOUNT");
    }

    public void enterEmail(String email){
        completeField(By.cssSelector(EMAIL_INPUT_CREATE_CSS_SELECTOR), email);
        completeField(By.cssSelector(EMAIL_INPUT_LOGIN_CSS_SELECTOR), email);
    }

    public void verifYForm(){
        waitForElementVisibility(By.cssSelector(FORM_CSS_SELECTOR));
        Assert.assertTrue(isElementPresentAndDisplayed(By.cssSelector(FORM_CSS_SELECTOR)), "El Formulario no se ha desplegado");
    }


}
