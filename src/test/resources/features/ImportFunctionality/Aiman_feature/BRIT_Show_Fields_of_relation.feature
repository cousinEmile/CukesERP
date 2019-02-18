@Aiman
Feature:

  Scenario: Show fields of relation

    Given user on the Landing page
    When user clicks "BriteErpDemo" button
    Then Inventory Manager 2 logs in using "inm2@info.com" and "alsfuh7we68"
    Then manager clicks "Calendar" button
    Then manager clicks "List" button
    When manager clicks "Import on Calendar Page" button

    When manager sendKeys "/uploaded_files/utility.xlsx" in "Load File"
    Then "utility.xlsx" should be displayed on the Input Line
    And manager should be able to see "Map your columns to import" Message

    Then manager should be able to see Show fields of relation fields Checkbox
    And verify Checkbox Show fields of relation fields is selected by default
    Then manager clicks Show fields of relation fields Checkbox

