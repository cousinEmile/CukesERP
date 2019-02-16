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

    Given user on the Landing page
    When user clicks BriteErpDemo button
    Then Inventory Manager 2 logs in using "inm2@info.com" and "alsfuh7we68"
    Then manager clicks Calendar icon on Headers
    Then manager clicks List button
    When manager clicks Import button

    Then manager should be able to see Input line with "No file chosen..." by default
    And manager should be able to Type "/uploaded_files/utility.xlsx" to the Upload line - Fail
    Then manager should be able to see Uploaded file "utility.xlsx" - Fail