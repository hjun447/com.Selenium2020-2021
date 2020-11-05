package com.VyTrack.Basics;

import com.VyTrack.Pages.LoginPage;
import com.VyTrack.utils.ConfigurationReader;
import com.VyTrack.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNGDemo {


    @BeforeMethod
    public void setup() {
        System.out.println("Test setup");
        Driver.get().get(ConfigurationReader.getProperty("url"));
    }

    @Test(priority = 1)
    public void test() {
//       WebElement username = Driver.get().findElement(By.xpath("//div//input[@name='_username']")),
//               password = Driver.get().findElement(By.xpath("//div//input[@name = '_password']"));
//       username.sendKeys("storemanager85");
//       password.sendKeys("UserUser123", Keys.ENTER);

        LoginPage loginPage = new LoginPage();
        loginPage.loginWithRole("store_manager");
    }

    @Test(priority = 2)
    public void test2() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("user160", "UserUser123");

    }

    @AfterMethod
    public void teardown() {
        System.out.println("teardown");
        Driver.close();
    }

}
