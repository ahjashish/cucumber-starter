Feature: Registration on the Website

  Scenario: Register new pets

    Given I am on the "New Pet" page
    When I press "Register"
    Then I should go to the "Register" page