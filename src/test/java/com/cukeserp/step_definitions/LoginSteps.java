package com.cukeserp.step_definitions;

import com.cukeserp.utilities.ApplicationConstants;
import com.cukeserp.utilities.ConfigurationReader;
import com.cukeserp.utilities.Driver;
import com.cukeserp.utilities.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginSteps implements ApplicationConstants {
    Pages pages = new Pages();

    @Then("Login page Title should be displayed {string}")
    public void login_page_Title_should_be_displayed(String actualTitle) {
        Assert.assertEquals(Driver.getDriver().getTitle(),actualTitle);
    }

    @When("{string} logs in using {string} and {string}")
    public void logs_in_using_and(String user, String email, String password) {
        pages.getLoginPage().emailBox.sendKeys(email);
        pages.getLoginPage().passwordBox.sendKeys(password);
        pages.getLoginPage().login_button.click();
    }


    @When("Inventory Manager {int} logs in using {string} and {string}")
    public void inventory_Manager_logs_in_using_and(Integer int1, String email, String password) {
        int1 = 2;
        pages.getLoginPage().emailBox.sendKeys(email);
        pages.getLoginPage().passwordBox.sendKeys(password);
        pages.getLoginPage().login_button.click();

    }






}
