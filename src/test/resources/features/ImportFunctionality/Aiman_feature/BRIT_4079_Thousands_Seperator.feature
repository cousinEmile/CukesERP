@BRIT-4079
Feature:

  Scenario: Thousands Seperator

    Given user on the Landing page
    When user clicks BriteErpDemo button
    Then Inventory Manager 2 logs in using "inm2@info.com" and "alsfuh7we68"

    When manager clicks Calendar icon on Headers
    Then manager should be able to see List button
    And manager clicks List button
    Then manager clicks Import button

    When manager should be able to click Load File Button and input "/uploaded_files/utility.xlsx" to the Upload line
    Then "utility.xlsx" should be displayed on the Input Line
    And manager should be able to see Map your columns to import Message