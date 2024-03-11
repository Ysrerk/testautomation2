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
Feature: Orange web site login and log out test with true credentials

  Background: Orange web site login with correct credentials
    Given Orn user navigate the login page
    When orn user enter username and password
    And orn user click the login  button
    Then orn navigate the homepage and see the Dashboard title

  Scenario: Testing clik the log out option
    When orn user clik the image
    Then orn user click the logout option

  @sauce
  Scenario: Testing clik the log outproductsik the image
    Then orn user click the products
