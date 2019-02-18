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

    And manager clicks "Import on Calendar Page" button

    Then the manager should be able to see "Import" button
    When click Import button
    Then Import page should be displayed with "actualTitle"

    Given user on the First page
    When user clicks Brite Erp Demo
    Then Inventory Manager 2 logs in using "inm2@info.com" and "alsfuh7we68"
    Then click Calendar icon on Headers
    Then click List button

    Then the manager should be able to see "Import" button
    When click Import button
    Then Import page should be displayed with "actualTitle"