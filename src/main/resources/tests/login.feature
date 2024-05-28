@regressionPack
Feature: Log in
  Scenario: Log-in in the app
    Given open application
    When user open log in form
    And user complete username
    And user complete password
    And user click Log in button
    Then app should display entered username on Welcome tab

    Scenario: Log-out in the app
      Given open application
      When user open log in form
      And user complete username
      And user complete password
      And user click Log in button
      And app should display entered username on Welcome tab
      Then user log out in the app

  Scenario: Buy phone in the store
    Given open application
    When user select produce
    And user add to card produce
    And user check alert message
    And user confirm alert message
    And navigate to the cart
    Then produce should be in the cart