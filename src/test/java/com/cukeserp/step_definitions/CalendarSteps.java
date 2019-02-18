package com.cukeserp.step_definitions;

import com.cukeserp.pages.CalendarPage;
import com.cukeserp.utilities.ApplicationConstants;
import com.cukeserp.utilities.BrowserUtils;
import com.cukeserp.utilities.Driver;
import com.cukeserp.utilities.Pages;
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





}
