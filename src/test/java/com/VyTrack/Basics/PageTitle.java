package com.VyTrack.Basics;

import com.VyTrack.utils.ConfigurationReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageTitle {


    ConfigurationReader c = new ConfigurationReader();

    public WebDriver driver;

    public static void main(String[] args) {

        PageTitle t = new PageTitle();
        t.driver = new ChromeDriver();
    }


    @Test(description = "Verifying title", priority = 0)
    public void verifyTitle(String titlePage){
        titlePage = "Facebook - Log In or Sign Up";
        Assert.assertEquals(titlePage,titlePage,"Invalid Title");

    }

    public void identifyTitle(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        System.out.println("Title: " + driver.getTitle());

        if(driver.getTitle().equalsIgnoreCase("Facebook - Log In or Sign Up")){
            System.out.println("Test Success");
            driver.quit();
        }else{
            System.out.println("Test failed");
            driver.quit();
        }


    }

    public void waiting(int seconds){
        try{
            if(seconds >= 0){

                Thread.sleep(1000 * seconds);
            }else{
                this.exception("Invalid time configurator!");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public String exception(String msg){
        return msg;
    }
}
