package tests;

import org.testng.annotations.Test;
import utils.Utils;

public class LoginTests extends BaseTest {
    @Test
    public void loginTest(){
// Step 1 ACTION: Open our web application in the browser
        driver.get(Utils.getUrl());
    }
}