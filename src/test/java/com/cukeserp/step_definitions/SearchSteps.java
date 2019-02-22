package com.cukeserp.step_definitions;

import com.cukeserp.utilities.BrowserUtils;
import com.cukeserp.utilities.ConfigurationReader;
import com.cukeserp.utilities.Pages;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.cukeserp.utilities.ApplicationConstants.*;
import static com.cukeserp.utilities.BrowserUtils.waitForClickablility;
import static com.cukeserp.utilities.BrowserUtils.waitUntilTitleEquals;

public class SearchSteps {
    private final Pages pages = new Pages ( );

    @When ( "the user clicks on the Magnifying Glass icon in the far right side of the search bar" )
    public void the_user_clicks_on_the_Magnifying_Glass_icon_in_the_far_right_side_of_the_search_bar ( ) {
        pages.getSearchPage ( ).MgniffierIcone.click ( );
    }

    @Then ( "user should see the icon in the Magnifying Glass change from a plus-sign to a minus-sign" )
    public void user_should_see_the_icon_in_the_Magnifying_Glass_change_from_a_plus_sign_to_a_minus_sign ( ) {
        Assert.assertEquals ( pages.getSearchPage ( ).magnifierIcon.getAttribute ( "class" ).trim ( ) , MINUS_ICON_CLASS );
    }


    @Then ( "three new icons should be revealed below the Search Bar, Filters, Group By, and Favorites" )
    public void three_new_icons_should_be_revealed_below_the_Search_Bar_and ( ) {
        Assert.assertTrue ( pages.getSearchPage ( ).FilterButton.isDisplayed ( ) );
        Assert.assertTrue ( pages.getSearchPage ( ).GroupBy_button.isDisplayed ( ) );
        Assert.assertTrue ( pages.getSearchPage ( ).Favorites_button.isDisplayed ( ) );
    }

    @When ( "the user clicks on the Advanced Search icon titled Filters" )
    public void the_user_clicks_on_the_Advanced_Search_icon_titled_Filters ( ) {
        pages.getSearchPage ( ).FilterButton.click ( );
    }


    @When ( "user clicks on the option My Meetings" )
    public void user_clicks_on_the_option_My_Meetings ( ) {
        pages.getSearchPage ( ).MyMeetings_filter.click ( );
    }

    @Then ( "user should observe a new tag in the search bar labeled My Meetings" )
    public void user_should_observe_a_new_tag_in_the_search_bar_labeled_My_Meetings ( ) {
        Assert.assertTrue ( pages.getSearchPage ( ).MyMeetings_SearchBarIcon.isDisplayed ( ) );
        Assert.assertEquals ( pages.getSearchPage ( ).MyMeetings_Label_SearchBarIcon.getAttribute ( "innerText" ).trim ( ) , MYMEETINGS_SEARCHBARICON_LABEL );
    }


    @And ( "I select Add Custom Filter" )
    public void iSelectAddCustomFilter ( ) {
        BrowserUtils.wait ( 5 );
        waitForClickablility ( pages.getSearchPage ( ).FilterButton , 15 );
        pages.getSearchPage ( ).FilterButton.click ( );
        pages.getSearchPage ( ).AddCustomFilter.click ( );

    }


    @Then ( "I should see the following Custom Filter {string} displayed along with the corresponding {string}" )
    public void iShouldSeeTheFollowingCustomFilterDisplayedAlongWithTheCorresponding ( String arg0 , String arg1 ) {

        Select customFilters = new Select ( pages.getSearchPage ( ).CustomFilter_SelectElement );
        Select correspondingConditions = new Select ( pages.getSearchPage ( ).CustomFilterBoolean_SelectElement );

        Map<String, List<WebElement>> addMe = new HashMap<> ( );

        for (WebElement a : customFilters.getOptions ( )) {
            a.click ( );
            BrowserUtils.wait ( 1 );
            addMe.put ( a.getText ( ).trim ( ) , correspondingConditions.getOptions ( ) );
            for (WebElement b : addMe.get ( "Active" )) {
                System.out.println ( b.getText ( ).trim ( ) );

            }

        }

        for (WebElement b : addMe.get ( "Activities" )) {
            System.out.println ( b.getText ( ).trim ( ) );
        }
        for (WebElement b : addMe.get ( "All Day" )) {
            System.out.println ( b.getText ( ).trim ( ) );
        }


    }

