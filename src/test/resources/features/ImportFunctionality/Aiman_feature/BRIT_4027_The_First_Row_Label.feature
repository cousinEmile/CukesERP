Feature: 

	#User Story: 
	# * As an Inventory Manager 2, I should be able to do actions in import based module on list module
	#
	#Acceptance Criteria:
	# *  Verify that "The first row contains the label of the column" displayed and clickable
  @BRIT-4027 @Calendar @Mclean
  Scenario: Cucumber - Calendar Import -The first row contains the label of the column
  Scenario: The first row contains the label of the column

    Given user on the Landing page
    When user clicks BriteErpDemo button
    Then Inventory Manager 2 logs in using "inm2@info.com" and "alsfuh7we68"

    When manager clicks Calendar icon on Headers
    Then Calendar page Title should be displayed "Meetings - Odoo"

    Then manager should be able to see List button
    And manager clicks List button
    Then List page Title should be displayed "Meetings - Odoo"

    Then manager clicks Import button
    Then Import page Title should be displayed "Import a File - Odoo"

    When manager should be able to click Load File Button and input "/uploaded_files/utility.xlsx" to the Upload line
    Then "utility.xlsx" should be displayed on the Input Line
    And manager should be able to see Map your columns to import Message

    Then manager should be able to see The first row contains the label of the column Checkbox
    And verify Checkbox The first row contains the label of the column is selected by default
    Then manager clicks The first row contains the label of the column Checkbox
		