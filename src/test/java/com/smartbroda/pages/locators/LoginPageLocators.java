package com.smartbroda.pages.locators;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class LoginPageLocators {

    private By usernameLocator = By.id("username");
    private By passwordLocator = By.id("password");
    private By loginButtonLocator = By.id("enter");

//    public By getUsernameLocator() {
//        return usernameLocator;
//    }
//
//    public void setUsernameLocator(By usernameLocator) {
//        this.usernameLocator = usernameLocator;
//    }
//
//    public By getPasswordLocator() {
//        return passwordLocator;
//    }
//

//    public void setPasswordLocator(By passwordLocator) {
//        this.passwordLocator = passwordLocator;
//    }
//
//    public By getLoginButtonLocator() {
//        return loginButtonLocator;
//    }
//
//    public void setLoginButtonLocator(By loginButtonLocator) {
//        this.loginButtonLocator = loginButtonLocator;
//    }
}
