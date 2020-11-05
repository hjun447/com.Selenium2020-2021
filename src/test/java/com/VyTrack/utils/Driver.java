package com.VyTrack.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

/*
            in OOP we have design patterns:
                It's a proven for specific task
                One of the most popular design pattern for WebDriver in Selenium is SingleTon
                    SingleTon means single object of something for entire project
                           --> This Object will be static and we can ensure that all tests use same driver object
                                So we can create Test suits
                                Also whenever we need to use driver, we will just call it from Driver class.
                                The same driver will be used in every class
                                the alternative is to create a new driver for each class
 */

public class Driver {
    private static RemoteWebDriver driver;
    private static ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();
    // ThreadLocal class allows to create copy of WebDriver object per thread at run time. if we wouldn't use ThreadLocal,
    // WebDrivers would override each other.
    private Driver() {

    }

    public static RemoteWebDriver get() {
        if (driverPool == null) {
            String browserParamFromEnv = System.getProperty("browser");
            String browser = browserParamFromEnv == null ? ConfigurationReader.getProperty("browser") : browserParamFromEnv;
            //         String browser = ConfigurationReader.getProperty("browser");
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    break;
                case "chrome_headless":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver(new ChromeOptions().setHeadless(true)));
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "safari":
                    driver = new SafariDriver();
                    break;
                default:
                    //If browser type is wrong, stop tests and throw exception
                    throw new RuntimeException("Wrong Browser Type");
            }

        }
        return driver;
    }

    public static void close() {
        if (driver != null) {
            //close all browsers
            driver.quit();
            //destroy driver object
            driver = null;
        }

    }


}
