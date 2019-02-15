Feature: 

	#User Story; 
	#
	# * As an inventory manager 2 should be able to do actions in import based module on list module 
	#
	#Acceptance Criteria;
	# * Verify that manager should be able to click Load File button and chose file to load
  @BRIT-4035
  Scenario: Cucumber - Calendar / Import actions - Loading File (Manager)
		# Pre-Condition: Environment is up and running.

    Given user on the First page
    When user clicks Brite Erp Demo
    Then Inventory Manager 2 logs in using "inm2@info.com" and "alsfuh7we68"
    Then click Calendar icon on Headers
    Then click list button
    Then click Import button

    When the manager should be able to click Load File Button and input "C:\Users\saidy\IdeaProjects\Cukes_ERP\uploaded_files\utility.xlsx" to the Upload line
    Then the "utility.xlsx" should be displayed on the Input Line
    And the "Map your columns to import" message should be displayed
		