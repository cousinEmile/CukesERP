Feature:


  @BRIT-4032
  Scenario: Cucumber - Calendar / Import actions - Headers (Manager)
   # Pre-Condition: Environment is up and running

    Given user on the Landing page
    When user clicks "BriteErpDemo" button
    And Inventory Manager 2 logs in using "inm2@info.com" and "alsfuh7we68"
    Then manager should be able to see following Headers:
      | Discuss     |
      | Calendar    |
      | Notes       |
      | Contacts    |
      | Website     |
      | Inventory   |
      | Repairs     |
      | Invoicing   |
      | Employees   |
      | Leaves      |
      | Expenses    |
      | Maintenance |
      | Dashboards  |