package com.VyTrack.StepDefinition;

import com.VyTrack.Pages.BasePage;
import com.VyTrack.Pages.CalendarEventsPage;
import com.VyTrack.Pages.LoginPage;
import com.VyTrack.utils.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.Calendar;
import java.util.List;

public class CalendarEventsStepDefinition {

    @Given("user logs in as {string} role")
    public void user_logs_in_as_role(String string) {
        LoginPage loginPage = new LoginPage();
        loginPage.loginWithRole("store_manager");
    }

    @Then("user navigates to {string} then to {string}")
    public void user_navigates_to_then_to(String string, String string2) {
        BrowserUtils.wait(2);
        BasePage basePage = new BasePage();
        basePage.navigateTo(string, string2);
        BrowserUtils.wait(3);
    }

    //  And user verifies that column names are displayed
    //      | TITLE             |
    //      | CALENDAR          |
    //      | START             |
    //      | END               |
    //      | RECURRENT         |
    //      | RECURRENCE        |
    //      | INVITATION STATUS |

    CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

    @Then("user verifies that column names are displayed")
    public void user_verifies_that_column_names_are_displayed(List<String> dataTable) {
        System.out.println(dataTable);
        calendarEventsPage.waitUntilLoaderMaskDisappear();
        BrowserUtils.wait(3);
        Assert.assertEquals(dataTable, calendarEventsPage.getColumnNames());

    }
}
