Feature:

  @BRIT-4023
  Scenario Outline: BRIT-4023 Cucumber - Calendar / Import actions - Login (Manager && User)
   # Pre-Condition: Environment is up and running

    Given I open "http://52.39.162.23" url
    Then "Landing Page" Title should be displayed "Odoo"
    When "I" clicks "BriteErpDemo" button
    Then "Login Page" Title should be displayed "Login | Website localhost"
    When I log in as a "<username>" using "<email>" and "<password>"
    Then "Inbox Page" Title should be displayed "#Inbox - Odoo"
    And  Actual user Name should be displayed "<username>"

    Examples:
      | username               | email                           | password    |
      | InventoryManager 2     | inm2@info.com                   | alsfuh7we68 |
#      | InventoryUser4         | in_4@info.com                   | alsfuh7we74 |
#      | Lunch_Invoicing_User   | Lunch_Invoicing_User@info.com   | LD686gfX26  |
#      | Lunch_InvoicingManager | Lunch_InvoicingManager@info.com | LD686gfX22  |
#      | InventoryManager       | in@info.com                     | alsfuh7we67 |
#      | InventoryManager5      | inm5@info.com                   | trt332qWW12 |
#      | InventoryManager6      | inm6@info.com                   | trt332qWW13 |