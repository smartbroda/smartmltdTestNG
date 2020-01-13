package com.smartbroda.tests;

import com.smartbroda.utils.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTests extends BaseTest {

    @Test
    public void loginTest() {
// Step 1 ACTION: Open our web application in the browser
        driver.get(Utils.getUrl());
// Step 1 EXPECTED RESULT: check we're on the Login Page
        Assert.assertEquals(loginPage.getPageTitle(), "Login Page" , "The Login Page" +
                " didn't open, or the title text has changed");
// Step 2 ACTION: Enter Username and Password
        loginPage.enterUsername("tester");
        loginPage.enterPassword("letmein");
// Step 3 ACTION: Press the Login button
        loginPage.clickLoginButton();
// Step 3 EXPECTED RESULT: check that we're now on the Tools Page
        Assert.assertEquals(toolsPage.getPageTitle(), "Tools Page", "The Login Page" +
                "didn't open, or the title text has changed");
    }


    }


