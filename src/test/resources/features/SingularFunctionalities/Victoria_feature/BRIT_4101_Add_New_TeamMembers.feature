Feature:


  @BRIT-4101
  Scenario: Add New TeamMembers

    Given I open "http://54.148.96.210/web/login" url
    Then I log in as a "EventsCRM_Manager" using "EventsCRM_Manager@info.com" and "Ugh45wQ12"
    And "Manager" clicks "CRM" button

    When "Manager" clicks "SalesChannels" button
    Then "Manager" clicks "Create" button

    When "Manager" clicks "Channel leader" on the selective panel
    Then "Manager" should be able to see "list options" Message
    And "Manager" clicks "first member" on the selective panel

    Then "Manager" enter new email Victoria@cybertek.com
    And "Manager" clicks "Add" button
		    
		     
		    
		    