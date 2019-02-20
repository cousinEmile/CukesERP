package com.cukeserp.step_definitions;

import com.cukeserp.utilities.ApplicationConstants;
import com.cukeserp.utilities.BrowserUtils;
import com.cukeserp.utilities.Driver;
import com.cukeserp.utilities.Pages;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.Map;

import static com.cukeserp.utilities.ApplicationConstants.*;

public class UniversalStepDefinitions extends BrowserUtils {
    Pages pages = new Pages();

    @Then("{string} Title should be displayed {string}")
    public void title_should_be_displayed(String Title, String actualTitle) {
        waitUntilTitleEquals(10, actualTitle);
        Assert.assertEquals(Driver.getDriver().getTitle(), actualTitle);
//        System.out.println(Driver.getDriver().getTitle());
    }

    @Then("url is {string}")
    public void url_is(String actualURL) {
        waitForURL(actualURL, 10);
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), actualURL);
        //  System.out.println(Driver.getDriver().getCurrentUrl());
    }

    @When("{string} switchs page to {string}")
    public void switchs_page_to(String actualUserName, String secondPage) {
        switchToWindow(secondPage);
    }


    //----------------------------------------------------------------------------------------------------------------------------------------------------------------

    @Then("{string} clicks {string} button")
    public void clicks_button(String actualUserName, String actualButton) {

        switch (actualButton) {

            case "BriteErpDemo":
                waitForClickablility(pages.getLandingPage().BriteErpDemo_button, 10);
                pages.getLandingPage().BriteErpDemo_button.click();
                break;
            case "Calendar":
                waitForClickablility(pages.getHeaderPage().calendar_button, 10);
                pages.getHeaderPage().calendar_button.click();
                break;
            case "List":
                waitForClickablility(pages.getCalendar().listView, 10);
                pages.getCalendar().listView.click();
                break;
            case "Import on Calendar Page":
                waitForClickablility(pages.getCalendarListViewPage().import_button, 10);
                pages.getCalendarListViewPage().import_button.click();
                break;
            case "Active":
                waitForClickablility(pages.getImportPage().active, 10);
                pages.getImportPage().active.click();
                break;
            case "x button to delete Active":
                waitForClickablility(pages.getImportPage().xButton, 10);
                pages.getImportPage().xButton.click();
                break;
            case "Help":
                waitForClickablility(pages.getImportPage().helpButton, 10);
                pages.getImportPage().helpButton.click();
                break;
            case "Test Import":
                waitForClickablility(pages.getImportPage().testImportButton, 10);
                pages.getImportPage().testImportButton.click();
                break;
            case "Import on Import a File Page":
                waitForClickablility(pages.getImportPage().importButtonToImportFile, 10);
                pages.getImportPage().importButtonToImportFile.click();
                break;
            case "Cancel":
                waitForClickablility(pages.getImportPage().cancelButton, 10);
                pages.getImportPage().cancelButton.click();
                break;
            case "The first row contains the label of the column":
                waitForClickablility(pages.getImportPage().theFirstRowLabel, 10);
                pages.getImportPage().theFirstRowLabel.click();
                break;
            case "Copy the full error to clipboard":
                waitForClickablility(pages.getImportPage().copyTheFullErrorToClipboardButton, 10);
                pages.getImportPage().copyTheFullErrorToClipboardButton.click();
                break;
            case "see details":
                waitForClickablility(pages.getImportPage().seeDetailsButton, 10);
                pages.getImportPage().seeDetailsButton.click();
                break;
            case "Ok":
                waitForClickablility(pages.getImportPage().seeDetailsButton, 10);
                pages.getImportPage().errorMessageOkButton.click();
                break;
        }
    }
    //----------------------------------------------------------------------------------------------------------------------------------------------------------------

    @Then("{string} should be able to see {string} button")
    public void should_be_able_to_see_button(String actualUserName, String actualButton) {
        switch (actualButton) {
            case "List":
                waitForVisibility(pages.getCalendar().listView, 10);
                Assert.assertEquals(pages.getCalendar().listView.getAttribute("data-original-title"), actualButton);
                break;
            case "Active":
                waitForVisibility(pages.getImportPage().active, 10);
                Assert.assertEquals(pages.getImportPage().active.getText(), actualButton);
                break;
            case "Import":
                waitForVisibility(pages.getCalendarListViewPage().import_button, 10);
                Assert.assertEquals(pages.getCalendarListViewPage().import_button.getText(), actualButton);
                break;
            case "Reload file":
                waitForVisibility(pages.getImportPage().reloadFile, 10);
                Assert.assertEquals(pages.getImportPage().reloadFile.getText(), actualButton);
                break;
            case "Help":
                waitForVisibility(pages.getImportPage().helpButton, 10);
                Assert.assertEquals(pages.getImportPage().helpButton.getText(), actualButton);
                break;
            case "Test Import":
                waitForVisibility(pages.getImportPage().testImportButton, 10);
                Assert.assertEquals(pages.getImportPage().testImportButton.getText(), actualButton);
                break;
            case "Import on Import a File Page":
                waitForVisibility(pages.getImportPage().importButtonToImportFile, 10);
                Assert.assertEquals(pages.getImportPage().importButtonToImportFile.getText(), ApplicationConstants.IMPORT_BUTTON);
                break;
            case "Cancel":
                waitForVisibility(pages.getImportPage().cancelButton, 10);
                Assert.assertEquals(pages.getImportPage().cancelButton.getText(), actualButton);
                break;
            case "Copy the full error to clipboard":
                waitForVisibility(pages.getImportPage().copyTheFullErrorToClipboardButton, 10);
                Assert.assertEquals(pages.getImportPage().copyTheFullErrorToClipboardButton.getText(), actualButton);
                break;
            case "see details":
                waitForVisibility(pages.getImportPage().seeDetailsButton, 10);
                wait(3);
                System.out.println(pages.getImportPage().seeDetailsButton.getText());
                Assert.assertEquals(pages.getImportPage().seeDetailsButton.getText(), actualButton);
                break;
            case "Ok":
                waitForVisibility(pages.getImportPage().errorMessageOkButton, 10);
                Assert.assertEquals(pages.getImportPage().errorMessageOkButton.getText(), actualButton);
                break;

        }
    }

    //----------------------------------------------------------------------------------------------------------------------------------------------------------------
    @Then("{string} should be able to see {string} Message")
    public void should_be_able_to_see_Message(String actualUserName, String actualMessage) {

        switch (actualMessage) {
            case "Map your columns to import":
                waitForVisibility(pages.getImportPage().mapYourColumnsToImport, 10);
                Assert.assertEquals(pages.getImportPage().mapYourColumnsToImport.getText(), actualMessage);
                break;
            case "How to import data into Odoo":
                waitForVisibility(pages.getHelpPage().howToImportDataToOdoMessage, 10);
                Assert.assertEquals(pages.getHelpPage().howToImportDataToOdoMessage.getText(), actualMessage);
                break;
            case "You must configure at least one field to import":
                waitForVisibility(pages.getImportPage().youMustConfigureAtLeastOneFieldToImportErrorMessage, 10);
                wait(1);
                Assert.assertEquals(pages.getImportPage().youMustConfigureAtLeastOneFieldToImportErrorMessage.getText(), actualMessage);
                break;
            case "Odoo Client Error":
                waitForVisibility(pages.getImportPage().odooClientErrorMessage, 10);
                Assert.assertEquals(pages.getImportPage().odooClientErrorMessage.getText(), actualMessage);
                break;
            case "Please use the copy button to report the error to your support service.":
                waitForVisibility(pages.getImportPage().pleasuUseCopyButtonMessage, 10);
                Assert.assertEquals(pages.getImportPage().pleasuUseCopyButtonMessage.getText(), actualMessage);
                break;
            case "Uncaught event settings_changed inappropriate in current state previewing":
                waitForVisibility(pages.getImportPage().uncaughtEventSettingsChanged, 10);
                Assert.assertEquals(pages.getImportPage().uncaughtEventSettingsChanged.getText(), actualMessage);
                break;

        }
    }
    //----------------------------------------------------------------------------------------------------------------------------------------------------------------

    @Then("{string} should be able to see {string} message by default in {string}")
    public void should_be_able_to_see_message_by_default_in(String actualUserName, String actualMessage, String buttonName) {

        switch (buttonName) {
            case "Input line":
                Assert.assertEquals(pages.getImportPage().loadFileInputLine.getAttribute("placeholder"), actualMessage);
                break;

        }
    }

    //----------------------------------------------------------------------------------------------------------------------------------------------------------------

    @When("{string} sendKeys {string} in {string}")
    public void sendKeys_in(String actualUserName, String loadFile, String buttonName) {

        switch (buttonName) {
            case "Load File":
                pages.getImportPage().loadFile.sendKeys(System.getProperty("user.dir") + loadFile);
                break;
            case "Input line":
                pages.getImportPage().loadFileInputLine.sendKeys(System.getProperty("user.dir") + loadFile + Keys.ENTER);
                break;
            case "Reload File":
                pages.getImportPage().reloadFile.sendKeys(System.getProperty("user.dir") + loadFile + Keys.ENTER);
                break;

        }
    }

    //----------------------------------------------------------------------------------------------------------------------------------------------------------------

    @Then("{string} should be able to see {string} Checkbox")
    public void should_be_able_to_see_Checkbox(String actualUserName, String checkboxName) {

        switch (checkboxName) {
            case "Show fields of relation fields (advanced)":
                waitForVisibility(pages.getImportPage().showFields, 10);
                Assert.assertEquals(pages.getImportPage().showFieldsText.getText(), checkboxName);
                break;
            case "The first row contains the label of the column":
                Assert.assertEquals(pages.getImportPage().theFirstRowLabelText.getText(), checkboxName);
                break;
        }
    }

    //----------------------------------------------------------------------------------------------------------------------------------------------------------------

    @Then("{string} clicks {string} Checkbox")
    public void clicks_Checkbox(String actualUserName, String checkboxName) {

        switch (checkboxName) {
            case "Show fields of relation fields (advanced)":
                waitForClickablility(pages.getImportPage().messageForSelect, 10);
                pages.getImportPage().showFields.click();
                break;
            case "The first row contains the label of the column":
                waitForClickablility(pages.getImportPage().messageForSelect, 10);
                pages.getImportPage().theFirstRowLabel.click();
                break;
        }
    }

    //----------------------------------------------------------------------------------------------------------------------------------------------------------------

    @Then("{string} should be able to see {string}")
    public void should_be_able_to_see(String actualUserName, String selectName) {

        switch (selectName){
            case "Start Date":
                Assert.assertEquals(pages.getImportPage().startDate.getText(), selectName);
                break;
            case "Repeat Until":
                Assert.assertEquals(pages.getImportPage().repeatUntil.getText(), selectName);
                break;
            case "End Date":
                 Assert.assertEquals(pages.getImportPage().endDate.getText(), selectName);
                 break;
            case "Dot":
                Assert.assertEquals(pages.getImportPage().dot.getText(), selectName);
                break;
            case "Semicolon":
                Assert.assertEquals(pages.getImportPage().semicolon.getText(), selectName);
                break;
            case "Utility":
                Assert.assertEquals(pages.getImportPage().fileName.getText(), selectName);
                break;
            case "windows-1252":
                Assert.assertEquals(pages.getImportPage().windows1252.getText(), selectName);
                break;
        }
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------

    @Then("{string} clicks {string} on the selective panel")
    public void clicks_on_the_selective_panel(String actualUserName, String selectName) {

        switch (selectName){
            case "Start Date":
                WebElement start = pages.getImportPage().startDate;
                BrowserUtils.waitForClickablility(start,2);
                start.click();
                break;
            case "Repeat Until":
                WebElement repeat = pages.getImportPage().repeatUntil;
                BrowserUtils.waitForClickablility(repeat,3);
                repeat.click();
                break;
            case "End Date":
                WebElement end = pages.getImportPage().endDate;
                BrowserUtils.waitForClickablility(end,4);
                end.click();
                break;
            case "Dot":
                pages.getImportPage().dot.click();
                break;
            case "Semicolon":
                pages.getImportPage().semicolon.click();
                break;
            case "windows-1252":
                pages.getImportPage().windows1252.click();
                break;

        }
    }

//----------------------------------------------------------------------------------------------------------------------------------------------------------------

    @Then("{string} should be able to see {string} field")
    public void should_be_able_to_see_field(String actualUserName, String fieldName) {
        switch (fieldName) {
            case "Thousands Separator:" :
                Assert.assertEquals(pages.getImportPage().thousandsSeparatorText.getText(),fieldName);
                break;
            case "Separator:" :
                Assert.assertEquals(pages.getImportPage().separatorText.getText(), fieldName);
                break;
            case "Encoding:" :
                Assert.assertEquals(pages.getImportPage().encodingText.getText(), fieldName);
                break;

        }}

//----------------------------------------------------------------------------------------------------------------------------------------------------------------



    @When("{string} clicks {string} select button")
    public void clicks_select_button(String actualUserName, String selectButtonName) {
        switch (selectButtonName){
            case "Thousands Separator":
                pages.getImportPage().thousandsSeparatorButton.click();
                break;
            case "Don't Import":
                waitForClickablility(pages.getImportPage().messageForSelect, 10);
                pages.getImportPage().dontImportField.click();
                break;
            case "Separator":
                pages.getImportPage().separatorButton.click();
                break;
            case "Encoding":
                pages.getImportPage().encodingButton.click();
                break;
            }




}}