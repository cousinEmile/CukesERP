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

    Given user on the Landing page
    When user clicks "BriteErpDemo" button
    Then Inventory Manager 2 logs in using "inm2@info.com" and "alsfuh7we68"
    Then manager clicks "Calendar" button
    Then manager clicks "List" button
    When manager clicks "Import on Calendar Page" button

    When manager sendKeys "/uploaded_files/utility.xlsx" in "Load File"

    Then manager should be able to see "Reload File" button
    And  manager sendKeys "C:\Users\saidy\IdeaProjects\Cukes_ERP\uploaded_files\EmployeesTestData.xlsx" in "Reload File"
