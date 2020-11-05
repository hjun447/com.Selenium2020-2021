package com.VyTrack.Pages;

import com.VyTrack.utils.BrowserUtils;
import com.VyTrack.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class FleetPage {

    @FindBy(css = "[title='Create Car']")
    public static WebElement createCarBtn;

    @FindBy(xpath = "//a//span[@class='grid-header-cell__label']")
    public WebElement vehiclesHeaderTitles;

    @FindBy(xpath = "//div[@class='control-group control-group-text']")
    public WebElement inputCreateVehicleContents;

    public static String getVehiclesHeaderTitles() {
        List<String> titles = new ArrayList<>();
        titles.add("License Plate");
        titles.add("Tags");
        titles.add("Driver");
        titles.add("Location");
        titles.add("Chassis Number");
        titles.add("Model Year");
        titles.add("Last Odometer");
        titles.add("Immatriculation Date");
        titles.add("First Contract Date");
        WebElement titleHeader = Driver.get().
                findElement(By.xpath("//a//span[@class='grid-header-cell__label' and normalize-space()='"+titles+"']"));
        String titleHeaderText = titleHeader.getText();

        return titleHeaderText;
    }




}
