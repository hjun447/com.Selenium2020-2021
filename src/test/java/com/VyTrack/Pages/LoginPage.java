package com.VyTrack.Pages;

import com.VyTrack.utils.ConfigurationReader;
import com.VyTrack.utils.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//according to page object model design
//we have to create corresponded page class
//for each page of application
//login page=login page class
//every page class will store webelemnts and methods related to that page
public class LoginPage extends BasePage {

    @FindBy(css = "input[id ='prependedInput']")//this line will initialize web element
    public WebElement userNameInput;
    @FindBy(css = "input[id ='prependedInput2']")//without @FindBy, webElement will be null
    public WebElement passwordInput;
    @FindBy(id = "_submit")
    public WebElement loginButton;
    @FindBy(css = "[class='alert alert-error']")
    public WebElement warningMessage;

    public LoginPage() {
        //it's mandatory if you want to use @FindBy annotation
        //this means LoginPage class
        //Driver.get() return webdriver object
        PageFactory.initElements(Driver.get(), this); //"this" is this current page object
    }

    /**
     * reusable login method
     * just call this method to login
     * provide username and password as parameters
     *
     * @param userName
     * @param password
     */
    public void login(String userName, String password) {
        userNameInput.sendKeys(userName);
        //Keys.ENTER to replace login click
        passwordInput.sendKeys(password, Keys.ENTER);
    }

    public void loginWithRole(String role) {

        String username = "";
        String passWord = ConfigurationReader.getProperty("password");
        switch (role) {
            case "driver":
                username = ConfigurationReader.getProperty("driver.username");
                break;
            case "store manager":
                username = ConfigurationReader.getProperty("store.manager.username");
                break;
            case "sales manager":
                username = ConfigurationReader.getProperty("sales.manager.username");
                break;
            default:
                throw new RuntimeException("Invalid role!");
        }

        login(username, passWord);
    }


}