package com.cukeserp.step_definitions;

import com.cukeserp.pages.CalendarListViewPage;
import com.cukeserp.utilities.ApplicationConstants;
import com.cukeserp.utilities.BrowserUtils;
import com.cukeserp.utilities.Driver;
import com.cukeserp.utilities.Pages;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.applet.AppletContext;

public class CalendarListViewSteps implements ApplicationConstants {
    Pages pages = new Pages();


    @When("User clicks on Calendar tab")
    public void user_clicks_on_Calendar_tab() {
        // Write code here that turns the phrase above into concrete actions
        pages.getHeaderPage().calendar_button.click();
    }



}
