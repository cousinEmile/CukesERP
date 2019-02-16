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


    @Then("Inbox page Title should be displayed {string}")
    public void inbox_page_Title_should_be_displayed(String actualTitle) {
        BrowserUtils.waitUntilTitleEquals(10, actualTitle);
        Assert.assertEquals(Driver.getDriver().getTitle(), actualTitle);
    }

    @Then("{string} name should be {string}")
    public void name_should_be(String user, String actualUser) {
        Assert.assertEquals(user, actualUser);
    }

    @Then("manager should be able to see following Headers:")
    public void manager_should_be_able_to_see_following_Headers(List<String> Headers) {
        List<String> actualHeaders = BrowserUtils.getElementsText(pages.getInboxPage().allHeaders);
        Assert.assertEquals(Headers, actualHeaders);
    }

    @When("manager clicks Calendar icon on Headers")
    public void manager_clicks_Calendar_icon_on_Headers() {
        pages.getHeaderPage().calendar_button.click();
    }


}
