Feature:


  @BRIT-4097
  Scenario: Click Import &&  verify title

    Given I open "http://54.148.96.210/web/login" url
    Then I log in as a "EventsCRM_Manager" using "EventsCRM_Manager@info.com" and "Ugh45wQ12"
    And "Manager" clicks "CRM" button

    When "Manager" clicks "SalesChannels" button
    Then "Manager" clicks "Import" button
    And "Importbutton page" Title should be displayed "Import a file - Odoo"
		    
		    