#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
#Author: your.email@your.domain.com

@tag
Feature: To Test Login functionality
  @tag1
  Scenario: Verify the login with valid credentials
    Given The user is in gurulogin page 
    When The user enters valid username and  passwword and click submit
    And The user clicks the submit button
    Then The user should  be in managers home page