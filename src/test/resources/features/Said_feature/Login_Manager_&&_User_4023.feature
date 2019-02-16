Feature:


  @BRIT-4023 @Said
  Scenario Outline: BRIT-4023 Cucumber - Calendar / Import actions - Login (Manager && User)
   # Pre-Condition: Environment is up and running

    Given user on the First page
    Then First page Title should be displayed "Odoo"
    When user clicks Brite Erp Demo
    Then Login page Title should be displayed "Login | Website localhost"
    When "<user>" logs in using "<email>" and "<password>"
    Then Inbox page should be displayed with "#Inbox - Odoo"
    And "<user>" name should be "<actualUser>"

    Examples:
      | user               | email         | password    | actualUser         |
      | InventoryManager 2 | inm2@info.com | alsfuh7we68 | InventoryManager 2 |
      | InventoryUser4     | in_4@info.com | alsfuh7we74 | InventoryUser4     |