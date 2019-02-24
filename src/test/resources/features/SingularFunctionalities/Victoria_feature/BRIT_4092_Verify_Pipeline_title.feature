Feature:


  @BRIT-4092
  Scenario: Verify Pipeline & title


    Given I open "http://52.39.162.23" url
    When "I" clicks "BriteErpDemo" button
    Then I log in as a "EventsCRM_Manager" using "EventsCRM_Manager@info.com" and "Ugh45wQ12"
    And "Pipeline page" Title should be displayed "Pipeline - Odoo"


		    