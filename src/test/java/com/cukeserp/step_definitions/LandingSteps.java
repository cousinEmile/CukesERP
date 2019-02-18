package com.cukeserp.step_definitions;

import com.cukeserp.utilities.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LandingSteps extends BrowserUtils implements ApplicationConstants {
    Pages pages = new Pages();

    @Given("user on the Landing page")
    public void user_on_the_Landing_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
    }

    @When("user clicks {string} button")
    public void user_clicks_button(String actulButton) {
        waitForClickablility(pages.getLandingPage().BriteErpDemo_button,10);
        pages.getLandingPage().BriteErpDemo_button.click();
    }




}
