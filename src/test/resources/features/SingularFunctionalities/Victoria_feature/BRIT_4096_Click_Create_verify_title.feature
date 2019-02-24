Feature:


  @BRIT-4096
  Scenario: Click Create &&  verify title
    Given I open "http://52.39.162.23" url
    When "I" clicks "BriteErpDemo" button
    Then I log in as a "EventsCRM_Manager" using "EventsCRM_Manager@info.com" and "Ugh45wQ12"


    When manager clicks SalesChannels button
    Then manager clicks Create button
    And "Createbutton page" Title should be displayed "New - Odoo"
    Then manager clicks Discard button
		    