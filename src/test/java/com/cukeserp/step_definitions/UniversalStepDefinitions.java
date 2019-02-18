package com.cukeserp.step_definitions;

import com.cukeserp.utilities.ApplicationConstants;
import com.cukeserp.utilities.BrowserUtils;
import com.cukeserp.utilities.Driver;
import com.cukeserp.utilities.Pages;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class UniversalStepDefinitions extends BrowserUtils {
    Pages pages = new Pages();

    @Then("{string} Title should be displayed {string}")
    public void title_should_be_displayed(String Title, String actualTitle) {
        BrowserUtils.waitUntilTitleEquals(10, actualTitle);
        Assert.assertEquals(Driver.getDriver().getTitle(), actualTitle);
    }

    @Then("url is {string}")
    public void url_is(String actualURL) {
        BrowserUtils.waitForURL(actualURL, 10);
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), actualURL);
    }

    //----------------------------------------------------------------------------------------------------------------------------------------------------------------
    @Then("manager clicks {string} button")
    public void manager_clicks_button(String actulButton) {

        switch (actulButton) {

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
            case "Don't Import":
                waitForClickablility(pages.getImportPage().messageForSelect, 10);
                pages.getImportPage().dontImportField.click();
                break;
            case "Active":
                waitForClickablility(pages.getImportPage().active, 10);
                pages.getImportPage().active.click();
                break;
            case "x button to delete Active":
                waitForClickablility(pages.getImportPage().xButton, 10);
                pages.getImportPage().xButton.click();
                break;
            case "7":
//                waitForClickablility(pages, 10);

                break;
            case "8":
//                waitForClickablility(pages, 10);

                break;
            case "9":
//                waitForClickablility(pages, 10);

                break;
            case "10":
//                waitForClickablility(pages, 10);

                break;
            case "11":
//                waitForClickablility(pages, 10);

                break;
            case "12":
//                waitForClickablility(pages, 10);

                break;

        }
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------

    @Then("manager should be able to see {string} button")
    public void manager_should_be_able_to_see_button(String actualButton) {
        switch (actualButton) {
            case "List":
                waitForVisibility(pages.getCalendar().listView, 10);
                Assert.assertEquals(pages.getCalendar().listView.getAttribute("data-original-title"), actualButton);
                break;
            case "Active":
                waitForVisibility(pages.getImportPage().active, 10);
                Assert.assertEquals(pages.getImportPage().active.getText(), actualButton);
                break;
            case "c":
//                waitForVisibility(, 10);

                break;
            case "d":
//                waitForVisibility(, 10)

                break;
            case "e":
//                waitForVisibility(, 10)

                break;

        }
    }

    //----------------------------------------------------------------------------------------------------------------------------------------------------------------
    @When("manager sendKeys {string} in {string}")
    public void manager_sendKeys_in(String loadFile, String buttonName) {

        switch (buttonName) {
            case "Upload line":
                pages.getImportPage().loadFile.sendKeys(System.getProperty("user.dir") + loadFile);
                break;


        }
    }


    @Then("manager should be able to {string} Message")
    public void manager_should_be_able_to_Message(String actualMessage) {

        switch (actualMessage) {
            case "see Map your columns to import":
                BrowserUtils.waitForVisibility(pages.getImportPage().mapYourColumnsToImport, 10);
                Assert.assertEquals(pages.getImportPage().mapYourColumnsToImport.getText(), actualMessage);
                break;
        }
    }

}
