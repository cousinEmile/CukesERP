Feature: 

	#User Story: 
	# * As an Inventory Manager 2, I should be able to do actions in import based module on list module
	#
	#Acceptance Criteria:
	# * Verify that Options for Decimal Separator should be displayed and selective
  @BRIT-4079 @Calendar @Mclean
  Scenario: Cucumber - Calendar Import - Thousands Separator

    Given I open "http://52.39.162.23" url
    When "I" clicks "BriteErpDemo" button
    Then I log in as a "Inventory Manager 2" using "inm2@info.com" and "alsfuh7we68"
    Then "Manager" clicks "Calendar" button
    Then "Manager" clicks "List" button
    When "Manager" clicks "Import on Calendar Page" button

    When "Manager" sendKeys "/uploaded_files/utility.xlsx" in "Load File"
    Then "utility.xlsx" should be displayed on the Input Line
    And "Manager" should be able to see "Thousands Separator" field

    When "Manager" clicks "Thousands Separator" select button
    Then "Manager" should be able to see "Dot"
    And "Manager" clicks "Dot" on the selective panel
		