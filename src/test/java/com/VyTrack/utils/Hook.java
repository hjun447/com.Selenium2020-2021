package com.VyTrack.utils;

import com.VyTrack.utils.ConfigurationReader;
import com.VyTrack.utils.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import javax.security.auth.login.Configuration;

public class Hook {

    @BeforeMethod
    void setup(){
        System.out.println("Test setup");
        Driver.get().get(ConfigurationReader.getProperty("url"));

    }

    @AfterMethod
    void teardown(){
        Driver.close();
    }
}
