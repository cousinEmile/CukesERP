package com.cukeserp.step_definitions;

import com.cukeserp.utilities.Pages;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.Map;

import static com.cukeserp.utilities.ApplicationConstants.MINUS_ICON_CLASS;
import static com.cukeserp.utilities.ApplicationConstants.MYMEETINGS_SEARCHBARICON_LABEL;

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











}
