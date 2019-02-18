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

    Given I open "http://52.39.162.23" url
    When "I" clicks "BriteErpDemo" button
    Then I log in as a "Inventory Manager 2" using "inm2@info.com" and "alsfuh7we68"
    Then "Manager" clicks "Calendar" button
    Then "Manager" clicks "List" button
    When "Manager" clicks "Import on Calendar Page" button

    Then "Manager" should be able to see "No file chosen..." message by default in "Input line"
    And "Manager" sendKeys "/uploaded_files/utility.xlsx" in "Input line"
    But "utility.xlsx" should be displayed on the Input Line
#    fail
