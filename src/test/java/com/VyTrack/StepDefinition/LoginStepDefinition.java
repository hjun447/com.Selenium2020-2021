package com.VyTrack.StepDefinition;

import com.VyTrack.Pages.BasePage;
import com.VyTrack.Pages.LoginPage;
import com.VyTrack.utils.BrowserUtils;
import com.VyTrack.utils.ConfigurationReader;
import com.VyTrack.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Map;

public class LoginStepDefinition {
    LoginPage loginPage = new LoginPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.getProperty("url"));
    }

    @Then("user enters {string} username and {string} password")
    public void user_enters_username_and_password(String string, String string2) {
        loginPage.login(string, string2);
    }

    @Then("user enters {string} role to login")
    public void user_enters_role_to_login(String string) {
        loginPage.loginWithRole(string);
    }

    @Then("user logs in as driver with following credentials")
    public void user_logs_in_as_driver_with_following_credentials(Map<String, String> dataTable) {
        System.out.println("Username: " + dataTable.get("username"));
        System.out.println("Password: " + dataTable.get("password"));


        String username = dataTable.get("username");
        String password = dataTable.get("password");
        if (username.equals("user160") && password.equals("UserUser123")) {
            loginPage.login(username, password);
            System.out.println("Test Success!");
        } else {
            System.out.println("Test failed!");
        }
    }

    @Then("user verifies that {string} page subtitle is displayed")
    public void user_verifies_that_page_subtitle_is_displayed(String string) {
        BrowserUtils.wait(2);
        BasePage basePage = new BasePage();
        Assert.assertEquals("Invalid page sub title!",string, basePage.getPageSubTitle());
        BrowserUtils.wait(2);
        // Then user verifies that "All" page subtitle is displayed
    }

    @Then("user verifies correct page sub title")
    public void user_verifies_correct_page_sub_title() {
        BasePage basePage = new BasePage();
        System.out.println(basePage.getPageSubTitle());
        BrowserUtils.wait(3);

    }

    @Then("user logs in as {string}")
    public void user_logs_in_as(String role) {
        loginPage.loginWithRole(role);
        BrowserUtils.wait(2);
    }

    @Then("user logs out")
    public void user_logs_out() {
        Driver.close();
    }

    @When("user enters {string} input")
    public void user_enters_input(String string) {
        loginPage.loginWithRole(string);
    }

    @Then("the page title should be {string}")
    public void the_page_title_should_be(String title) {
        BrowserUtils.waitForPageTitle(title);
        Assert.assertEquals("title is incorrect", title, Driver.get().getTitle());

    }
}


