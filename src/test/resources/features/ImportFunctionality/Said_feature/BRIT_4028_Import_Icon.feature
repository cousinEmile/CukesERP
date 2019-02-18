Feature: 

	#User Story: 
	# * As an Inventory Manager 2, I should be able to do actions in import based module on list module
	#
	#Acceptance Criteria:
	# * Change back import option for default
  @BRIT-4028 @Calendar @Mclean
  Scenario: Cucumber - Calendar / Import actions - Import Icon (Manager)

    Given user on the Landing page
    When user clicks "BriteErpDemo" button
    Then Inventory Manager 2 logs in using "inm2@info.com" and "alsfuh7we68"
    When manager clicks "Calendar" button
    And manager clicks "List" button
    Then manager should be able to see "Import" button
    When manager clicks "Import on Calendar Page" button
    Then "Import page" Title should be displayed "Import a File - Odoo"