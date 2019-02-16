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
    When user clicks BriteErpDemo button
    Then Inventory Manager 2 logs in using "inm2@info.com" and "alsfuh7we68"
    Then manager clicks Calendar icon on Headers
    Then manager clicks List button
    When manager clicks Import button

    And manager should be able to see "Help" button
    When manager clicks Help button

    Then Help page Title should be displayed "How to import data into Odoo"
    And url is "https://www.odoo.com/documentation/user/11.0/general/base_import/import_faq.html"
    Then manager should be able to see how to import data into odoo "How to import data into Odoo" Message