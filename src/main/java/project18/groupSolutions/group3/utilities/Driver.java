package project18.groupSolutions.group3.utilities;

import project18.groupSolutions.group3.enums.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {
    private static WebDriver driver;

    public static void setBrowser(Browser browser){
        switch (browser){
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case EDGE:
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            case SAFARI:
                WebDriverManager.safaridriver();
                driver = new SafariDriver();
                break;
            case CHROME:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
        }
    }

    public static WebDriver getDriver() {
        if (driver == null){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void quitDriver() {
        driver.quit();
        if (driver != null) {
            driver = null;
        }
    }

    private Driver() {
    }
}

