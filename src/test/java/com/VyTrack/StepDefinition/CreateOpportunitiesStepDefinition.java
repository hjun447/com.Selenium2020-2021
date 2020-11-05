package com.VyTrack.StepDefinition;

import com.VyTrack.Pages.SalesPage;
import com.VyTrack.utils.BrowserUtils;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

public class CreateOpportunitiesStepDefinition {

    SalesPage salesPage = new SalesPage();
    @Then("user adds new car information")
    public void user_adds_new_car_information(List<Map<String, String>> dataTable) {
        for (Map<String, String> map : dataTable) {
           salesPage.opportunitiesNameInputElement.sendKeys(map.get("Opportunity Name"));
            BrowserUtils.wait(2);
        }
    }

    @Then("user click on {string} buttons")
    public void user_click_on_buttons(String string) {
        string = "Create Opportunity";
        if(string.equals("Create Opportunity")){
            salesPage.createOpportunityButtonElement.click();
        }

        BrowserUtils.wait(2);

    }

}
