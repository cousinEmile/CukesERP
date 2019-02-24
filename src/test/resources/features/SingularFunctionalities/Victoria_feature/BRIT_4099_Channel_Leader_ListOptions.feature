Feature:


  @BRIT-4099
  Scenario:  Channel Leader list option
    Given I open "http://52.39.162.23" url
    When "I" clicks "BriteErpDemo" button
    Then I log in as a "EventsCRM_Manager" using "EventsCRM_Manager@info.com" and "Ugh45wQ12"



    When manager clicks SalesChannels button
    Then manager clicks Create button

    When manager clicks Channel leader dropdown
    Then manager should be to see list options

    And manager should be able to choose and click FistChannelOption
		    
		    