Feature: Register

  @register
  Scenario:
    Given I am on NopCommerce homepage
    When I click on register button
    Then I should be on register page
    When I enter all required details
    Then I should be able to register successfully
    And My result text should be correct
