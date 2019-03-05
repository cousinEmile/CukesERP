Feature:


  @BRIT-4103
  Scenario: Cancel button

    Given I open "http://54.148.96.210/web/login" url
    Then I log in as a "EventsCRM_Manager" using "EventsCRM_Manager@info.com" and "Ugh45wQ12"
    And "Manager" clicks "CRM" button

    When "Manager" clicks "SalesChannels CRM" button
    Then "SalesChannels page" Title should be displayed "Sales Channels - Odoo"

    When "Manager" clicks "Import CRM" button
    And "Import page" Title should be displayed "Import a File - Odoo"

    Then "Manager" clicks "Cancel CRM" button
    And "SalesChannels page" Title should be displayed "Sales Channels - Odoo"
		    
		    
		     
		    
		    