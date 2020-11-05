package com.VyTrack.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesPage extends BasePage {

    @FindBy(css = "input[name='oro_sales_opportunity_form[name]']")
    public WebElement opportunitiesNameInputElement;

    @FindBy(css = "div a[class='btn main-group btn-primary pull-right ']")
    public WebElement createOpportunityButtonElement;

    @FindBy(css = "button[class='btn btn-success action-button']")
    public WebElement saveAndCloseButtonElement;





}
