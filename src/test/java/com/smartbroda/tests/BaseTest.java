package com.smartbroda.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.smartbroda.pages.LoginPage;
import com.smartbroda.pages.ToolsPage;
import com.smartbroda.utils.Utils;


public abstract class BaseTest {


    WebDriver driver;

    protected LoginPage loginPage;
    protected ToolsPage toolsPage;
    @BeforeTest
    public void setUp(){
        driver = Utils.getDriver();

        loginPage = new LoginPage(driver);
        toolsPage = new ToolsPage(driver);
    }
    @AfterTest
    public void tearDown(){
        try {
            Thread.sleep(Integer.parseInt(System.getProperty("sleep","2000")));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
