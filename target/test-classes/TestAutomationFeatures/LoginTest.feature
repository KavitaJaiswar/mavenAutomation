

Feature: Login functionality with valid / invalid scenarios
 
  Scenario: Successful login when user enter valid credentials
    Given I open browser
    And I launch application
    When I enter valid credentails
    And I click on submit button
    Then I validate home page redirection URL
    And I validate  new page contains expected text
    And I logs out and close browser

 