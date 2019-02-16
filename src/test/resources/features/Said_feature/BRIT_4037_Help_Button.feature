Feature: 

	#User Story; 
	#
	# * As an inventory manager 2 should be able to do actions in import based module on list module 
	#
	#Acceptance Criteria;
	# * Verify that manager should be able to verify and click Help button
  @BRIT-4037
  Scenario: Cucumber - Calendar / Import actions - Help button (Manager)
		# Pre-Condition: Environment is up and running.

    Given user on the First page
    When user clicks Brite Erp Demo
    Then Inventory Manager 2 logs in using "inm2@info.com" and "alsfuh7we68"
    Then click Calendar icon on Headers
    Then click list button
    Then click Import button

    And the manager should be able to see "Help" button
    When the manager clicks Help button

    Then Help page should be displayed with "actualTitle"
    And url is  "https://www.odoo.com/documentation/user/11.0/general/base_import/import_faq.html"
    Then the manager should be able to see "How to import data into Odoo" Message