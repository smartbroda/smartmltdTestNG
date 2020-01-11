package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utils {
    private static final String URL = System.getProperty("url",
            "http://linkedin.com");
    private static final String BROWSER = System.getProperty("browser", "chrome");
    public static String getUrl(){
        return URL;
    }
    public static WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/drivers/chromedriver");
//        System.setProperty("webdriver.gecko.driver",
//                "src/test/resources/drivers/geckodriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1366,768");
        switch (BROWSER.toUpperCase()) {
            case "CHROME":
                return new ChromeDriver(options);
            case "FIREFOX":
                return new FirefoxDriver(options);
            default:
                return new ChromeDriver(options);
        }
    }
}