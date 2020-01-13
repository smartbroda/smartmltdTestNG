package com.smartbroda.pages;

import com.smartbroda.pages.locators.ToolsPageLocators;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;

@RequiredArgsConstructor
public class ToolsPage {

    ToolsPageLocators toolsLocators = new ToolsPageLocators();

    @NonNull
    WebDriver driver;

    public String getPageTitle() {

        return driver.getTitle().toString();
    }
}
