package com.cukeserp.step_definitions;

import com.cukeserp.utilities.ApplicationConstants;
import com.cukeserp.utilities.BrowserUtils;
import com.cukeserp.utilities.Driver;
import com.cukeserp.utilities.Pages;
import com.cukeserp.utilities.seleniumcucumber.ClickElementsMethods;
import com.cukeserp.utilities.seleniumcucumber.SelectElementByType;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class ImportSteps implements ApplicationConstants {
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
        Assert.assertEquals(pages.getImportPage().loadFileInputLine.getAttribute("value"), utilityXlsx);
    }

    @When("manager should be able to click Load File Button and input {string} to the Upload line")
    public void manager_should_be_able_to_click_Load_File_Button_and_input_to_the_Upload_line(String loadFile) {
        pages.getImportPage().loadFile.sendKeys(System.getProperty("user.dir") + loadFile);
    }

    @Then("{string} should be displayed on the Input Line")
    public void should_be_displayed_on_the_Input_Line(String utilityXlsx) {
        Assert.assertEquals(pages.getImportPage().loadFileInputLine.getAttribute("value"), utilityXlsx);
    }

    @Then("manager should be able to see Map your columns to import Message")
    public void manager_should_be_able_to_see_Map_your_columns_to_import_Message() {
        BrowserUtils.waitForVisibility(pages.getImportPage().mapYourColumnsToImport, 5);
        Assert.assertEquals(pages.getImportPage().mapYourColumnsToImport.getText(), MAP_YOUR_COULMS_TO_IMPORT);
    }

    @Then("manager should be able to see The first row contains the label of the column Checkbox")
    public void manager_should_be_able_to_see_The_first_row_contains_the_label_of_the_column_Checkbox() {
        Assert.assertEquals(pages.getImportPage().theFirstRowLabelText.getText(), THE_FIRST_ROW_CONTAINS);
    }

    @Then("verify Checkbox The first row contains the label of the column is selected by default")
    public void verify_Checkbox_The_first_row_contains_the_label_of_the_column_is_selected_by_default() {
        Assert.assertTrue(pages.getImportPage().theFirstRowLabel.isSelected());
    }

    @Then("manager clicks The first row contains the label of the column Checkbox")
    public void manager_clicks_The_first_row_contains_the_label_of_the_column_Checkbox() {
        pages.getImportPage().theFirstRowLabel.click();
    }

    @Then("manager should be able to see Show fields of relation fields Checkbox")
    public void manager_should_be_able_to_see_Show_fields_of_relation_fields_Checkbox() {
       Assert.assertEquals(pages.getImportPage().showFieldsText.getText(),SHOW_FIELDS_OF_RELATION);
    }

    @Then("verify Checkbox Show fields of relation fields is selected by default")
    public void verify_Checkbox_Show_fields_of_relation_fields_is_selected_by_default() {
        Assert.assertTrue(pages.getImportPage().showFields.isSelected());
    }

    @Then("manager clicks Show fields of relation fields Checkbox")
    public void manager_clicks_Show_fields_of_relation_fields_Checkbox() {
        pages.getImportPage().showFields.click();
    }

    @When("Show fields of relation fields Checkbox is not selected")
    public void show_fields_of_relation_fields_Checkbox_is_not_selected() {
        Assert.assertFalse(pages.getImportPage().showFields.isSelected());
    }

    @Then("manager clicks on Don't Import")
    public void manager_clicks_on_Don_t_Import() {
        BrowserUtils.waitForVisibility(pages.getImportPage().messageForSelect, 4);
        pages.getImportPage().dontImportField.click();
    }

    @Then("manager should be able to see Start Date")
    public void manager_should_be_able_to_see_Start_Date() {
        Assert.assertEquals(pages.getImportPage().startDate.getText(), START_DATE);
    }

    @Then("manager clicks Start Date on the selective panel")
    public void manager_clicks_Start_Date_on_the_selective_panel() {
        WebElement start = pages.getImportPage().startDate;
        BrowserUtils.waitForClickablility(start,2);
        start.click();
    }

    @Then("manager should be able to see Repeat Until")
    public void manager_should_be_able_to_see_Repeat_Until() {
        String repeat = pages.getImportPage().repeatUntil.getText();
        System.out.println(repeat);
        Assert.assertEquals(pages.getImportPage().repeatUntil.getText(), REPEAT_UNTIL);
    }

    @Then("manager clicks Repeat Until on the selective panel")
    public void manager_clicks_Repeat_Until_on_the_selective_panel() {
        WebElement repeat = pages.getImportPage().repeatUntil;
        BrowserUtils.waitForClickablility(repeat,3);
        repeat.click();
    }

    @Then("manager should be able to see End Date")
    public void manager_should_be_able_to_see_End_Date() {
        String end  = pages.getImportPage().endDate.getText();
        System.out.println("aa" +end);
        Assert.assertEquals(pages.getImportPage().endDate.getText(), END_DATE);
    }

    @Then("manager clicks End Date on the selective panel")
    public void manager_clicks_End_Date_on_the_selective_panel() {
        WebElement end = pages.getImportPage().endDate;
        BrowserUtils.waitForClickablility(end,4);
        end.click();

    }




}

