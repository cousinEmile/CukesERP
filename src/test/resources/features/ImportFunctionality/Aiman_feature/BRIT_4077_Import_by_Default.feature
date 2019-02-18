Feature: 

	#User Story: 
	# * As an Inventory Manager 2, I should be able to do actions in import based module on list module
	#
	#Acceptance Criteria:
	# * Change back import option for default
  @BRIT-4077 @Calendar @Mclean
  Scenario: Cucumber - Calendar Import - Import by Default

  Scenario: Cucumber - Calendar / Import actions - Import Icon (Manager)

    Given user on the Landing page
    When user clicks "BriteErpDemo" button
    Then Inventory Manager 2 logs in using "inm2@info.com" and "alsfuh7we68"

    When manager clicks "Calendar" button
    Then manager should be able to see "List" button
    And manager clicks "List" button
    Then manager clicks "Import on Calendar Page" button

    When manager sendKeys "/uploaded_files/utility.xlsx" in "Load File"
    Then "utility.xlsx" should be displayed on the Input Line
    And manager should be able to see "Map your columns to import" Message
    Then manager clicks "Don't Import" button
    And manager should be able to see "Active" button
    Then manager clicks "Active" button
    And manager clicks "x button to delete Active" button