Feature:


  @BRIT-4100
  Scenario: Email Alias

    Given I open "http://54.148.96.210/web/login" url
    Then I log in as a "EventsCRM_Manager" using "EventsCRM_Manager@info.com" and "Ugh45wQ12"
    And "Manager" clicks "CRM" button

    When "Manager" clicks "SalesChannels" button
    Then "Manager" clicks "Create" button

    And "Manager" should be able to write and to see "own Email" Message
		    
		     
		    
		    