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


    @Given("user is on the Calendar page")
    public void user_is_on_the_Calendar_page() {
        Assert.assertEquals(Driver.getDriver().getTitle().trim(), CALENDAR_PAGE_TITLE);
    }


    @Then("Calendar page Title should be displayed {string}")
    public void calendar_page_Title_should_be_displayed (String actualTitle) {
        Assert.assertEquals(Driver.getDriver().getTitle(), actualTitle);
    }

    @When("hover to the {string} option on the right top corner")
    public void hover_to_the_option_on_the_right_top_corner(String listButton) {
        BrowserUtils.hover(pages.getCalendar().listView);
    }

    @Then("manager should be able to see {string} button")
    public void manager_should_be_able_to_see_button(String listButton) {
        Assert.assertEquals(pages.getCalendar().listView.getAttribute("data-original-title"), listButton);
    }

    @Then("manager clicks List button")
    public void manager_clicks_List_button() {
        pages.getCalendar().listView.click();
    }

}