    @Given ( "user is on the Calendar page" )
    public void userIsOnTheCalendarPage ( ) {
        pages.getLoginPage ( ).emailBox.sendKeys ( ConfigurationReader.getProperties ( "user" ) );
        pages.getLoginPage ( ).passwordBox.sendKeys ( ConfigurationReader.getProperties ( "userpass" ) );
        pages.getLoginPage ( ).login_button.click ( );
        waitUntilTitleEquals ( 15 , DISCUSS_PAGE_TITLE );
        pages.getHeaderPage ( ).calendar_button.click ( );
    }

    @When ( "the user clicks on the Advanced Search icon titled Filters and selects My Events" )
    public void theUserClicksOnTheAdvancedSearchIconTitledFiltersAndSelectsMyEvents ( ) {
        pages.getSearchPage ( ).FilterButton.click ( );
        pages.getSearchPage ( ).MyEvents_filter.click ( );

    }

    @Then ( "user should observe a new tag in the search bar labeled My Events" )
    public void userShouldObserveANewTagInTheSearchBarLabeledMyEvents ( ) {
        Assert.assertTrue ( pages.getSearchPage ( ).MyEvents_SearchBarIcon.isDisplayed ( ) );

    }

    @When ( "the user clicks on the Advanced Search icon titled Filters and selects Unread Messages" )
    public void theUserClicksOnTheAdvancedSearchIconTitledFiltersAndSelectsUnreadMessages ( ) {
        pages.getSearchPage ( ).FilterButton.click ( );
        pages.getSearchPage ( ).UnreadMessages_filter.click ( );


    }

    @Then ( "user should observe a new tag in the search bar labeled Unread Messages" )
    public void userShouldObserveANewTagInTheSearchBarLabeledUnreadMessages ( ) {
        Assert.assertTrue ( pages.getSearchPage ( ).UnreadMessages_SearchBarIcon.isDisplayed ( ) );

    }

    @When ( "the user clicks on the Advanced Search icon titled Group By" )
    public void theUserClicksOnTheAdvancedSearchIconTitledGroupBy ( ) {
        pages.getSearchPage ( ).GroupBy_button.click ( );

    }

    @Then ( "user should observe a new tag in the search bar labeled Responsible" )
    public void userShouldObserveANewTagInTheSearchBarLabeledResponsible ( ) {
        Assert.assertTrue ( pages.getSearchPage ( ).Responsible_Label_SearchBarIcon.isDisplayed ( ) );

    }

    @When ( "the user clicks on the Advanced Search icon titled Group By and selects Privacy" )
    public void theUserClicksOnTheAdvancedSearchIconTitledGroupByAndSelectsPrivacy ( ) {
        pages.getSearchPage ( ).GroupBy_button.click ( );
        pages.getSearchPage ( ).groupPrivacy_button.click ( );

    }

    @Then ( "user should observe a new tag in the search bar labeled Privacy" )
    public void userShouldObserveANewTagInTheSearchBarLabeledPrivacy ( ) {
        Assert.assertTrue ( pages.getSearchPage ( ).Privacy_Label_SearchBarIcon.isDisplayed ( ) );

    }





        @Then ( "I should see the given {string} as the value of a <tag> in the search bar" )
        public void iShouldSeeTheGivenTermAsTheValueOfATagInTheSearchBar (String term) {
        Assert.assertEquals ( pages.getSearchPage ().searchTermTag.getAttribute ("innerText").trim(), term );


        }
//        System.out.println (addMe.size () );


//        List<WebElement> filters = customFilters.getOptions ();
//        List<WebElement> options = correspondingConditions.getOptions ();
//        Map<String, >


        //


//

//




    @Then ( "the default {string} should be displayed and enabled" )
    public void theDefaultShouldBeDisplayedAndEnabled ( String filters ) {
        switch (filters) {
            case "My Events":
                Assert.assertTrue ( pages.getSearchPage ( ).MyEvents_filter.isDisplayed ( ) );
                Assert.assertTrue ( pages.getSearchPage ( ).MyEvents_filter.isEnabled ( ) );
                break;
            case "My Meetings":
                Assert.assertTrue ( pages.getSearchPage ( ).MyMeetings_filter.isDisplayed ( ) );
                Assert.assertTrue ( pages.getSearchPage ( ).MyMeetings_filter.isEnabled ( ) );
                break;
            case "Unread Messages":
                Assert.assertTrue ( pages.getSearchPage ( ).UnreadMessages_filter.isDisplayed ( ) );
                Assert.assertTrue ( pages.getSearchPage ( ).UnreadMessages_filter.isEnabled ( ) );
                break;
        }

    }


    @When ( "I enter a given search {string} into the search bar" )
    public void iEnterAGivenSearchIntoTheSearchBar ( String term ) {
        pages.getSearchPage ().SearchBox.sendKeys ( term + Keys.ENTER );

    }

