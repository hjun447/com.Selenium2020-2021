package com.VyTrack.StepDefinition;

import com.VyTrack.Pages.BasePage;
import com.VyTrack.utils.Driver;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TestNavigationStepDefinition {

    @Then("user clicks {string} module and {string} submodule")
    public void user_clicks_module_and_submodule(String string, String string2) {

        System.out.println("Module: " + string);
        System.out.println("Submodule: " + string2);
        Assert.assertEquals( string, Driver.get().getTitle());

    }

}
