Feature: 

	#User Story; 
	#
	# * As an inventory manager 2 should be able to do actions in import based module on list module 
	#
	#Acceptance Criteria;
	# * Verify that manager should be able to click Import under Meetings on the List page and go to import a File page
  @BRIT-4028
  Scenario: Cucumber - Calendar / Import actions - Import Icon (Manager)
		# Pre-Condition: Environment is up and running.

    Given user on the First page
    When user clicks Brite Erp Demo
    Then Inventory Manager 2 logs in using "inm2@info.com" and "alsfuh7we68"
    Then click Calendar icon on Headers
    Then click List button

    Then the manager should be able to see "Import" button
    When click Import button
    Then Import page should be displayed with "actualTitle"