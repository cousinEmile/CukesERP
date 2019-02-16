package com.cukeserp.step_definitions;

import com.cukeserp.pages.CalendarListViewPage;
import com.cukeserp.utilities.BrowserUtils;
import com.cukeserp.utilities.Driver;
import com.cukeserp.utilities.Pages;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarListViewSteps {
    Pages pages = new Pages();

    @Then("List page Title should be displayed {string}")
    public void list_page_Title_should_be_displayed(String actualTitle) {
        Assert.assertEquals(Driver.getDriver().getTitle(), actualTitle);
    }

    @Then("url is {string}")
    public void url_is(String actualURL) {
        BrowserUtils.waitForURL(actualURL, 5);
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), actualURL);
    }

    @Then("manager should be able to see import {string} button")
    public void manager_should_be_able_to_see_import_button(String importButton) {
        Assert.assertEquals(pages.getCalendarListViewPage().import_button.getText(),importButton);
    }

    @When("manager clicks Import button")
    public void manager_clicks_Import_button() {
     pages.getCalendarListViewPage().import_button.click();
    }

}
