package com.cukeserp.step_definitions;

import com.cukeserp.pages.CalendarPage;
import com.cukeserp.utilities.ApplicationConstants;
import com.cukeserp.utilities.BrowserUtils;
import com.cukeserp.utilities.Driver;
import com.cukeserp.utilities.Pages;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static com.cukeserp.utilities.ApplicationConstants.CALENDAR_PAGE_TITLE;

public class CalendarSteps implements ApplicationConstants {
    Pages pages = new Pages();

    @When("hover to the List option on the right top corner")
    public void hover_to_the_List_option_on_the_right_top_corner() {
        BrowserUtils.hover(pages.getCalendar().listView);
    }


    @Given("^I open \"([^\"]*)\" url$")
    public void iOpenUrl(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^\"([^\"]*)\" Title should be displayed \"([^\"]*)\"$")
    public void titleShouldBeDisplayed(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^\"([^\"]*)\" clicks \"([^\"]*)\" button$")
    public void clicksButton(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I log in as a \"([^\"]*)\" using \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iLogInAsAUsingAnd(String arg0, String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^page shows weekly view calender$")
    public void pageShowsWeeklyViewCalender() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
