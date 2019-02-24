Feature:


  @BRIT-4140
  Scenario: Save Button NegativeTest
    Given I open "http://52.39.162.23" url
    When "I" clicks "BriteErpDemo" button
    Then I log in as a "EventsCRM_Manager" using "EventsCRM_Manager@info.com" and "Ugh45wQ12"

    When manager clicks SalesChannels button
    Then manager clicks Create button
    And manager type's "" on SalesTeam Name input line
    When manager clicks Save button appear popUp window
		    
		    
		     
		    
		    