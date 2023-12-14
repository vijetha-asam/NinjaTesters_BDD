Feature: Test login functionality
@TC_L_01
  Scenario: Check login is successful with valid credentials
    Given browser is home page
    When click on getstart button
    Then user redirected to home page
   @TC_L_02 
    Scenario: user on login page
    Given user on the home page
    When user clicks on sign in
    #And user enters <username> and <password>
   Then user clicks on loginpage
    

     
      | username | password |
      | komala   | Koms@123 |
   
