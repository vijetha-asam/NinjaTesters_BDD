Feature: Exploring the ArrayPage

Background:
Given user has logged to the application page
|username|password|
|komala|Koms@123|

@TC_A_01
  Scenario: Array module
    Given The user is in the Home page after login
    When user clicks Array Get Started button
    Then user redirected to array page
    @TC_A_02
    Scenario: Arrya in PYthon
    Given user on Array page
    When The user clicks Arrays in Python button
    Then The user clicks <Try Here> button in the Array Python 
    And  The user should be redirected to a page having an tryEditor with a Run button to test

@TC_A_03
  Scenario: Arrays Using List
    Given The user is in the Array page after logged in
    When The user clicks Arrays Using List button
    Then The user should be redirected to Arrays using List page
@TC_A_04
  Scenario: Applications of Array
    Given The user is in the Applications of Array page after logged in
    When The user clicks <Try Here> button in Arrays Using Lists page
    Then The user should be redirected to a page having an tryEditor with a Run button to test
@TC_A_05
  Scenario: Basic Operations in Lists
    Given The user is in the Array page after logged in
    When The user clicks Basic Operations in Lists button
    Then The user should be redirected to Basic Operations in List page
