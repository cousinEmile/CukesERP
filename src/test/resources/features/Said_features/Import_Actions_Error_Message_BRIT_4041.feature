Feature: 

	#User Story; 
	#
	# * As an inventory manager 2 should be able to do actions in import based module on list module 
	#
	#Acceptance Criteria;
	# * Verify that manager as a user should be able to choose at least one field.
	# * Verify that manager as a user should be able to double click the Test Import button
	# * Verify that manager as a user should be able to fail after double-clicking the Import button / negative test
	# * Verify that manager as a user should be able verify pop-up window
	# * Verify that for manager as a user "Odoo Client Error"  error messageis displayed in pop-up window
	# * Verify that for manager as a user "Please use the copy button to report the error to your support service."  error message is displayed in pop-up window
	# * Verify that manager as a user should be able to verify "Copy the full error to clipboard" button
	# * Verify that manager as a user should be able to click "Copy the full error to clipboard"
	# * Verify that manager as a user should be able to verify "see details" button
	# * Verify that manager as a user should be able to click "see details" button
	# * Verify that manager as a user should be able to verify "Uncaught event validate inappropriate in current state validating" message
	# * Verify that manager as a user should be able to verify "Ok" button
	# * Verify that manager as a user should be able to click "Ok" button
	@BRIT-4041
	Scenario: Cucumber - Calendar / Import actions Error message (Manager)
		# Pre-Condition: Environment is up and running
		
		    Given user on the First page
			When user clicks Brite Erp Demo
			Then Inventory Manager 2 logs in using "inm2@info.com" and "alsfuh7we68"
		    Then click Calendar icon on Headers
		    Then click list button
		    Then click Import button
		        
		    When the manager clicks to the Load File Button and input "C:\Users\saidy\IdeaProjects\Cukes_ERP\uploaded_files\utility.xlsx" 
		    And the manager clicks  "The first row contains the label of the column"   
		    
		    Then the manager should be able to see "Odoo Client Error" Message in pop-up window
		    Then the manager should be able to see "Please use the copy button to report the error to your support service." Message in pop-up window
		    
		    Then the manager should be able to see "Copy the full error to clipboard" button
		    And click "Copy the full error to clipboard" button
		       
		    Then the manager should be able to see "see details" button
		    When click "see details" button  
		    Then the manager should be able to see "Uncaught event settings_changed inappropriate in current state previewing" Message
		    
		    Then the manager should be able to see "Ok" button
		    When click "Ok" button  
		    Then Import page should be displayed with "actualTitle"
		    And url is  "http://52.39.162.23/web?#model=calendar.event&action=import"