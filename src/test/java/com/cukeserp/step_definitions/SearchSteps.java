package com.cukeserp.step_definitions;

import com.cukeserp.utilities.Pages;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.it.Ma;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.cukeserp.utilities.BrowserUtils.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.cukeserp.utilities.ApplicationConstants.MINUS_ICON_CLASS;
import static com.cukeserp.utilities.ApplicationConstants.MYMEETINGS_SEARCHBARICON_LABEL;
import static com.cukeserp.utilities.BrowserUtils.waitForClickablility;

public class SearchSteps {
Pages pages = new Pages ();

@When ("the user clicks on the Magnifying Glass icon in the far right side of the search bar")
    public void the_user_clicks_on_the_Magnifying_Glass_icon_in_the_far_right_side_of_the_search_bar() {
        pages.getSearchPage ().MgniffierIcone.click ();
    }

    @Then ("user should see the icon in the Magnifying Glass change from a plus-sign to a minus-sign")
    public void user_should_see_the_icon_in_the_Magnifying_Glass_change_from_a_plus_sign_to_a_minus_sign() {
        Assert.assertEquals ( pages.getSearchPage ().magnifierIcon.getAttribute ( "class" ).trim (), MINUS_ICON_CLASS );
    }


    @Then("three new icons should be revealed below the Search Bar, Filters, Group By, and Favorites")
    public void three_new_icons_should_be_revealed_below_the_Search_Bar_and() {
        Assert.assertTrue ( pages.getSearchPage ().FilterButton.isDisplayed () );
        Assert.assertTrue (pages.getSearchPage ().GroupBy_button.isDisplayed ()  );
        Assert.assertTrue ( pages.getSearchPage ().Favorites_button.isDisplayed () );
    }

    @When("the user clicks on the Advanced Search icon titled Filters")
    public void the_user_clicks_on_the_Advanced_Search_icon_titled_Filters() {
        pages.getSearchPage ().FilterButton.click ();
    }


    @When("a drop down menu extends from the Filters icon with the given <options>")
    public void a_drop_down_menu_extends_from_the_Filters_icon_with_the_given_options( Map<String, String> options ) {


    }

    @When ("user clicks on the option My Meetings")
    public void user_clicks_on_the_option_My_Meetings() {
        pages.getSearchPage ().MyMeetings_filter.click ();
    }

    @Then("user should observe a new tag in the search bar labeled My Meetings")
    public void user_should_observe_a_new_tag_in_the_search_bar_labeled_My_Meetings() {
        Assert.assertTrue(pages.getSearchPage().MyMeetings_SearchBarIcon.isDisplayed());
        Assert.assertEquals(pages.getSearchPage().MyMeetings_Label_SearchBarIcon.getAttribute("innerText").trim(),MYMEETINGS_SEARCHBARICON_LABEL);
    }


    @And ( "I select Add Custom Filter" )
    public void iSelectAddCustomFilter ( ) {
        waitForClickablility(pages.getSearchPage ().FilterButton,15);
    pages.getSearchPage ().FilterButton.click ();
    pages.getSearchPage ().AddCustomFilter.click ();
        
    }



    @Then ( "I should see the following Custom Filter {string} displayed along with the corresponding {string}" )
    public void iShouldSeeTheFollowingCustomFilterDisplayedAlongWithTheCorresponding ( String arg0 , String arg1 ) {

        Select customFilters = new Select ( pages.getSearchPage ().CustomFilter_SelectElement);
        Select correspondingConditions = new Select(pages.getSearchPage ().CustomFilterBoolean_SelectElement);

        Map<String, List<WebElement>> addMe = new HashMap<> (  );

        for(WebElement a : customFilters.getOptions ()){

                addMe.put ( a.getText ().trim (), correspondingConditions.getOptions () );

        }

        System.out.println (addMe.size () );




//        List<WebElement> filters = customFilters.getOptions ();
//        List<WebElement> options = correspondingConditions.getOptions ();
//        Map<String, >



        //



//

//



    }



    @Then("user should send text into the the search box")
    public void userShouldSendTextIntoTheTheSearchBox() {
        pages.getSearchPage().SearchBox.sendKeys("Availabilty" + Keys.ENTER);
    }

    @Then("User should receive relevant results")
    public void userShouldReceiveRelevantResults() {
       Assert.assertEquals(pages.getSearchPage().MyEvents_Label_SearchBarIcon.getAttribute("innerText"),"Availabilty");

    }
    @When("User clicks on the Filter drop down menu")
    public void user_clicks_on_the_Filter_drop_down_menu() {
        pages.getSearchPage().FilterButton.click();
    }

    @Then("User should be able to see the Add Custom Filter")
    public void user_should_be_able_to_see_the_Add_Custom_Filter() {
    Assert.assertTrue(pages.getSearchPage().AddCustomFilter.isDisplayed());
    }

    @When("User clicks on the  Add Custom Filter")
    public void user_clicks_on_the_Add_Custom_Filter() {

    }

    @Then("User should be able to select any  from the drop down list")
    public void user_should_be_able_to_select_any_from_the_drop_down_list() {
       // pages.getSearchPage().
    }

    @Then("User should be abel to save his selected option")
    public void user_should_be_abel_to_save_his_selected_option() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
