package com.cukeserp.step_definitions;

import com.cukeserp.utilities.BrowserUtils;
import com.cukeserp.utilities.Driver;
import com.cukeserp.utilities.Pages;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.He;
import org.junit.Assert;

import java.util.List;

public class InboxSteps {
    Pages pages = new Pages();


    @Then("Inbox page should be displayed with {string}")
    public void inbox_page_should_be_displayed_with(String actualTitle) {
        BrowserUtils.waitUntilTitleEquals(5, actualTitle);
        Assert.assertEquals(Driver.getDriver().getTitle(), actualTitle);
    }

    @Then("{string} name should be {string}")
    public void name_should_be(String user, String actualUser) {
        Assert.assertEquals(user, actualUser);
    }

    @Then("the manager should be able to see following Headers:")
    public void the_manager_should_be_able_to_see_following_Headers(List<String> Headers) {
        List<String> actualHeaders = BrowserUtils.getElementsText(pages.getInboxPage().allHeaders);
        Assert.assertEquals(Headers, actualHeaders);
    }

    @When("Click on Calendar icon on Headers")
    public void click_on_Calendar_icon_on_Headers() {
        pages.getHeaderPage().calendar_button.click();
    }


}
