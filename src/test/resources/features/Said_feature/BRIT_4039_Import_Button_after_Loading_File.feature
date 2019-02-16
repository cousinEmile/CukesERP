Feature: 

	#User Story; 
	#
	# * As an inventory manager 2 should be able to do actions in import based module on list module 
	#
	#Acceptance Criteria;
	# * Verify that manager as a user should be able to verify the Import button.
	# * Verify that manager as a user should be able to click the Import button
	# * Verify that manager as a user should be able to fail after clicking the Import button / negative test
	# * Verify that for manager as a user error message is displayed
  @BRIT-4039
  Scenario: Cucumber - Calendar / Import actions - Import Button after Loading File (Manager)
	   # Pre-Condition: Environment is up and running

    Given user on the First page
    When user clicks BriteErpDemo button
    Then Inventory Manager 2 logs in using "inm2@info.com" and "alsfuh7we68"
    Then manager clicks Calendar icon on Headers
    Then manager clicks List button
    When manager clicks Import button

    When manager clicks to the Load File Button and input "C:\Users\saidy\IdeaProjects\Cukes_ERP\uploaded_files\utility.xlsx"
    Then manager should be able to see "Import" button
    And manager clicks Import button
    Then manager should be able to see "You must configure at least one field to import" Message
		        
		      