Feature: Queue module page functionality

Background:
Given user has logged to the applicationpage
|username|password|
|komala|Koms@123|
 
  
  Scenario: Locate the Queue module firstqueue link
    Given user on Queue page
    When when user the clicks the Implementation of Queue in Python link
    And user clicks try here 
    Then  validate the python editor code 
    And click the run button and check  output
    
  Scenario: Locate the Queue module secondqueue link
    Given user on the Queue page
    When when user the clicks the Implementation using collections.deque link
    And user clicks try here
    Then  validate the python editor code 
    And click the run button and check  output
    
  Scenario: Locate the Queue module thirdqueue link
     Given the user on Queue page
    When when user the clicks the Implementation using array link
    And user clicks try here 
    Then  validate the python editor code 
    And click the run button and check  output
    
  Scenario: Locate the Queue module fourthqueue link
     Given user on Queue page application
    When when user the clicks the Queue Operations link
    And user clicks try here
    Then  validate the python editor code 
    And click the run button and check  output
    
   
