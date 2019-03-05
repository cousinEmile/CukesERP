Feature:


  @BRIT-4094
  Scenario: Click SalesChannels &&  verify title

    Given I open "http://54.148.96.210/web/login" url
    Then I log in as a "EventsCRM_Manager" using "EventsCRM_Manager@info.com" and "Ugh45wQ12"
    And "Manager" clicks "CRM" button

    When "Manager" clicks "SalesChannels" button
    And "SalesChannels page" Title should be displayed "Sales Channels - Odoo"
		    
