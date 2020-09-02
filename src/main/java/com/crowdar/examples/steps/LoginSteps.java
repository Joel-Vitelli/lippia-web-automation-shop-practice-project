package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.LoginPage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class LoginSteps extends PageSteps {

    @And("el cliente ingresa su password: (.*)")
    public void elClienteIngresaSuPasswordContraseña(String pass) {
        Injector._page(LoginPage.class).setPassword(pass);
    }
}