Feature: 

	#User Story; 
	#
	# * As an inventory manager 2 should be able to do actions in import based module on list module 
	#
	#Acceptance Criteria;
	# * Verify that manager should be able to type folder and file name on Input line for importing file  / Fail
  @BRIT-4034
  Scenario: Cucumber - Calendar / Import actions - Input line, FAIL (Manager)
		# Pre-Condition: Environment is up and running.

    Given user on the First page
    When user clicks Brite Erp Demo
    Then Inventory Manager 2 logs in using "inm2@info.com" and "alsfuh7we68"
    Then click Calendar icon on Headers
    Then click list button
    When click Import button

    Then the manager should be able to see Input line with "no file chosen..." by default
    And the manager should be able to Type "C:\Users\saidy\IdeaProjects\Cukes_ERP\uploaded_files\utility.xlsx" to the Upload line - Fail
    Then the manager should be able to see Uploaded file "utility.xlsx" - Fail