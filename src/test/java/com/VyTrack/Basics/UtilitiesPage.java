package com.VyTrack.Basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class UtilitiesPage {


    private WebDriver driver = new ChromeDriver();

    UtilitiesPage(){
        WebDriverManager.chromedriver().setup();
        PageFactory.initElements(driver, this);
    }
}
