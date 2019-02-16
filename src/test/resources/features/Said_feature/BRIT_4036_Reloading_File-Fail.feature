Feature: 

	#User Story; 
	#
	# * As an inventory manager 2 should be able to do actions in import based module on list module 
	#
	#Acceptance Criteria;
	# * Verify that manager should be able to click Reload File and Reload file. which is not working
  @BRIT-4036
  Scenario: Cucumber - Calendar / Import actions - Reloading File, FAIL (Manager)
		# Pre-Condition: Environment is up and running.

    Given user on the First page
    When user clicks Brite Erp Demo
    Then Inventory Manager 2 logs in using "inm2@info.com" and "alsfuh7we68"
    Then click Calendar icon on Headers
    Then click list button
    Then click Import button

    When the manager click to the Load File Button and input "C:\Users\saidy\IdeaProjects\Cukes_ERP\uploaded_files\utility.xlsx"

    Then the manager should be able to see "Reload File" button
    And  click to the Reload File Button and input "C:\Users\saidy\IdeaProjects\Cukes_ERP\uploaded_files\EmployeesTestData.xlsx" to the Upload line
