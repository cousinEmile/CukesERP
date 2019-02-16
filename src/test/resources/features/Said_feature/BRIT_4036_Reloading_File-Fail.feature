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
    When user clicks BriteErpDemo button
    Then Inventory Manager 2 logs in using "inm2@info.com" and "alsfuh7we68"
    Then manager clicks Calendar icon on Headers
    Then manager clicks List button
    When manager clicks Import button

    When manager clicks to the Load File Button and input "C:\Users\saidy\IdeaProjects\Cukes_ERP\uploaded_files\utility.xlsx"

    Then manager should be able to see reload file "Reload File" button
    And  manager clicks to the Reload File Button and input "C:\Users\saidy\IdeaProjects\Cukes_ERP\uploaded_files\EmployeesTestData.xlsx" to the Upload line
