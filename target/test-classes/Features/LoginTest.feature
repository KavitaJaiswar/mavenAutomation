#Author: shisatos@yopmail.com
#Keywords Summary : Logi test with couple of login valid / invalid scenarios


Feature: Login functionality with valid / invalid scenarios

Background:
	  Given User open browser
    And User launch application
    And User click on submit button
	
  Scenario: Successful login when user enter valid credentials
    When User enter valid credentails
    And User click on submit button
    Then User validate home page redirection
    And User validate username at top corner
    And User logs out and close browser
    
  Scenario Outline: Successful login for multiple type of users
    When User enter valid username as "<username>" and password as "<password>"
    And User click on submit button
    Then User validate home page redirection
    And User validate username at top corner
    And User logs out and close browser

    Examples: 
      | username   | password   | 
      | Admin      | admin123   | 
      | HR         | admin123   | 
      | Account    | admin123   | 
      | Employe    | admin123   | 
