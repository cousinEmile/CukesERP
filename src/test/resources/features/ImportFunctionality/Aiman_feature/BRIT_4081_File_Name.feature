@login
Feature: login functionality
  Scenario: Inventory Manager 2 login
    Given user on the login page
    When  Inventory Manager 2 logs in using "inm2@info.com" and "alsfuh7we68"
    Then homepage should be displayed
    And title should be "Odoo"
