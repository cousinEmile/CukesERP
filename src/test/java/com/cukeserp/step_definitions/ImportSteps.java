package com.cukeserp.step_definitions;

import com.cukeserp.utilities.BrowserUtils;
import com.cukeserp.utilities.Driver;
import com.cukeserp.utilities.Pages;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class ImportSteps {
    Pages pages = new Pages();



    @Then("Import page Title should be displayed {string}")
    public void import_page_Title_should_be_displayed(String actualTitle) {
        BrowserUtils.waitUntilTitleEquals(10, actualTitle);
        Assert.assertEquals(Driver.getDriver().getTitle(), actualTitle);
    }

}

