package com.cukeserp.step_definitions;

import com.cukeserp.pages.CalendarPage;
import com.cukeserp.utilities.BrowserUtils;
import com.cukeserp.utilities.Driver;
import com.cukeserp.utilities.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static com.cukeserp.utilities.ApplicationConstants.CALENDAR_PAGE_TITLE;

public class CalendarSteps {
    Pages pages = new Pages();
    WebDriver driver;
    CalendarPage calendarPage;




    @Given ("user is on the Calendar page")
    public void user_is_on_the_Calendar_page() {
        Assert.assertEquals ( Driver.getDriver ( ).getTitle ().trim (), CALENDAR_PAGE_TITLE);
    }


    @Then("Calendar page should be displayed with {string}")
    public void calendar_page_should_be_displayed_with(String actualTitle) {
        Assert.assertEquals(Driver.getDriver().getTitle(),actualTitle);
    }

    @When("hover to the {string} option on the right top corner")
    public void hover_to_the_option_on_the_right_top_corner(String listButton) {
        BrowserUtils.hover(pages.getCalendar().listView);
    }

    @Then("the manager should be able to see {string} button")
    public void the_manager_should_be_able_to_see_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("click List button")
    public void click_List_button() {

    }

}
