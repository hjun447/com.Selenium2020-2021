package com.VyTrack.StepDefinition;

import com.VyTrack.Pages.*;
import com.VyTrack.utils.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

public class CreateCarStepDefinition extends BasePage {

    CreateCarPage createCarPage = new CreateCarPage();
    VehiclesPage vehiclesPage = new VehiclesPage();

    @Given("user logs in as store manager")
    public void user_logs_in_as_store_manager() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginWithRole("store manager");
        BrowserUtils.wait(4);
    }

    @Then("user click on {string} button")
    public void user_click_on_button(String string) {
        string = "Create Car";
        if (string.equals("Create Car")) {
            createCarPage.createCarBtn.click();

        }

        BrowserUtils.wait(3);
    }

    /*

      | License Plate | Driver      | Location        | Model Year | Color |
      | TestPlates    | Test Driver | Washington D.C. | 2020       | Black |

     */

    @Then("user adds new car information:")
    public void user_adds_new_car_information(List<Map<String, String>> dataTable) {
        System.out.println(dataTable);
        int row = 1;
        for (Map<String, String> map : dataTable) {
            createCarPage.licensePlateElement.sendKeys(map.get("License Plate"));
            BrowserUtils.wait(2);
            createCarPage.driverElement.sendKeys(map.get("Driver"));
            BrowserUtils.wait(2);
            createCarPage.locationElement.sendKeys(map.get("Location"));
            BrowserUtils.wait(2);
            createCarPage.modelYearElement.sendKeys(map.get("Model Year"));
            BrowserUtils.wait(2);
            createCarPage.colorElement.sendKeys(map.get("Color"));
            BrowserUtils.wait(2);
            createCarPage.saveAndCloseButtonElement.click();
            BrowserUtils.wait(2);

            if (row == dataTable.size()) {
                createCarPage.saveAndCloseButtonElement.click();
            } else {
                createCarPage.saveAndNewButtonElement.click();
            }

            BrowserUtils.wait(2);
            row++;

        }
    }
}
