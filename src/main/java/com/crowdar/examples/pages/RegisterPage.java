package com.crowdar.examples.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class RegisterPage extends PageBaseStore {

    public RegisterPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    private final String TITLE_MR_RBUTTON_CSS_SELECTOR = "#uniform-id_gender1";
    private final String TITLE_MRS_RBUTTON_CSS_SELECTOR = "#uniform-id_gender2";
    private final String FNAME_INPUT_CSS_SELECTOR = "#customer_firstname";
    private final String LNAME_INPUT_CSS_SELECTOR = "#customer_lastname";
    private final String PASS_INPUT_CSS_SELECTOR = "#passwd";
    private final String COMBOBOX_DAY_CSS_SELECTOR = "#days";
    private final String COMBOBOX_MONTH_CSS_SELECTOR = "#months";
    private final String COMBOBOX_YEAR_CSS_SELECTOR = "#years";
    private final String COMPANY_INPUT_CSS_SELECTOR = "#company";
    private final String ADDRESS_INPUT_CSS_SELECTOR = "#address1";
    private final String CITY_INPUT_CSS_SELECTOR = "#city";
    private final String COMBOBOX_STATE_CSS_SELECTOR = "#id_state";
    private final String ZIP_INPUT_CSS_SELECTOR = "#postcode";
    private final String COMBOBOX_COUNTRY_CSS_SELECTOR = "#id_country";
    private final String MOBILE_INPUT_CSS_SELECTOR = "#phone_mobile";
    private final String ALIAS_INPUT_CSS_SELECTOR = "#alias";


    public void completePersolanInformation(String title, String fName, String lName, String pass, String birth ){
        switch (title){
            case "Mr.":
                clickElement(By.cssSelector(TITLE_MR_RBUTTON_CSS_SELECTOR));
                break;
            case "Mrs.":
                clickElement(By.cssSelector(TITLE_MRS_RBUTTON_CSS_SELECTOR));
        }
        completeField(By.cssSelector(FNAME_INPUT_CSS_SELECTOR), fName);
        completeField(By.cssSelector(LNAME_INPUT_CSS_SELECTOR), lName);
        completeField(By.cssSelector(PASS_INPUT_CSS_SELECTOR), pass);


        String[] birthList = birth.split("/");
        String day = birthList[0];
        String month = birthList[1];
        String year = birthList[2];

        getWebElement(By.cssSelector(COMBOBOX_DAY_CSS_SELECTOR)).sendKeys(day);
        getWebElement(By.cssSelector(COMBOBOX_MONTH_CSS_SELECTOR)).sendKeys(month);
        getWebElement(By.cssSelector(COMBOBOX_YEAR_CSS_SELECTOR)).sendKeys(year);

    }

    public void completeAddressInformation(String company, String address, String city, String state, String zip, String country, String phone, String alias){
        completeField(By.cssSelector(COMPANY_INPUT_CSS_SELECTOR), company);
        completeField(By.cssSelector(ADDRESS_INPUT_CSS_SELECTOR), address);
        completeField(By.cssSelector(CITY_INPUT_CSS_SELECTOR), city);
        getWebElement(By.cssSelector(COMBOBOX_STATE_CSS_SELECTOR)).sendKeys(state);
        completeField(By.cssSelector(ZIP_INPUT_CSS_SELECTOR), zip);
        getWebElement(By.cssSelector(COMBOBOX_COUNTRY_CSS_SELECTOR)).sendKeys(country);
        completeField(By.cssSelector(MOBILE_INPUT_CSS_SELECTOR), phone);
        completeField(By.cssSelector(ALIAS_INPUT_CSS_SELECTOR), alias);

    }




}
