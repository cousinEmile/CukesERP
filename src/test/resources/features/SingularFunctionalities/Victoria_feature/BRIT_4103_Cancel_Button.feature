Feature:


  @BRIT-4103
  Scenario: Cancel button
    Given I open "http://52.39.162.23" url
    When "I" clicks "BriteErpDemo" button
    Then I log in as a "EventsCRM_Manager" using "EventsCRM_Manager@info.com" and "Ugh45wQ12"
    And "manager" clicks "CRM" button

    When "manager" clicks "SalesChannels CRM" button
    Then "SalesChannels page" Title should be displayed "Sales Channels - Odoo"

    When manager clicks Import CRM button
    And "Import page" Title should be displayed "Import a File - Odoo"

    Then manager clicks Cancel CRM Button
    And "SalesChannels page" Title should be displayed "Sales Channels - Odoo"
		    
		    
		     
		    
		    