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

    @Then("manager should be able to see Import button")
    public void manager_should_be_able_to_see_Import_button() {
        Assert.assertEquals(pages.getCalendarListViewPage().import_button.getText(),IMPORT_BUTTON);
    }


}
