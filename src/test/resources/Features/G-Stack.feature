Feature: Stack module page functionality

Background:
Given THE user has logged on application
|username|password|
|komala|Koms@123|
	@tc01
  Scenario: Locate the Stack module firststack  link
    Given user on Stack page
    When when user the clicks the operations in stack link
    And user clicks try here button
    Then validate the python editor code
    And click  run button and check the output
    
    Scenario: Locate the Stack module secondstack  link
    Given user on Stack page
    When when user the clicks the implementation link
    And user clicks try here button
    Then validate the python editor code
    And click  run button and check the output
    
    Scenario: Locate the Stack module thirdstack  link
    Given user on Stack page
    When when user the clicks the applications link
    And user clicks try here button
    Then validate the python editor code
    And click  run button and check the output
    
   