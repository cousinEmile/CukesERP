Feature: 

	#User Story; 
	#
	# * As an inventory manager 2 should be able to do actions in import based module on list module 
	#
	#Acceptance Criteria;
	# * Verify that manager as a user should be able to verify the Cancel button near Meetings / Import a File.
	# * Verify that manager as a user should be able to click the Cancel button
  @BRIT-4040
  Scenario: Cucumber - Calendar / Import actions - Cancel Button (Manager)
		        # Pre-Condition: Environment is up and running

    Given user on the First page
    When user clicks BriteErpDemo button
    Then Inventory Manager 2 logs in using "inm2@info.com" and "alsfuh7we68"
    Then manager clicks Calendar icon on Headers
    Then manager clicks List button
    When manager clicks Import button

    When manager clicks to the Load File Button and input "C:\Users\saidy\IdeaProjects\Cukes_ERP\uploaded_files\utility.xlsx"
    Then manager should be able to see "Cancel" button
    And manager clicks Cancel button

    Then List page Title should be displayed with "Meetings - Odoo"
    And url is "http://52.39.162.23/web?#view_type=list&model=calendar.event&menu_id=120&action=136"