@BRIT-4078
Feature:

  Scenario: End Date

    Given user on the First page
    When user clicks BriteErpDemo button
    Then Inventory Manager 2 logs in using "inm2@info.com" and "alsfuh7we68"

    When manager clicks Calendar icon on Headers
    Then Calendar page Title should be displayed "Meetings - Odoo"

    When hover to the "List" option on the right top corner
    Then manager should be able to see list "List" button
    And manager clicks List button
    Then List page Title should be displayed "Meetings - Odoo"

    Then manager clicks Import button
    Then Import page Title should be displayed "Import a File - Odoo"