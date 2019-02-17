Feature: 

	#User Story: 
	# * As an Inventory Manager 2, I should be able to do actions in import based module on list module
	#
	#Acceptance Criteria:
	# * Change back import option for default
  @BRIT-4077 @Calendar @Mclean
  Scenario: Cucumber - Calendar Import - Import by Default
  Scenario: Import by Default
    Given user on the Landing page
    When user clicks BriteErpDemo button
    Then Inventory Manager 2 logs in using "inm2@info.com" and "alsfuh7we68"

    When manager clicks Calendar icon on Headers
    Then manager should be able to see List button
    And manager clicks List button
    Then manager clicks Import button

    When manager should be able to click Load File Button and input "/uploaded_files/utility.xlsx" to the Upload line
    Then "utility.xlsx" should be displayed on the Input Line
    And manager should be able to see Map your columns to import Message

    Then manager clicks on Don't Import
    And manager should be able to see Active on the selective panel
    Then manager clicks on Active
    And click on x button to delete Active