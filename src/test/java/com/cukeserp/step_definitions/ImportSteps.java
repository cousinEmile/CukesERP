package com.cukeserp.step_definitions;

import com.cukeserp.utilities.BrowserUtils;
import com.cukeserp.utilities.Driver;
import com.cukeserp.utilities.Pages;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class ImportSteps {
    Pages pages = new Pages();

    @Then("Import page Title should be displayed {string}")
    public void import_page_Title_should_be_displayed(String actualTitle) {
        BrowserUtils.waitUntilTitleEquals(10, actualTitle);
        Assert.assertEquals(Driver.getDriver().getTitle(), actualTitle);
    }

    @Then("manager should be able to see Input line with {string} by default")
    public void manager_should_be_able_to_see_Input_line_with_by_default(String noFileChoosen) {
        Assert.assertEquals(pages.getImportPage().loadFileInputLine.getAttribute("placeholder"), noFileChoosen);
    }

    @Then("manager should be able to Type {string} to the Upload line - Fail")
    public void manager_should_be_able_to_Type_to_the_Upload_line_Fail(String inputFile) {
        pages.getImportPage().loadFileInputLine.sendKeys(System.getProperty("user.dir") + inputFile + Keys.ENTER);
    }

    @Then("manager should be able to see Uploaded file {string} - Fail")
    public void manager_should_be_able_to_see_Uploaded_file_Fail(String utilityXlsx) {
        Assert.assertEquals(pages.getImportPage().loadFileInputLine.getAttribute("placeholder"), utilityXlsx);
    }

    @When("manager should be able to click Load File Button and input {string} to the Upload line")
    public void manager_should_be_able_to_click_Load_File_Button_and_input_to_the_Upload_line(String loadFile) {
        pages.getImportPage().loadFile.sendKeys(System.getProperty("user.dir") + loadFile);
    }

    @Then("{string} should be displayed on the Input Line")
    public void should_be_displayed_on_the_Input_Line(String utilityXlsx) {
        Assert.assertEquals(pages.getImportPage().loadFileInputLine.getAttribute("value"), utilityXlsx);
    }

    @Then("manager should be able to see map your columns to import {string} Message")
    public void manager_should_be_able_to_see_map_your_columns_to_import_Message(String Message) {
        BrowserUtils.waitForVisibility(pages.getImportPage().mapYourColumnsToImport, 5);
        Assert.assertEquals(pages.getImportPage().mapYourColumnsToImport.getText(), Message);
    }
}

