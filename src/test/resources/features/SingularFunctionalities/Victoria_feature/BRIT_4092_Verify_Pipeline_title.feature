Feature:

  @BRIT-4092
  Scenario: Verify Pipeline & title

    Given I open "http://54.148.96.210/web/login" url
    Then I log in as a "EventsCRM_Manager" using "EventsCRM_Manager@info.com" and "Ugh45wQ12"
    And "Manager" clicks "CRM" button
    Then "Pipeline page" Title should be displayed "Pipeline - Odoo"


		    