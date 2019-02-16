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
    When user clicks BriteErpDemo button
    Then Inventory Manager 2 logs in using "inm2@info.com" and "alsfuh7we68"
    Then manager clicks Calendar icon on Headers
    Then manager clicks List button
    When manager clicks Import button

    When manager should be able to click Load File Button and input "C:\Users\saidy\IdeaProjects\Cukes_ERP\uploaded_files\utility.xlsx" to the Upload line
    Then "utility.xlsx" should be displayed on the Input Line
    And "Map your columns to import" message should be displayed
		