    @Then ( "the {string} should be displayed and enabled" )
    public void theGroupsShouldBeDisplayedAndEnabled ( String groups) {
        switch (groups) {
            case "Responsible":
                Assert.assertTrue ( pages.getSearchPage ( ).groupResponsible_button.isDisplayed ( ) );
                Assert.assertTrue ( pages.getSearchPage ( ).groupResponsible_button.isEnabled ( ) );
                break;
            case "Availability":
                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isDisplayed ( ) );
                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isEnabled ( ) );
                break;
            case "Privacy":
                Assert.assertTrue ( pages.getSearchPage ( ).groupPrivacy_button.isDisplayed ( ) );
                Assert.assertTrue ( pages.getSearchPage ( ).groupPrivacy_button.isEnabled ( ) );
                break;
//            case "Active":
//                Assert.assertTrue ( pages.getSearchPage ( ).CustomGroup_DropDown ( "Active" );
//                Assert.assertTrue ( pages.getSearchPage ( ).CustomGroup_DropDown ( "Active" );
//                break;
//            case "All Day":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isEnabled ( ) );
//                break;
//            case "Applicant":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupPrivacy_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupPrivacy_button.isEnabled ( ) );
//                break;
//            case "By day":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupResponsible_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupResponsible_button.isEnabled ( ) );
//                break;
//            case "Created by":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isEnabled ( ) );
//                break;
//            case "Created on":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupPrivacy_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupPrivacy_button.isEnabled ( ) );
//                break;
//            case "Date":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupResponsible_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupResponsible_button.isEnabled ( ) );
//                break;
//            case "Document Model":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isEnabled ( ) );
//                break;
//            case "Document Model Name":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupPrivacy_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupPrivacy_button.isEnabled ( ) );
//                break;
//            case "End Date":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupResponsible_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupResponsible_button.isEnabled ( ) );
//                break;
//            case "End Datetime":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isEnabled ( ) );
//                break;
//            case "Fri":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupPrivacy_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupPrivacy_button.isEnabled ( ) );
//                break;
//            case "Last Message Date":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupResponsible_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupResponsible_button.isEnabled ( ) );
//                break;
//            case "Last Updated by":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isEnabled ( ) );
//                break;
//            case "Last Updated on":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupPrivacy_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupPrivacy_button.isEnabled ( ) );
//                break;
//            case "Location":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupResponsible_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupResponsible_button.isEnabled ( ) );
//                break;
//            case "Meeting Subject":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isEnabled ( ) );
//                break;
//            case "Mon":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupPrivacy_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupPrivacy_button.isEnabled ( ) );
//                break;
//            case "Opportunity":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupResponsible_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupResponsible_button.isEnabled ( ) );
//                break;
//            case "Option":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isEnabled ( ) );
//                break;
//            case "Recurrence":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isEnabled ( ) );
//                break;
//            case "Recurrence Termination":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isEnabled ( ) );
//                break;
//            case "Recurrent":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isEnabled ( ) );
//                break;
//            case "Recurrent ID date":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isEnabled ( ) );
//                break;
//            case "Recurrent Rule":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isEnabled ( ) );
//                break;
//            case "Repeat Until":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isEnabled ( ) );
//                break;
//            case "Sat":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isEnabled ( ) );
//                break;
//            case "Show Time as":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isEnabled ( ) );
//                break;
//            case "Start":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isEnabled ( ) );
//                break;
//            case "Start Date":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isEnabled ( ) );
//                break;
//            case "Start DateTime":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isEnabled ( ) );
//                break;
//            case "Status":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isEnabled ( ) );
//                break;
//            case "Stop":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isEnabled ( ) );
//            case "Sun":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isEnabled ( ) );
//                break;
//            case "Thu":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isEnabled ( ) );
//                break;
//            case "Tue":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isEnabled ( ) );
//                break;
//            case "Wed":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isEnabled ( ) );
//                break;
//            case "Weekday":
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isDisplayed ( ) );
//                Assert.assertTrue ( pages.getSearchPage ( ).groupAvailability_button.isEnabled ( ) );
//                break;

        }

    }





    @When ( "the user clicks on the Advanced Search icon titled Group By and selects add custom groups" )
    public void theUserClicksOnTheAdvancedSearchIconTitledGroupByAndSelectsAddCustomGroups ( ) {
        pages.getSearchPage ().GroupBy_button.click ();
        pages.getSearchPage ().AddCustomDropDownGroup.click ();

    }

}

