Feature:


  @BRIT-4104
  Scenario: Save Button
    Given I open "http://52.39.162.23" url
    When "I" clicks "BriteErpDemo" button
    Then I log in as a "EventsCRM_Manager" using "EventsCRM_Manager@info.com" and "Ugh45wQ12"

    When manager clicks SalesChannels button
    Then manager clicks Create button
    When "Manager" sendKeys "Victoria" in "SalesTeam Name"
    Then manager clicks Save button
		    
		    
		     
		    
		    