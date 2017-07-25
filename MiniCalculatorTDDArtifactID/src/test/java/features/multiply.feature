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
@tag
Feature: Testing caculatero for additon

  Background: 
    Given I am in calculator page "http://localhost/test/calculator.html"

  @tag1
  Scenario: Multiplying two small posetive number
   When I multiply "6" by  "6"
   Then I should get output= "36"

  @tag3
  Scenario Outline: check multiplicaion of two numbers 
    When I multiply <a> by  <c>
    Then I should get output= <result>

    Examples: 
      | a | c | result |
      | 5 | 7 |     35 |
      | 6 | 7 |     42 |
      | 5 | 0 |      0 |
      | 1 | 2 |      2 |
      | 5 | 3 |     15 |
      | 5 | 4 |     20 |
      
      
      
