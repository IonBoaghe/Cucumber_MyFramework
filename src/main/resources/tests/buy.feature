

Feature: Buy item
  @regressionPack
  Scenario: Buy phone in the store
    Given open application
    When user select produce
    And user add to card produce
    And user check alert message
    And user confirm alert message
    And navigate to the cart
    Then produce should be in the cart



