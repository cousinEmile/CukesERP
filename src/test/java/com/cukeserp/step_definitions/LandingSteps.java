package com.cukeserp.step_definitions;

import com.cukeserp.utilities.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LandingSteps extends BrowserUtils implements ApplicationConstants {
    Pages pages = new Pages();

    @Given("I open {string} url")
    public void i_open_url(String url) {
        Driver.getDriver().get(url);

    }






}
