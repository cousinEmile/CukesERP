package com.cukeserp.step_definitions;

import com.cukeserp.pages.CalendarListViewPage;
import com.cukeserp.utilities.Driver;
import com.cukeserp.utilities.Pages;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CalendarListViewSteps {
    Pages pages = new Pages();

    @Then("List page should be displayed with {string}")
    public void list_page_should_be_displayed_with(String actualTitle) {
        Assert.assertEquals(Driver.getDriver().getTitle(), actualTitle);
    }

    @Then("url is {string}")
    public void url_is(String actualURL) {
       Assert.assertEquals(Driver.getDriver().getCurrentUrl(),actualURL);
    }
}
