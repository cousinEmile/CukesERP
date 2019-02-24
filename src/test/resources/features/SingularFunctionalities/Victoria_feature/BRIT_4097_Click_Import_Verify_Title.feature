Feature:


  @BRIT-4097
  Scenario: Click Import &&  verify title
    Given I open "http://52.39.162.23" url
    When "I" clicks "BriteErpDemo" button
    Then I log in as a "EventsCRM_Manager" using "EventsCRM_Manager@info.com" and "Ugh45wQ12"


    When manager clicks SalesChannels button
    Then manager clicks Import button
    And "Importbutton page" Title should be displayed "Import a file - Odoo"
		    
		    