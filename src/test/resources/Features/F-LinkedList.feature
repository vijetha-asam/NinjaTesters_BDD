Feature: Exploring the LinkedList Page

  Background: 
    Given the user has logged to the application 
      | username | password |
      | komala   | Koms@123 |

  @TC_LL_01
  Scenario: home pafe
    Given user on the home page
    Then user clicks Linked List get started button

  @TC_LL_02
  Scenario: On Inroduction
    Given The user is in the Linked List  page after logged in
    When The user clicks Introduction button
    And The user clicks <Try Here> button
    Then The user should be redirected to a page having an tryEditor with Run button to test

  @TC_LL_03
  Scenario: On Linked List  page
    Given The user is in the Linked List  page after logged in
    When The user clicks the Creating a Linked List button
    And The user clicks <Try Here> button
    Then  user should be redirected to a page having an tryEditor with  Run button to test

  @TC_LL_04
  Scenario: Types of Linked List
    Given The user is in the Linked List  page after logged in
    When The user clicks the Types of Linked List button
    And The user clicks <Try Here> button
    Then The user should  redirected to a page having an tryEditor with  Run button to test

  @TC_LL_05
  Scenario: Implement Linked List
    Given The user is in the Linked List  page after logged in
    When The user clicks the Implement Linked List in Python button
    And The user clicks <Try Here> button
    Then The user should be redirected to  page having an tryEditor with  Run button to test

  @TC_LL_06
  Scenario: Traversal
    Given The user is in the Linked List  page after logged in
    When The user clicks the Traversal button
    And The user clicks <Try Here> button
    Then The user should be redirected to a page having  tryEditor with  Run button to test

  @TC_LL_07
  Scenario: Insertion
    Given The user is in the Linked List  page after logged in
    When The user clicks the Insertion button
    And The user clicks <Try Here> button
    Then  user should be redirected to  page having an tryEditor with  Run button to test

  @TC_LL_08
  Scenario: Deletion
    Given The user is in the Linked List  page after logged in
    When The user clicks the Deletion button
    And The user clicks <Try Here> button
    Then The user should  redirected to a page having an tryEditor with  Run button to test
