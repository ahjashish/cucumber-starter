Feature: Registration on the Website

  Background: Add keywords to the list
    Given "Register Multiple Pets" is added to the list

  Scenario: Register new pets

    Given I am on the "New Pet" page
    When I press "Register"
    Then I should go to the "Register" page

  Scenario Outline: Register new pets on the website
    Given I am on the <Source Page> page
    When I press <Button>
    Then I should go to the <Destination Page> page
    Examples:
      | Source Page  | Button        | Destination Page      |
      | "Newer Pets" | "Submit"      | "Register Newer Pets" |
      | "Old Pets"   | "Submit Pets" | "Register Old Pets"   |

  @Single
  Scenario: Register Multiple Pets
    Given I am on the "Register" page
    When I try to register multiple pets
      | Pets | Dog | Cat | Panda |
    And I press "Register"
    Then I should go to the "Register Multiple Pets" page

  Scenario: Register Multiple Pets
    Given I am on the "Register" page
    When I try to register multiple pets with names
      | Pets | Name   |
      | Dog  | Sandy  |
      | Cat  | Minima |
    And I press "Register"
    Then I should go to the "Register Multiple Pets" page