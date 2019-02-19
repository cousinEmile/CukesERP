package com.cukeserp.step_definitions;
import com.cukeserp.utilities.ApplicationConstants;
import com.cukeserp.utilities.BrowserUtils;
import com.cukeserp.utilities.Driver;
import com.cukeserp.utilities.Pages;
import com.cukeserp.utilities.seleniumcucumber.ClickElementsMethods;
import com.cukeserp.utilities.seleniumcucumber.SelectElementByType;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class ImportSteps extends BrowserUtils implements ApplicationConstants {
    Pages pages = new Pages();

    @But("manager should be able to Type {string} to the Upload line - Fail")
    public void manager_should_be_able_to_Type_to_the_Upload_line_Fail(String inputFile) {
    }

    @And("manager should be able to see Uploaded file {string} - Fail")
    public void manager_should_be_able_to_see_Uploaded_file_Fail(String utilityXlsx) {
        Assert.assertEquals(pages.getImportPage().loadFileInputLine.getAttribute("value"), utilityXlsx);
    }

    @Then("{string} should be displayed on the Input Line")
    public void should_be_displayed_on_the_Input_Line(String utilityXlsx) {
        Assert.assertEquals(pages.getImportPage().loadFileInputLine.getAttribute("value"), utilityXlsx);
    }

    @Then("verify Checkbox The first row contains the label of the column is selected by default")
    public void verify_Checkbox_The_first_row_contains_the_label_of_the_column_is_selected_by_default() {
        Assert.assertTrue(pages.getImportPage().theFirstRowLabel.isSelected());
    }

    @Then("verify Checkbox Show fields of relation fields is selected by default")
    public void verify_Checkbox_Show_fields_of_relation_fields_is_selected_by_default() {
        Assert.assertTrue(pages.getImportPage().showFields.isSelected());
    }

    @When("{string} Checkbox is not selected")
    public void checkbox_is_not_selected(String checkboxName) {
        waitForClickablility(pages.getImportPage().messageForSelect, 10);
        Assert.assertFalse(pages.getImportPage().showFields.isSelected());
    }


    }


