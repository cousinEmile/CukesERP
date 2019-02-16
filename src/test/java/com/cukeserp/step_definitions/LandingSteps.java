package com.cukeserp.step_definitions;

import com.cukeserp.utilities.ApplicationConstants;
import com.cukeserp.utilities.ConfigurationReader;
import com.cukeserp.utilities.Driver;
import com.cukeserp.utilities.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LandingSteps implements ApplicationConstants {
    Pages pages = new Pages();

    @Given("user on the First page")
    public void user_on_the_First_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
    }

    @Then("First page Title should be displayed {string}")
    public void first_page_Title_should_be_displayed(String actualTitle) {
        Assert.assertEquals(Driver.getDriver().getTitle(),actualTitle);
    }

    @When("user clicks Brite Erp Demo")
    public void user_clicks_Brite_Erp_Demo() {
        pages.getLandingPage().BriteErpDemo_button.click();
    }





}
