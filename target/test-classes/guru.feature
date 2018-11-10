#Author: your.email@your.domain.com

@tag
Feature: To Test Login functionality
  @tag1
  Scenario: Verify the login with valid credentials
    Given The user is in gurulogin page 
    When The user enters valid username and  passwword and click submit
    And The user clicks the submit button
    Then The user should  be in managers home page