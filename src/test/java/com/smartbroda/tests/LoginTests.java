package com.smartbroda.tests;

import com.smartbroda.utils.ExcelDataProvider;
import com.smartbroda.utils.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTests extends BaseTest {

    @Test(dataProvider = "testUsersExcel", dataProviderClass =
            ExcelDataProvider.class)
    public void loginTest(String username, String password) {
// Step 1 ACTION: Open our web application in the browser
        driver.get(Utils.getUrl());
// Step 1 EXPECTED RESULT: check we're on the Login Page
        Assert.assertEquals(loginPage.getPageTitle(), "Login Page" , "The Login Page" +
                " didn't open, or the title text has changed");
// Step 2 ACTION: Enter Username and Password
//        loginPage.enterUsername("tester");
//        loginPage.enterPassword("letmein");
// Step 2 ACTION: Enter Username and Password from excel spreadsheet
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
// Step 3 ACTION: Press the Login button
        loginPage.clickLoginButton();
// Step 3 EXPECTED RESULT: check that we're now on the Tools Page
        Assert.assertEquals(toolsPage.getPageTitle(), "Login Page", "The Login Page" +
                "didn't open, or the title text has changed");
        Utils.captureScreenshot(driver, "loggedIn.png");
        Utils.captureScreenshot(driver, "loggedIn2.png");
        Utils.captureScreenshot(driver, "loggedIn3.png");
//        Screenshots.captureScreenshot(driver, "loginPage" + Screenshots.generateScreenShotFileName());
    }


    }


