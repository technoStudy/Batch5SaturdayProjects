package project13.groupSolutions.group1.utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
//            System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikiw\\Downloads\\chromedriver_win32\\chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", "D:/IntelliJ Projects/WebDrivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }
    public static void quitDriver(){
        driver.quit();
        if(driver != null){
            driver = null;
        }
    }

    private Driver(){
    }
}
