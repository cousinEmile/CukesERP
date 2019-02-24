Feature:


  @BRIT-4094
  Scenario: Click SalesChannels &&  verify title
    Given I open "http://52.39.162.23" url
    When "I" clicks "BriteErpDemo" button
    Then I log in as a "EventsCRM_Manager" using "EventsCRM_Manager@info.com" and "Ugh45wQ12"

    When manager clicks SalesChannels button
    And "SalesChannels page" Title should be displayed "Sales Channels - Odoo"
		    
