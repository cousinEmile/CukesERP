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

    Given user on the Landing page
    When user clicks BriteErpDemo button
    Then Inventory Manager 2 logs in using "inm2@info.com" and "alsfuh7we68"
    Then manager clicks Calendar icon on Headers
    Then manager clicks List button

    Then manager should be able to see Import button
    When manager clicks Import button
    Then Import page Title should be displayed "Import a File - Odoo"