Feature: 

	#User Story; 
	#
	# * As an inventory manager 2 should be able to do actions in import based module on list module 
	#
	#Acceptance Criteria;
	# * Verify that manager should be able to click list icon
  @BRIT-4025
  Scenario: Cucumber - Calendar / Import actions - List Icon (Manager)
		# Pre-Condition: Environment is up and running.

    Given user on the Landing page
    When user clicks BriteErpDemo button
    Then Inventory Manager 2 logs in using "inm2@info.com" and "alsfuh7we68"

    When manager clicks Calendar icon on Headers
    Then Calendar page Title should be displayed "Meetings - Odoo"

    When hover to the List option on the right top corner
    Then manager should be able to see List button
    And manager clicks List button
    Then List page Title should be displayed "Meetings - Odoo"
    And url is "http://52.39.162.23/web?#view_type=list&model=calendar.event&menu_id=120&action=136"


