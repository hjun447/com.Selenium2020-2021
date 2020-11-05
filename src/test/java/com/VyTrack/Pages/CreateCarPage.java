package com.VyTrack.Pages;

import com.VyTrack.utils.BrowserUtils;
import com.VyTrack.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateCarPage extends BasePage{

    @FindBy(css = "*[title='Create Car']")
    public WebElement createCarBtn;

    @FindBy(css = "div a[title='Cancel']")
    public WebElement cancelBtn;

    @FindBy(css = "div[class='controls'] input[id^='custom_entity_type_LicensePlate']")
    public WebElement licensePlateElement;

    @FindBy(name = "custom_entity_type[Driver]")
    public WebElement driverElement;

    @FindBy(name = "custom_entity_type[Location]")
    public WebElement locationElement;

    @FindBy(css = "[class='btn btn-success action-button']")
    public WebElement saveAndCloseButtonElement;

    @FindBy(xpath = "//*[normalize-space() ='Save and New' and @class ='main-group action-button dropdown-item']")
    public WebElement saveAndNewButtonElement;

    @FindBy(css = "div[id*='FuelType']")
    public WebElement fuelTypeElement;

    //if this locator doesn't work, use [id^='uniform-custom_entity_type_Logo_file'] > span[class='action']
    @FindBy(name = "custom_entity_type[Logo][file]")
    public WebElement logoElement;

    @FindBy(name = "custom_entity_type[ModelYear]")
    public WebElement modelYearElement;

    @FindBy(name = "custom_entity_type[Color]")
    public WebElement colorElement;

    @FindBy(css = "div[class='btn-group pull-right'] > a[data-toggle='dropdown']")
    public WebElement saveAndCloseToggle;

    /**
     * This method stands for selecting tags
     * Provide tag name to select
     * If checkbox already selected, it will not do anything
     *
     * @param tagName - represents name of tag that has to be selected, like Junior, Senior or Purchased
     * @return webelement of checkbox that was selected
     * <p>
     * CreateCarPage createCarPage = new CreateCarPage();
     * <p>
     * createCarPage.selectTags("Senior"); // Senior tag will be selected
     */
    public WebElement selectTags(String tagName) {
        //locator for checkbox is based on label name
        //label and checkbox are siblings
        String locator = "//label[text()='" + tagName + "']/preceding-sibling::input[@type='checkbox']";
        WebElement checkBox = Driver.get().findElement(By.xpath(locator));
        BrowserUtils.waitForVisibility(checkBox, 15);
        BrowserUtils.waitForClickablility(checkBox, 15);
        if (!checkBox.isSelected()) {
            checkBox.click();
        }
        return checkBox;
    }
    /**
     * Select fuel type by visible text
     *
     * @param fuelType - Diesel, Electric, Hybrid
     *  <p>
     *  usage: CreateCarPage createCarPage = new CreateCarPage();
     *  <p>
     *  to select gasoline type
     *  createCarPage.selectFuelType("Diesel"); - if you want to select Diesel as fuel type
     */
    public void selectFuelType(String fuelType) {
        String locator = "//div[@class='select2-result-label' and text()='" + fuelType + "']";
        BrowserUtils.waitForClickablility(fuelTypeElement, 15);
        fuelTypeElement.click();
        WebElement fuelTypeSelectionElement = Driver.get().findElement(By.xpath(locator));
        BrowserUtils.waitForClickablility(fuelTypeSelectionElement, 15);
        fuelTypeSelectionElement.click();
    }
    /**
     * This method will upload a file
     * File from your computer!
     * @param pathToTheFile that you want to upload
     */
    public void uploadLogo(String pathToTheFile){
        BrowserUtils.waitForVisibility(logoElement, 15);
        logoElement.sendKeys(pathToTheFile);
    }



    public static void inputCreateCarOptions(String elementText, String textInput) {
        String sendkeysLocator= "//div[@class='responsive-cell responsive-cell-no-blocks']//div//" +
                "div[@class='controls']//input[@name='custom_entity_type[" + elementText + "]']";

        WebElement element = Driver.get().findElement(By.xpath(sendkeysLocator));
        BrowserUtils.waitForVisibility(element, 10);
        BrowserUtils.waitForClickablility(element, 10);
        element.sendKeys(textInput);

    }

}
